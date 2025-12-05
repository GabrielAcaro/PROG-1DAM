package ejercicio17;
import java.util.Scanner;

/**
 * Ejercicio 17
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int num = 1;
        double raiz = 1;
        
        System.out.println("//// CALCULADORA DE RAIZ CUADRADA ////");
        
        do {
            System.out.println("\nIntroduzca un numero: ");
            num = entry.nextInt();
            
            if (num < 0) {
                System.err.println("Error: Introduce un numero positivo");
            }
            
        } while (num < 0);
        
        raiz = Math.sqrt(num);
        System.out.println("La raiz cuadrada de " + num + " es: " + raiz);
        
        }
    }
