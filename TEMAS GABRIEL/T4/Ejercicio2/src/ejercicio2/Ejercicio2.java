package ejercicio2;
import java.util.Scanner;

/**
 * Ejercicio2
 * @author Gabriel Acaro Sánchez
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int num1, num2;
        
            System.out.println("Por favor, introduzca un numero: ");
            num1 = entry.nextInt();
            
            System.out.println("Ahora, introduzca un segundo numero: ");
            num2 = entry.nextInt();
        
        if (num1 > 10) {
            ejercicio2.Operations.Multiplication(num1, num2);
        } else {
            ejercicio2.Operations.Sum(num1, num2);
        }
    }

}
