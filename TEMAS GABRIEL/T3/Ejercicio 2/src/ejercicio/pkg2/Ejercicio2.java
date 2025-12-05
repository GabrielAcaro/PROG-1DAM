package ejercicio.pkg2;
import java.util.Scanner;
/**
 * Ejercicio 2
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        int num1, num2, resultado;  
        Scanner entry = new Scanner(System.in);
            System.out.println("Por favor, introduzca un numero: ");
            num1 = entry.nextInt();
            
            System.out.println("Ahora, introduzca un segundo numero: ");
            num2 = entry.nextInt();
            
            if (num1 > 10) {
                resultado = num1 * num2;
                System.out.println("La operacion que se realizo es un producto y el resultado es: " + resultado);
            } else {
                resultado = num1 + num2;
                System.out.println("La operacion que se realizo es una suma y el resultado es: " + resultado);
            }
        
    }
    
}
