package ejercicio12;

import java.util.Scanner;

/**
 * Ejercicio12
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio12 {
    
    // Metodo que muestra el menu del programa
    
    public static void menu() {
        System.out.println("\nPara realizar una accion pulse el numero de una de estas opciones: \n");
        
        System.out.println("Rellenar muebles: 1)\n");
        System.out.println("Mostrar muebles: 2)\n");
        System.out.println("Mostrar muebles por precio: 3)\n");
        System.out.println("Salir de la aplicacion: 4)\n");
    }
    
    // Metodo que pide al usuario los datos para rellenar el vector de la clase Furniture
    
    public static void fillFurnitures(Furniture[] furnituresVector) {
        Scanner entry = new Scanner(System.in);
        
        Double price = 0.0;
        String description = "";
        
        for (int i = 0; i < furnituresVector.length; i++) { // Recorremos el vector con un for
            System.out.println("\nIntroduzca el precio del mueble: \n");
            
            furnituresVector[i].setPrice(price = entry.nextDouble()); // Usamos el metodo setPrice de la clase Furniture, para introducir datos junto con el Scanner
            entry.nextLine(); // Limpiamos el buffer del Scanner para reutilizarlo
            
            System.out.println("\nIntroduzca la descripcion del mueble: \n");
            
            furnituresVector[i].setDescription(description = entry.nextLine()); // Usamos el metodo setDescription de la clase Furniture, para introducir datos junto con el Scanner
        }
    }
    
    // Metodo que muestra la informacion del vector de la clase Furniture
    
    public static void showFurnitures(Furniture[] furnituresVector) {
        for (int i = 0; i < furnituresVector.length; i++) { // Recorremos el vector con un for
            System.out.println(furnituresVector[i].toString()); // Muestro cada posicion del vector utilizando el toString de la clase Furniture
        }
    }
    
    // Metodo que muestra la informacion del vector de la clase Furniture filtrando por el precio (o bien igual al introducido o bien inferior a este)
    
    public static void showFurnituresByPrice(Furniture[] furnituresVector) {
        Scanner entry = new Scanner(System.in);
        double price = 0.0;
        boolean priceFound = false;
        
        System.out.println("\nIntroduzca un precio para filtrar: \n");
        price = entry.nextDouble(); // Pedimos un precio al usuario para filtrar
        
        for (int i = 0; i < furnituresVector.length; i++) { // Recorremos el vector
            if (furnituresVector[i].getPrice() <= price) { // Si al obtener el precio con get el precio es menor o igual al que introduzca el usuario...
                System.out.println(furnituresVector[i].toString()); // Se muestra con toString la posicion del vector que cumpla con el if
                priceFound = true; // Ponemos el boolean en true
            }
        }
        
        if (!priceFound) { // Si no se encuentran precios igual o inferiores al introducido damos feedback al usuario
            System.out.println("\nNo se encontraron muebles por ese precio o inferior.");
        }
    }
    
    // Comienzo del metodo Main
    
    public static void main(String[] args) {
        
        // Inicializacion de objetos
        
        Scanner entry = new Scanner(System.in);
        Furniture[] furnituresVector = new Furniture[4];
        
        // Inicializacion de variables
        
        int userOption = 0;
        
        // Main
        
        Furniture.furnitureVectorInitializer(furnituresVector);
        
        do { // Menu del programa
            menu();
            
            userOption = entry.nextInt();
            
            switch (userOption) { // Switch de opciones del programa
                case 1 -> {
                    System.out.println("\nRellene los muebles...");
                    
                    fillFurnitures(furnituresVector); // Llamada al metodo correspondiente
                    
                    System.out.println("\nMuebles rellenados.");
                }
                case 2 -> {
                    System.out.println("\nMostrando muebles...");
                    
                    showFurnitures(furnituresVector); // Llamada al metodo correspondiente
                    
                    System.out.println("\nMuebles mostrados.");
                }
                case 3 -> {
                    System.out.println("\nMostrando muebles...");
                    
                    showFurnituresByPrice(furnituresVector); // Llamada al metodo correspondiente
                    
                    System.out.println("\nMuebles mostrados.");
                }
                
                case 4 -> {
                    System.out.println("\nSaliendo de la aplicacion...");
                    System.out.println("\nHa salido corectamente.");
                }
                default -> {
                    System.err.println("\nIntroduzca un numero entre el 1 y el 4!");
                    userOption = -1;
                }
            }
        } while(userOption != 4); // Si el usuario no pulsa 4 el programa no termina
    }
}