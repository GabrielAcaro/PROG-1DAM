package practicara5;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * PracticaRA5
 * @author Gabriel Acaro Sánchez
 */
public class PracticaRA5 {
    
    // Comienzo del menu del programa
    
    public static void menu() {
        System.out.println("Introduzca uno de estos numeros para usar el programa:");
            System.out.println("Rellenar inventario: 1)");
            System.out.println("Guardar datos del inventario en un fichero: 2)");
            System.out.println("Leer y procesar los datos del inventario: 3)");
            System.out.println("Salir del programa: 0)");
    }
    
    // Comienzo del metodo scanner global
    
    public static String scanner() {
        Scanner entry = new Scanner(System.in);
        
        return entry.nextLine();
    }
    
    // Comienzo del metodo que rellena el inventario
    
    public static void rellenarInventario(ArrayList<Producto> inventario) {
        
        // Inicializacion de variables
        String nombre = "";
        int cantidad = 0, respuestaUser;
        double precio = 0;
        
        // Comienzo del bucle en el que pedimos al user que introduzca productos al ArrayList
        do {
            Producto p = new Producto();
            System.out.println("Introduzca el nombre del producto: ");
            nombre = scanner(); // Pedimos el nombre
        
            System.out.println("Introduzca la cantidad del producto disponible:");
            cantidad = Integer.parseInt(scanner()); // Pedimos la cantidad de productos
        
            System.out.println("Introduzca el precio del producto:");
            precio = Double.parseDouble(scanner()); // Pedimos el precio
            
            // Introducimos los datos al ArrayList con un objeto auxiliar
            
            p.setNombre(nombre);
            p.setCantidad(cantidad);
            p.setPrecio(precio);
        
            inventario.add(p);
            
            // Preguntamos al usuario si quiere introducir mas productos
            
            System.out.println("Desea añadir otro producto?");
            System.out.println("Si: 1)");
            System.out.println("No: 2)");
            
            respuestaUser = Integer.parseInt(scanner()); // pedimos la respuesta al usuario
            
        } while(respuestaUser != 2);
    }
    
    // Comienzo del metodo que crea un fichero a partir del ArrayList
    
    public static void guardarInventarioFichero(ArrayList<Producto> inventario){
        String linea = "";
        
        // Comienzo del try with resources
        
        try (
                // Declaramos el PrintWriter y un FileWriter para crear y escribir en el archivo
                PrintWriter pw = new PrintWriter(new FileWriter("C:\\WorkSpace_Netbeans\\PROG-1DAM\\TEMAS GABRIEL\\T11\\PracticaRA5\\src\\practicara5\\inventario.txt"));
            ) {
            // Recorremos el ArrayList con un for each
            for (Producto p : inventario) {
                linea = p.getNombre() + "#" + p.getCantidad() + "#" + p.getPrecio();
                pw.println(linea);
            }
            
            System.out.println("Inventario guardado correctamente.\n"); // damos feedback al usuario
        } catch (IOException e) { // Capturamos excepciones
            System.out.println("Error de entrada/salida");
            System.out.println(e.getMessage());
        }
        
    }
    
    public static void leerFicheroInventario(ArrayList<Producto> inventario) {
        String linea = "";
        
        // Comienzo del try with resources
        try (
                // Declaramos el BufferedReader y un FileReader para leer el fichero linea a linea
                BufferedReader br = new BufferedReader(new FileReader("C:\\WorkSpace_Netbeans\\PROG-1DAM\\TEMAS GABRIEL\\T11\\PracticaRA5\\src\\practicara5\\inventario.txt"))
            ) {
                Producto p = new Producto(); // Uso un objeto auxiliar
                linea = "";
                double precioTotal = 0;
                
                // Mientras la linea que leamos sea distinto de null
                while ((linea = br.readLine()) != null) {
                    String[] datos = linea.split("#"); // Uso un String[] auxiliar y la clase split para dividir las lineas con la informacion
                    
                    // Añado al objeto auxiliar los datos
                    p.setNombre(datos[0]);
                    p.setCantidad(Integer.parseInt(datos[1]));
                    p.setPrecio(Double.parseDouble(datos[2]));
                    
                    // Añado el objeto al ArrayList para leerlo
                    inventario.add(p);
                    precioTotal += p.getPrecio();
                    
                    // Mostramos la informacion
                    System.out.println("Producto: " + p.getNombre());
                    System.out.println("Cantidad: " + p.getCantidad());
                    System.out.println("Precio: " + p.getPrecio() + " €\n");
            }
            System.out.println("Precio total de productos: " + precioTotal + "\n");

        } catch (IOException e) { // Capturamos excepciones
            System.out.println("Error al leer el fichero");
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        // Declaracion de variables
        
        ArrayList<Producto> inventario = new ArrayList<>();
        int userOption = 0;
        
        // Comienzo del menu del programa
        do {
            menu();
            userOption = Integer.parseInt(scanner());
            
            switch(userOption) {
                case 1 -> {
                    rellenarInventario(inventario);
                }
                
                case 2 -> {
                    guardarInventarioFichero(inventario);
                }
                
                case 3 -> {
                    leerFicheroInventario(inventario);
                }
                
                case 0 -> {
                    System.out.println("Saliendo del programa...");
                    System.out.println("Saliste del programa correctamente.");
                }
                
                default -> {
                    System.err.println("Introduzca un numero entre el 0 y el 3!");
                }
            }
        } while (userOption != 0);
    }
}