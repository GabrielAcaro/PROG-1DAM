package ejercicio3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Ejercicio3
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio3 {
    public static void menu() {
        System.out.println("Introduzca un numero de los siguientes para usar el programa:");
            System.out.println("Añadir datos de un nuevo autobus: 1)");
            System.out.println("Aparcar autobus: 2)");
            System.out.println("Mostrar dársenas libres: 3)");
            System.out.println("Buscar autobús: 4)");
            System.out.println("Buscar conductor: 5)");
            System.out.println("Autobus con mas conductores asignados: 6)");
            System.out.println("Salir del programa: 7)");
    }
    
    public static String scanner() {
        Scanner entry = new Scanner(System.in);
        
        return entry.nextLine();
    }
    
    public static ArrayList<Autobus> añadirBus(ArrayList<Autobus> listaAutobuses) {
        HashMap<String,String> conductores = new HashMap<>();
        String matricula = "", dni = "",nombreConductor = "";
        int respuestaUser = 0;
        
        System.out.println("Introduzca la matricula del autobus:");
        matricula = scanner();
        
        while (respuestaUser != 2) {
            System.out.println("Introduzca el nombre del conductor:");
            nombreConductor = scanner();
             
            System.out.println("Introduzca el DNI del conductor:");
            dni = scanner();
            
            conductores.put(dni, nombreConductor);
            
            System.out.println("¿Desea añadir otro conductor al autobus?");
            System.out.println("Pulse 1 si desea añadir uno nuevo");
            System.out.println("Pulse 2 para salir");
            respuestaUser = Integer.parseInt(scanner());
        }
        
        Autobus a = new Autobus(matricula, conductores);
        listaAutobuses.add(a);
        
        return listaAutobuses;
    }
    
    public static int comprobarMatricula(String matricula, ArrayList<Autobus> listaAutobuses) {
        int index = 0, i = 0;
        boolean encontrado = false;
        
        while (i < listaAutobuses.size() && encontrado)
            if (listaAutobuses.get(i).getMatricula() == matricula) {
                index = i;
                encontrado = true;
            } else {
                encontrado = false;
                index = -1;
        }
        
        return index;
    }
    
    public static Autobus[] aparcar(Autobus[] aparcamiento, ArrayList<Autobus> listaAutobuses) {
        String matricula = "";
        int userOption = 0, i = 0, indexBus = comprobarMatricula(matricula, listaAutobuses);
        boolean todoOcupado = true, matriculaCoincide = false, aparcado = false;
        
        System.out.println("Indica la matricula del autobus a aparcar:");
        matricula = scanner();
            
        if ( indexBus == -1) {
            System.err.println("No se encontro la matricula en la lista de autobuses!");
            matriculaCoincide = false;
        } else {
            while (i < listaAutobuses.size() && aparcado) {
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
        if (todoOcupado) {
            System.out.println("Todas las darsenas estan ocupadas!");
        }
        
        return aparcamiento;
    }
    
    public static void mostrarDarsenasLibres(Autobus[] aparcamiento) {
        boolean todoOcupado = true;
        
        for (int i = 0; i < aparcamiento.length; i++) {
            if (aparcamiento[i] == null) {
                System.out.println("La darsena numero " + i + " esta libre.");
                todoOcupado = false;
            }
        }
        
        if (todoOcupado) {
            System.out.println("Todas las darsenas estan ocupadas!");
        }
    }
    
    public static void buscarAutobus(Autobus[] aparcamiento, ArrayList<Autobus> listaAutobuses) {
        String matricula = "";
        int i = 0, darsena = 0, indexBus = comprobarMatricula(matricula, listaAutobuses);
        boolean darsenaEncontrada = false;
        
        while(i < aparcamiento.length && darsenaEncontrada) {
            if (aparcamiento[i].getMatricula() == listaAutobuses.get(indexBus).getMatricula()) {
                darsena = i;
            }
            i++;
        }
        
        System.out.println("Indica la matricula del autobus a buscar:");
        matricula = scanner();
            
        if ( indexBus == -1) {
            System.err.println("No se encontro la matricula en la lista de autobuses!");
        } else {
            System.out.println("El autobus se encuentra en la darsena numero " + darsena
                    + "\nMatricula del autobus: " + matricula 
                    + "\nLos conductores del autobus son: \n" + listaAutobuses.get(indexBus).getConductores());
        }
        
        
    }
    
    public static void main(String[] args) {
        ArrayList<Autobus> listaAutobuses = new ArrayList<>();
        Autobus[] aparcamiento = new Autobus[5];
        int userOption = 0;
        
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
                    System.out.println("\nSaliendo del programa...");
                    System.out.println("Saliste del programa correctamente");
                }
                default -> {
                    System.err.println("\nIntroduzca un numero entre el 1 y el 5!\n");
                }
            }
        } while(userOption != 5);
    }

}
