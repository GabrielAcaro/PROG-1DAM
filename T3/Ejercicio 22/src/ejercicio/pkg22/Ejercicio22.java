package ejercicio.pkg22;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio 22
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int result=0, num1=0, num2=0;
       
        try {
            System.out.println("Introduce un numero: ");
            num1 = entry.nextInt();
            
            System.out.println("Introduce otro numero: ");
            num2 = entry.nextInt();
            
            result = num1 + num2;
            
            System.out.println("\nEl resultado de sumar " + num1 + " + " + num2 + " es: " + result);
        }
        catch(InputMismatchException e) {
            System.err.println("\nError: Introduzca solo numeros");
        } 
    }
}
