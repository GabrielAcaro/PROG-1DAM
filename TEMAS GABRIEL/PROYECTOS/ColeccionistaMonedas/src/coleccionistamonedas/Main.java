package coleccionistamonedas;
import java.util.Scanner;

/**
 * Main
 * @author Gabriel Acaro Sánchez
 */
public class Main {
    
    // Metodo que contiene el menu del programa para dar feedback al usuario
    
    public static void menu() {
        System.out.println("\nIntroduzca uno de estos numeros para realizar una opcion:\n");
            System.out.println("Rellenar la caja fuerte con monedas: 1)\n");
            System.out.println("Mostrar todas las monedas: 2)\n");
            System.out.println("Mostrar todas las monedas fabricadas con un material determinado: 3)\n");
            System.out.println("Mostrar la moneda con mayor valor de la caja fuerte: 4)\n");
            System.out.println("Salir de la aplicacion: 0)\n");
    }
    
    // Comienzo del metodo Main
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Coin[][] securityBox = new Coin[3][3]; // Declaramos el array bidimensional que hará de caja fuerte
        
        int userOption = 0;
        
        // Menu del programa
        
        do {
            menu();
            
            userOption = sc.nextInt();
            
            switch (userOption) {
                
                case 1 -> {
                    Coin.fillSecurityBox(securityBox); // Inicializamos los objetos Coin() del array con los datos que introduca el usuario
                    
                    System.out.println("Datos guardados con exito.\n");
                }
                
                case 2 -> {
                    Coin.showCoins(securityBox); // Muestra la informacion almacenada de las monedas
                }
                
                case 3 -> {
                    Coin.showCoinByMaterial(securityBox); // Muestra las monedas que estan hechas del material que introduzca el usuario
                }
                
                case 4 -> {
                    System.out.println("Mostrando la moneda mas valiosa...\n");
                    
                    Coin.showMostValuatedCoin(securityBox); // Muestra el valor de la moneda con el valor mas alto
                }
                
                case 0 -> {
                    System.out.println("\nSaliendo del programa...\n");
                    System.out.println("Ha salido del programa correctamente.\n");
                }
                
                default -> {
                    System.err.println("Introduzca un numero de opcion valido!\n");
                }
            }
        } while (userOption != 0);
    }

}
