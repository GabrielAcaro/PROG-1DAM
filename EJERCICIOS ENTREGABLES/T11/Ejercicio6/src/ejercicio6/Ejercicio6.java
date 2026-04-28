package ejercicio6;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Ejercicio6
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio6 {
    
    //Menu del programa
    
    public static void menu() {
        System.out.println("Introduzca uno de estos numeros para usar el programa:");
            System.out.println("Añadir donacion: 1)");
            System.out.println("Mostrar donaciones: 2)");
            System.out.println("Mostrar donaciones por nombre de donante: 3)");
            System.out.println("Mostrar numero de donaciones: 4)");
            System.out.println("Mostrar el total del dinero recaudado: 5)");
            System.out.println("Ordenar donaciones: 6)");
            System.out.println("Salir del programa: 7)\n");
    }
    
    // Scanner global
    
    public static String scanner() {
        Scanner entry = new Scanner(System.in);
        
        return entry.nextLine();
    }
    
    // Metodo para añadir donaciones nuevas
    
    public static void addDonacion(HashSet<Donacion> donaciones) {
        // Inicializamos las variables
        Donacion d = new Donacion();
        String nombre = "";
        double cantidadDonada = 0;
        
        // Pedimos los datos
        
        System.out.println("Introduzca el nombre del donante:");
        nombre = scanner(); 
        
        System.out.println("Introduzca la cantidad de dinero donado:");
        cantidadDonada = Double.parseDouble(scanner());
        
        // Añadimos al conjunto de donaciones los datos 
        
        d.setNombre(nombre);
        d.setDonacion(cantidadDonada);
        
        donaciones.add(d);
    }
    
    // Metodo para mostrar el conjunto de donaciones
    
    public static void showDonaciones(HashSet<Donacion> donaciones) {
        
        // Recorremos el conjunto con un for each y mostramos la informacion
        
        for (Donacion elem : donaciones) {
            System.out.println("Nombre de la donacion: " + elem.getNombre());
            System.out.println("Cantidad donada: " + elem.getDonacion() + " €");
            System.out.println("");
        }
    }
    
    // Metodo para buscar una donacion a partir de un nombre
    
    public static void buscarDonacion(HashSet<Donacion> donaciones) {
        
        // Inicializamos variables
        
        Iterator<Donacion> it = donaciones.iterator();
        Donacion d = new Donacion();
        boolean encontrado = false;
        String nombreDonante = "";
        int i = 0;
        
        // Pedimos el nombre del donante a buscar
        
        System.out.println("Introduzca el nombre de la persona que donó:");
        nombreDonante = scanner();
        
        // Recorremos el conjunto de donaciones y paramos cuando se encuentre el donante
        while (i < donaciones.size() && !encontrado) {
            // Uso un iterador para obtener el nombre de los donantes
            while(it.hasNext() && !encontrado) {
                d = it.next();
                
                // Si el nombre del donante del usuario coincide con alguno del conjunto, mostramos su donacion
                if (nombreDonante.equals(d.getNombre())){
                    System.out.println("Donante: " + d.getNombre());
                    System.out.println("Cantidad donada: " + d.getDonacion() + "\n");
                    encontrado = true;
                }
            }
            i++;
        }
        // Si no se encuentra damos feedback
        if (!encontrado) {
                System.out.println("No se encontro al donante que buscas\n");
            }
    }
    
    // Metodo que cuenta el numero total de donaciones que se han realizado
    
    public static void numeroDonaciones(HashSet<Donacion> donaciones) {
        int contador = 0;
        
        // Recorremos el conjunto y por cada iteracion contamos 
        
        for (Donacion d : donaciones) {
            contador++;
        }
        
        // Mostramos la cantidad de donaciones
        
        System.out.println("El numero de donaciones es: " + contador);
    }
    
    // Metodo para ver el total del dinero recaudado
    
    public static void totalDineroRecaudado(HashSet<Donacion> donaciones) {
        double dinero = 0;
        
        // Recorremos el conjunto
        for (Donacion d : donaciones) {
            dinero += d.getDonacion(); // Obtenemos el dinero y lo sumamos en una variable
        }
        
        // Mostramos el dinero donado total
        
        System.out.println("La cantidad de dinero donado es: " + dinero + " €\n");
    }
    
    // Metodo que ordena de mayor a menor el dinero de las donaciones
    
    public static void ordenarDonaciones(HashSet<Donacion> donaciones) {
        Donacion[] listaOrdenada = new Donacion[donaciones.size()];
        int index = 0;

        // Pasamos el HashSet al vector
        for (Donacion d : donaciones) {
            listaOrdenada[index] = d;
            index++;
        }
        
        // Recorremos el vector a partir de la segunda donacion
        for (int i = 1; i < listaOrdenada.length; i++) {
            Donacion actual = listaOrdenada[i];
            int j = i - 1; 
            // Mientras que la donacion anterior sea menor que la actual
            while (j >= 0 && listaOrdenada[j].getDonacion() < actual.getDonacion()) { 
                listaOrdenada[j + 1] = listaOrdenada[j]; // Intercambiamos los objetos
                j--;
            }
            listaOrdenada[j + 1] = actual;
        }
        // Mostramos el vector ordenado
        
        System.out.println("Donaciones ordenadas de mayor a menor:");
        
        for (int i = 0; i < listaOrdenada.length; i++) {
            System.out.println("Nombre: " + listaOrdenada[i].getNombre());
            System.out.println("Cantidad: " + listaOrdenada[i].getDonacion() + " €\n");
        }
    }
    
    public static void main(String[] args) {
        // Inicializamos el conjunto y las variables que usaremos
        
        HashSet<Donacion> donaciones = new HashSet<>();
        int userOption = 0;
        
        // Comienzo del menu del programa
        
        do {
            menu();
            userOption = Integer.parseInt(scanner());
            
            switch (userOption) {
                case 1 -> {
                    addDonacion(donaciones);
                }
                case 2 -> {
                    showDonaciones(donaciones);
                }
                case 3 -> {
                    buscarDonacion(donaciones);
                }
                case 4 -> {
                    numeroDonaciones(donaciones);
                }
                case 5 -> {
                    totalDineroRecaudado(donaciones);
                }
                case 6 -> {
                    ordenarDonaciones(donaciones);
                }
                case 7 -> {
                    System.out.println("Saliendo del programa...");
                    System.out.println("Saliste correctamente del programa.");
                }
                default -> {
                    System.err.println("Introduzca un numero entre el 1 y el 7!\n");
                }
            }
            
        }while (userOption != 7); // Mientras que el usuario no pulse 7 no cerramos el programa
    }
}
