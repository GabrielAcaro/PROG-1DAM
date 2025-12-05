package ejercicio25;
import java.util.Scanner;
/**
 * Ejercicio 25
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio25 {
    public static void main(String[] args) {
        int num1, num2, num3, suma, producto;
        Scanner entry = new Scanner (System.in);
        
            System.out.println("Por favor introduzca el primer numero: ");
            num1 = entry.nextInt();
            System.out.println("Por favor introduzca el segundo numero: ");
            num2 = entry.nextInt();
            System.out.println("Por favor introduzca el tercer numero: ");
            num3 = entry.nextInt();
            
        suma = num1 + num2 + num3;
        
            System.out.println("La suma de los numeros introducidos es: " + suma);
            
        producto = num1 * num2 * num3;
        
            System.out.println("El producto de los numeros introducidos es: " + producto);
    }
    
}
