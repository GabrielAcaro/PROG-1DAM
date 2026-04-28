package ejercicio8;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Ejercicio8
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio8 {
    
    // Menu del programa
    
    public static void menu() {
        System.out.println("Introduzca una de estas opciones para usar el programa:");
            System.out.println("Añadir ciudad: 1)");
            System.out.println("Mostrar ciudades y sedes: 2)");
            System.out.println("Mostrar sedes con ingresos anuales superiores a la media: 3)");
            System.out.println("Buscar por nombre de sede: 4)");
            System.out.println("Añadir Sede: 5)");
            System.out.println("Mostrar sedes ordenadas de mayor a menor numero de ingresos: 6)");
            System.out.println("Salir del programa: 0)");
    }
    
    // Scanner global
    
    public static String scanner() {
        Scanner entry = new Scanner(System.in);
        
        return entry.nextLine();
    }
    
    public static void addCiudad(ArrayList<Ciudad> listaCiudades){
        // Declaramos las variables
        HashSet<Sede> conjuntoSedes = new HashSet<>();
        Ciudad c = new Ciudad();
        String nombreCiudad = "", nombreSede = "";
        double ingresosSede = 0;
        int respuestaUser = 0;
        
        System.out.println("Nombre de la ciudad:");
        nombreCiudad = scanner(); // Pedimos el nombre de la ciudad
        
        System.out.println("Para añadir la ciudad añada las sedes adheridas a dicha ciudad:\n");
        
        do {
            // DEclaramos el objeto auxiliar
            Sede s = new Sede();
            
            System.out.println("Nombre de la sede:");
            nombreSede = scanner(); // Pedimos el nombre de la sede
            
            System.out.println("Ingresos de la sede:");
            ingresosSede = Double.parseDouble(scanner()); // Pedimos los ingresos de la sede
            
            System.out.println("Desea añadir mas sedes?");
            System.out.println("Si: 1)");
            System.out.println("No: 2)");
            respuestaUser = Integer.parseInt(scanner()); // Pedimos la respuesta al user
            
            // Usamos un objeto auxiliar para introducir los datos del usuario al conjunto de Sedes
            s.setNombre(nombreSede);
            s.setIngresos(ingresosSede);
            
            conjuntoSedes.add(s); // Añadimos el objeto al conjunto
        } while (respuestaUser != 2); // Mientras que el user no pulse dos se ejecuta el codigo del do
        
        // Añadimos el conjunto de sedes al objeto Ciudad auxiliar
        
        c.setNombre(nombreCiudad);
        c.setConjuntoSedes(conjuntoSedes);
        
        // Añadimos el objeto auxiliar a la lista de ciudades
        listaCiudades.add(c);
    }
    
    public static void showCiudades(ArrayList<Ciudad> listaCiudades) {
        for(Ciudad c : listaCiudades) { // Recorremos con for each el arrayList y mostramos la informacion
            System.out.println("Nombre de la ciudad: " + c.getNombre());
            System.out.println("Sedes:");
            for (Sede s : c.getConjuntoSedes()) { // Recorremos con for each el conjunto de sedes y mostramos la informacion
                System.out.println("Nombre sede: " + s.getNombre());
                System.out.println("Ingresos: " + s.getIngresos() + "\n");
            }
        }
    }
    
    public static void showSedesIngresosSuperioresMedia(ArrayList<Ciudad> listaCiudades) {
        // Declaramos las variables
        int contadorSedes = 0;
        double media = 0, totalIngresos = 0;
        
        // Calculamos la media
        for(Ciudad c : listaCiudades) { // Recorremos el ArrayList
            for (Sede s : c.getConjuntoSedes()) { // Recorremos el conjunto de sedes
               totalIngresos += s.getIngresos(); // Calculamos la suma de todos los ingresos
               contadorSedes++; // Vemos cuantas sedes hay en total
            }
        }
        
        media = totalIngresos / contadorSedes; // Calculamos la media
        System.out.println("Media: " + media + "\n"); // Mostramos la media para tenerlo en cuenta
        
        for(Ciudad c : listaCiudades) { 
            for (Sede s : c.getConjuntoSedes()) {
               if (s.getIngresos() > media) { // Si los ingresos de la sede superan la media los mostramos
                   System.out.println("Sedes con ingresos superiores a la media:");
                   System.out.println("Nombre sede: " + s.getNombre());
                   System.out.println("Ingresos: " + s.getIngresos() + "\n");
               }
            }
        }
    }
    
    public static void buscarByNombreSede(ArrayList<Ciudad> listaCiudades) {
        // Declaramos las variables
        
        String nombreSedeUser = "", nombreSede = "";
        boolean encontrado = false;
        int i = 0;
        
        System.out.println("Introduzca el nombre de la sede a busacar: ");
        nombreSedeUser = scanner(); // Pedimos la sede a buscar al user
        
        // Buscamos hasta recorrer por completo la lista y si encontramos dejamos de buscar
        
            Iterator<Ciudad> itCiudades = listaCiudades.iterator();
            
            while (itCiudades.hasNext() && !encontrado) {
            Ciudad c = itCiudades.next();
            Iterator<Sede> itSedes = c.getConjuntoSedes().iterator();

            while (itSedes.hasNext() && !encontrado) {
                Sede s = itSedes.next();

                if (s.getNombre().equals(nombreSedeUser)) {
                    System.out.println("Sede encontrada!\n");
                    System.out.println("Ciudad: " + c.getNombre());
                    System.out.println("Nombre sede: " + s.getNombre());
                    System.out.println("Ingresos: " + s.getIngresos() + "\n");
                    encontrado = true;
                }
            }
        }
        if (!encontrado) { // Si no coincide con nada damos feedback
            System.out.println("No se encontro la sede en la lista de ciudades");
        }
    }
    
    public static void addSede(ArrayList<Ciudad> listaCiudades) {
        
        // Declaramos las variables
        Sede s = new Sede();
        String nombreCiudadUser = "", nombreSede = "";
        boolean ciudadEncontrada = false;
        double ingresosSede = 0;
        int index = 0;
        
        // Comprobamos si el ArrayList esta vacio
        if (listaCiudades.isEmpty()) { // Si esta vacio creamos una ciudad llamando a addCiudad y damos feedback
            System.out.println("No hay ciudades en la lista.");
            System.err.println("Añada una ciudad primero!\n");
            addCiudad(listaCiudades);
        } else { // Si contiene ciudades el metodo continua
            String[] listaNombreCiudades = new String[listaCiudades.size()]; // Creamos un vector de nombres de ciudades
        
            System.out.println("Lista de ciudades disponibles:");
        
            for (int i = 0; i < listaCiudades.size(); i++) { // Mostramos al user las ciudades que puede introducir
                System.out.println(listaCiudades.get(i).getNombre());
                listaNombreCiudades[i] = listaCiudades.get(i).getNombre(); // Introducimos al vector los nombres de ciudades
            }
        
            do { // Pedimos la ciudad al user hasta que coincida con una de las de la lista
                System.out.println("Introduzca el nombre de la ciudad en la que incluir la nueva sede: ");
                nombreCiudadUser = scanner(); // Pedimos al usuario la ciudad en la que introducir la nueva sede
            
                for (int i = 0; i < listaNombreCiudades.length; i++) { // Recorremos el ArrayList
                    
                    // Comprobamos si coinciden los nombres de la ciudad
                    if (!nombreCiudadUser.equals(listaNombreCiudades[i])){ 
                        System.err.println("El nombre de la ciudad no existe!");
                        ciudadEncontrada = false;
                    } else { // Si coincide termina el bucle
                        index = i; // Guardamos la posicion de la ciudad
                        ciudadEncontrada= true;
                    }
                }
            } while (!ciudadEncontrada);
        
            System.out.println("Introduzca el nombre de la sede:");
            nombreSede = scanner(); // Pedimos el nombre de la sede a incluir
        
            System.out.println("Introduzca los ingresos anuales de la sede:");
            ingresosSede = Double.parseDouble(scanner()); // Pedimos los ingresos de la sede
            
            // Añadimos los datos al objeto auxiliar
            s.setNombre(nombreSede);
            s.setIngresos(ingresosSede);
            
            // Añadimos el objeto al conjunto de sedes de la ciudad que el usuario seleccionó
            listaCiudades.get(index).getConjuntoSedes().add(s);
        }
    }
    
    public static void showSedesOrdenadasByIngresos(ArrayList<Ciudad> listaCiudades) {
        Sede[] sedesOrdenadas = new Sede[0];
        int index = 0;
        
        for (Ciudad c : listaCiudades) { // Recorremos el ArrayList
            for (Sede s : c.getConjuntoSedes()) { // Recorremos el conjunto de sedes

                // Creamos un nuevo vector con una posicion mas
                Sede[] vectorSede = new Sede[sedesOrdenadas.length + 1];

                // Buscamos la posicion correcta donde insertar la sede
                index = 0;
                while (index < sedesOrdenadas.length && sedesOrdenadas[index].getIngresos() > s.getIngresos()) {
                    index++;
                }

                // Copiamos los elementos anteriores a la posicion
                for (int i = 0; i < index; i++) {
                    vectorSede[i] = sedesOrdenadas[i];
                }

                // Insertamos la sede en su posicion correcta
                vectorSede[index] = s;

                // Copiamos los elementos posteriores a la posicion
                for (int i = index; i < sedesOrdenadas.length; i++) {
                    vectorSede[i + 1] = sedesOrdenadas[i];
                }

                sedesOrdenadas = vectorSede;
            }
        }
        // Mostramos las sedes ordenadas
        
        System.out.println("Sedes ordenadas de mayor a menor ingresos:");
        
        for (Sede s : sedesOrdenadas) {
            System.out.println("Nombre sede: " + s.getNombre());
            System.out.println("Ingresos: " + s.getIngresos() + "\n");
        }
    }
    
    public static void main(String[] args) {
        // Inicializamos el conjunto y las variables que usaremos
        
        ArrayList<Ciudad> listaCiudades = new ArrayList<>();
        int userOption = 0;
        
        // Comienzo del menu del programa
        
        do {
            menu();
            userOption = Integer.parseInt(scanner());
            
            switch (userOption) {
                case 1 -> {
                    addCiudad(listaCiudades);
                }
                case 2 -> {
                    showCiudades(listaCiudades);
                }
                case 3 -> {
                    showSedesIngresosSuperioresMedia(listaCiudades);
                }
                case 4 -> {
                    buscarByNombreSede(listaCiudades);
                }
                case 5 -> {
                    addSede(listaCiudades);
                }
                case 6 -> {
                    showSedesOrdenadasByIngresos(listaCiudades);
                }
                case 0 -> {
                    System.out.println("Saliendo del programa...");
                    System.out.println("Saliste correctamente del programa.");
                }
                default -> {
                    System.err.println("Introduzca un numero entre el 0 y el 6!\n");
                }
            }
            
        }while (userOption != 0); // Mientras que el usuario no pulse 0 no cerramos el programa
    }

}
