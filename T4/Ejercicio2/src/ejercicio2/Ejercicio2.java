package ejercicio2;
import java.util.Scanner;

/**
 * Ejercicio2
 * @author Gabriel Acaro Sánchez
 */

public class Ejercicio2 {
    public static void multiplication(int num1, int num2) {
        int result;
        result = num1 * num2;
        System.out.println("La operacion que se realizo es producto y el resultado es: " + result);
    }
    public static void sum(int num1, int num2) {
        int result;
        result = num1 + num2;
        System.out.println("La operacion que se realizo es suma y el resultado es: " + result);
    }
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int num1, num2;
        
            System.out.println("Por favor, introduzca un numero: ");
            num1 = entry.nextInt();
            
            System.out.println("Ahora, introduzca un segundo numero: ");
            num2 = entry.nextInt();
        
        if (num1 > 10) {
            multiplication(num1, num2);
        } else {
            sum(num1, num2);
        }
    }

}
