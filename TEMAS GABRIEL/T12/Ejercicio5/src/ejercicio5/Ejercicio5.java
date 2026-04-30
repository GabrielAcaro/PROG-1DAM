package ejercicio5;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejercicio5
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio5 {
    
    // Metodo que muestra el menu del programa
    
    public static void menu() {
        System.out.println("Introudzca uno de estos numero para usar el programa:");
            System.out.println("Añadir nuevo contacto a agenda: 1)");
            System.out.println("Mostrar agenda: 2)");
            System.out.println("Salir del programa: 0)");
    }
    
    // Scanner global
    
    public static String scanner() {
        Scanner entry = new Scanner(System.in);
        
        return entry.nextLine();
    }
    
    // Metodo que crea el fichero agenda.txt y almacena contactos
    
    public static void crearAgenda(ArrayList<Contacto> agenda){
        // Declaracion de variables
    
        FileWriter fw = null;
        PrintWriter pw = null;
        
        try {
            // Abrimos el fichero en modo append (true) para no borrar los datos anteriores
            fw = new FileWriter("agenda.txt", true);
            pw = new PrintWriter(fw);
        
            // Obtenemos el ultimo contacto añadido y lo escribimos en el fichero
            
            Contacto c = agenda.get(agenda.size() - 1);
            
            pw.println("Nombre: " + c.getNombre());
            pw.println("Edad: " + c.getEdad());
            pw.println("Telefono: " + c.getNumeroTelefono());
            pw.println("---"); // Separador entre contactos
            
            System.out.println("Contacto guardado correctamente en agenda.txt\n"); // Damos feedback
            
        } catch (IOException e) { // Si hay un error al abrir o escribir el fichero lo capturamos
            System.out.println("Error de entrada/salida");
            System.out.println(e.getMessage());
        } finally { // Cerramos los flujos siempre, haya error o no
            if (pw != null) {
                pw.close();
            }
        }
    }
    
    // Metodo que añade un contacto y lo almacena
    
    public static void addContacto(ArrayList<Contacto> agenda) {
        // Declaracion de variables
        
        Contacto c = new Contacto();
        String nombre = "";
        int edad = 0,numeroTelefono = 0;
        
        System.out.println("Introduzca el nombre del nuevo contacto:");
        nombre = scanner(); // Pedimos el nombre al user
        
        System.out.println("Introduzca la edad del nuevo contacto:");
        edad = Integer.parseInt(scanner()); // Pedimos la edad al user
        
        System.out.println("Introduzca el numero de telefono del nuevo contacto:");
        numeroTelefono = Integer.parseInt(scanner()); // Pedimos el numero de telefono al user
        
        // Introducimos los datos del user al objeto auxiliar
        
        c.setNombre(nombre);
        c.setEdad(edad);
        c.setNumeroTelefono(numeroTelefono);
        
        // Añadimos el objeto auxiliar a la lista de contactos
        agenda.add(c);
        
        // Llamamos al metodo que crea el fichero con el nuevo contacto
        crearAgenda(agenda);
    }
    
    // Metodo que lee el fichero agenda.txt
    
    public static void leerAgenda() {
        
        // Declaracion de variables
        String linea = "";
        FileReader fr = null;
        BufferedReader br = null;
        
        try {
            fr = new FileReader("agenda.txt");
            br = new BufferedReader(fr);
            
            // Leemos el fichero linea a linea hasta que no haya mas lineas
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) { // Si no se encuentra el fichero lo capturamos
            System.err.println("No se encontro el fichero!");
            System.out.println(e.getMessage());
        } catch (IOException e) { // Si hay un error al abrir o leer el fichero lo capturamos
            System.out.println("Error de entrada/salida");
            System.out.println(e.getMessage());
            
        } finally { // Cerramos los flujos siempre, haya error o no
            try {
                if (br != null) br.close();
                if (fr != null) fr.close();
            } catch (IOException e) {
                System.err.println("Error al cerrar el fichero!");
                System.out.println(e.getMessage());
            }
        }
    }
    
    // Comienzo del metodo main
    
    public static void main(String[] args) {
        
        // Declaracion de variables
        
        ArrayList<Contacto> agenda = new ArrayList<>();
        int userOption = 0;
        
        // Comienzo del menu del programa
        
        do {
            menu();
            userOption = Integer.parseInt(scanner());
            
            switch (userOption) {
                case 1 -> {
                    addContacto(agenda);
                }
                case 2 -> {
                    leerAgenda();
                }
                case 0 -> {
                    System.out.println("Saliendo del programa...");
                    System.out.println("Saliste del programa correctamente.");
                }
                default -> {
                    System.err.println("Introduzca un numero entre el 0 y el 2!");
                }
            }
        } while(userOption != 0);
    }
}
