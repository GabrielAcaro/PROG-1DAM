package ejercicio21;
import java.util.Scanner;

/**
 * Ejercicio 21
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int result=0, num1=0, num2=0;
        
            System.out.println("Introduce un dividendo: ");
            num1 = entry.nextInt();
            System.out.println("Introduce un divisor: ");
            num2 = entry.nextInt();
        
        try {
            result = num1 / num2;
        }
        catch(ArithmeticException e) {
            System.err.println("\nError: Estas dividiendo entre 0!");
            result=0;
        }
            System.out.println("\nEl resultado de dividir " + num1 + " / " + num2 + " es: " + result);
    }
    
}