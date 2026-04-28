package ejercicio3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Ejercicio3
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio3 {
    
    // Comienzo del metodo que muestra el menu del programa
    
    public static void menu() {
        System.out.println("Introduzca un numero de los siguientes para usar el programa:");
            System.out.println("Añadir datos de un nuevo autobus: 1)");
            System.out.println("Aparcar autobus: 2)");
            System.out.println("Mostrar dársenas libres: 3)");
            System.out.println("Buscar autobús: 4)");
            System.out.println("Buscar conductor: 5)");
            System.out.println("Autobus con mas conductores asignados: 6)");
            System.out.println("Salir del programa: 0)");
    }
    
    // Metodo de scanner global
    
    public static String scanner() {
        Scanner entry = new Scanner(System.in);
        
        return entry.nextLine();
    }
    
    // Metodo que añade un autobus
    
    public static void añadirBus(ArrayList<Autobus> listaAutobuses) {
        
        // Declaracion de variables
        
        HashMap<String,String> conductores = new HashMap<>();
        String matricula = "", dni = "",nombreConductor = "";
        int respuestaUser = 0;
        
        System.out.println("Introduzca la matricula del autobus:");
        matricula = scanner(); // Pedimos la matricula al user
        
        while (respuestaUser != 2) { // Pedimos conductores al user hasta que no quiera añadir mas
            System.out.println("Introduzca el nombre del conductor:");
            nombreConductor = scanner(); // Pedimos el nombre del conductor
             
            System.out.println("Introduzca el DNI del conductor:");
            dni = scanner(); // Pedimos el DNI del conductor
            
            System.out.println("¿Desea añadir otro conductor al autobus?");
            System.out.println("Pulse 1 si desea añadir uno nuevo");
            System.out.println("Pulse 2 para salir");
            respuestaUser = Integer.parseInt(scanner()); // Pedimos la respuesta al user
            
            conductores.put(dni, nombreConductor); // Introducimos los datos al HashMap auxiliar
        }
        
        Autobus a = new Autobus(matricula, conductores); // Creamos e inicializamos un autobus con los datos del user
        listaAutobuses.add(a); // Añadimos el objeto auxiliar a la lista de autobuses
    }
    
    // Comienzo del metodo que combrueba si la matricula existe en la lista de autobuses
    public static int comprobarMatricula(String matricula, ArrayList<Autobus> listaAutobuses) {
        // Declaracion de variables
        int index = -1, i = 0;
        boolean encontrado = false;
        
        // Recorremos la lista de autobuses y si coincide la matricula paramos de buscar
        while (i < listaAutobuses.size() && !encontrado) { 
            if (listaAutobuses.get(i).getMatricula().equals(matricula)) {
                index = i;
                encontrado = true;
            }
            
            i++;
        }
        return index; // Devolvemos la posicion de l ArrayList donde se encuentra la matricula
    }
    
    // Metodo que aparca un autobus en el aparcamiento
    
    public static void aparcar(Autobus[] aparcamiento, ArrayList<Autobus> listaAutobuses) {
        
        // Declaracion de variables
        
        String matricula = "";
        int userOption = 0, i = 0, indexBus = 0;
        boolean todoOcupado = true, aparcado = false;
        
        System.out.println("Indica la matricula del autobus a aparcar:");
        matricula = scanner(); // Pedimos la matricula al user y comprobamos si existe en la lista
        indexBus = comprobarMatricula(matricula, listaAutobuses);
            
        if ( indexBus == -1) { // Si no se encuentra la matricula damos feedback
            System.err.println("No se encontro la matricula en la lista de autobuses!");
        } else {
            // Pedimos la darsena al user hasta que encuentre una libre o no haya ninguna
            while (i < listaAutobuses.size() && !aparcado) {
                System.out.println("Introduzca un numero del 0 al 5 para aparcar el autobus:\n");
                userOption = Integer.parseInt(scanner());
        
                if (aparcamiento[userOption] != null) {
                    System.out.println("Este aparcamiento esta ocupado!");
                    aparcado = false;
                    i++;
                } else {
                    aparcamiento[userOption] = listaAutobuses.get(indexBus);
                    todoOcupado = false;
                    aparcado = true;
                    System.out.println("Has aparcado correctamente el autobus en el aparcamiento " + (userOption) + ".");
                }
            }
        }
        if (todoOcupado) { // Si esta todo ocupado damos feedback
            System.out.println("Todas las darsenas estan ocupadas!");
        }
    }
    
    // Metodo que muestra las darsenas libres del aparcamiento
    
    public static void mostrarDarsenasLibres(Autobus[] aparcamiento) {
        
        // Declaracion de variables
        
        boolean todoOcupado = true;
        
        // Recorremos el aparcamiento y mostramos las darsenas libres
        
        for (int i = 0; i < aparcamiento.length; i++) {
            if (aparcamiento[i] == null) {
                System.out.println("La darsena numero " + i + " esta libre.");
                todoOcupado = false;
            }
        }
        
        if (todoOcupado) { // Si esta todo ocupado damos feedback
            System.out.println("Todas las darsenas estan ocupadas!");
        }
    }
    
    // Metodo que busca un autobus a partir de su matricula y muestra su informacion
    
    public static void buscarAutobus(Autobus[] aparcamiento, ArrayList<Autobus> listaAutobuses) {
        
        // Declaracion de variables
        
        String matricula = "";
        int i = 0, darsena = -1, indexBus = 0;
        boolean darsenaEncontrada = false;
        
        System.out.println("Indica la matricula del autobus a buscar:");
        matricula = scanner(); // Pedimos la matricula al user y comprobamos si existe en la lista
        indexBus = comprobarMatricula(matricula, listaAutobuses);
        
        if (indexBus == -1) {
            System.err.println("No se encontro la matricula en la lista de autobuses!");
        } else {
            // Recorremos el aparcamiento hasta encontrar el autobus o llegar al final
            while (i < aparcamiento.length && !darsenaEncontrada) {
                if (aparcamiento[i] != null && aparcamiento[i].getMatricula().equals(listaAutobuses.get(indexBus).getMatricula())) {
                    darsena = i;
                    darsenaEncontrada = true;
                }
                i++;
            }
            // Si el autobus no esta aparcado en ninguna darsena damos feedback
            if (darsena == -1) {
                System.err.println("El autobus no esta aparcado en ninguna darsena!");
            } else { // Si esta aparcado mostramos su informacion
                System.out.println("El autobus se encuentra en la darsena numero " + darsena
                        + "\nMatricula del autobus: " + matricula);
                
                // Recorremos el HashMap y mostramos los datos de cada conductor
                System.out.println("\nConductores:");
                for (String dni : listaAutobuses.get(indexBus).getConductores().keySet()) {
                    System.out.println("DNI: " + dni);
                    System.out.println("Nombre: " + listaAutobuses.get(indexBus).getConductores().get(dni) + "\n");
                }
            }
        }
    }
    
    // Metodo que busca un conductor y muestra la matricula del autobus que tiene asignado

    public static void buscarConductor(Autobus[] aparcamiento) {
        // Declaracion de variables
        String dniUser = "";
        boolean encontrado = false;
        int i = 0;

        // Pedimos el DNI del conductor a buscar
        System.out.println("Introduzca el DNI del conductor a buscar:");
        dniUser = scanner();

        // Recorremos el aparcamiento hasta encontrar el conductor o llegar al final
        while (i < aparcamiento.length && !encontrado) {
            if (aparcamiento[i] != null && aparcamiento[i].getConductores().containsKey(dniUser)) {
                System.out.println("Conductor encontrado!");
                System.out.println("Nombre: " + aparcamiento[i].getConductores().get(dniUser));
                System.out.println("Matricula del autobus asignado: " + aparcamiento[i].getMatricula() + "\n");
                encontrado = true;
            }
            i++;
        }

        // Si no se encuentra damos feedback
        if (!encontrado) {
            System.err.println("No se encontro ningun conductor con ese DNI\n");
        }
    }

    // Metodo que retorna la posicion del autobus con mas conductores asignados

    public static void autobusMasConductores(Autobus[] aparcamiento) {
        // Declaracion de variables
        int maxConductores = 0, posicion = -1, i = 0;

        // Recorremos el aparcamiento buscando el autobus con mas conductores
        while (i < aparcamiento.length) {
            if (aparcamiento[i] != null && aparcamiento[i].getConductores().size() > maxConductores) {
                maxConductores = aparcamiento[i].getConductores().size();
                posicion = i;
            }
            i++;
        }

        // Mostramos el resultado
        if (posicion == -1) {
            System.out.println("No hay ningun autobus aparcado!\n");
        } else {
            System.out.println("El autobus con mas conductores esta en la darsena: " + posicion);
            System.out.println("Matricula: " + aparcamiento[posicion].getMatricula());
            System.out.println("Numero de conductores: " + maxConductores + "\n");
        }
    }
    
    // Comienzo del metodo main
    
    public static void main(String[] args) {
        
        // Declaracion de variables
        
        ArrayList<Autobus> listaAutobuses = new ArrayList<>();
        Autobus[] aparcamiento = new Autobus[6];
        int userOption = 0;
        
        // Comienzo del menu del programa
        
        do {
            menu();
            
            try {
                userOption = Integer.parseInt(scanner());
            } catch (NumberFormatException e) {
                userOption = -1;
            }
            
            switch(userOption) {
                case 1 -> {
                    añadirBus(listaAutobuses);
                }
                
                case 2 -> {
                    aparcar(aparcamiento, listaAutobuses);
                }
                
                case 3 -> {
                    mostrarDarsenasLibres(aparcamiento);
                }
                
                case 4 -> {
                    buscarAutobus(aparcamiento, listaAutobuses);
                }
                
                case 5 -> {
                    buscarConductor(aparcamiento);
                }
                
                case 6 -> {
                    autobusMasConductores(aparcamiento);
                }
                
                case 0 -> {
                    System.out.println("\nSaliendo del programa...");
                    System.out.println("Saliste del programa correctamente");
                }
                
                default -> {
                    System.err.println("\nIntroduzca un numero entre el 1 y el 5!\n");
                }
            }
        } while(userOption != 0);
    }
}
