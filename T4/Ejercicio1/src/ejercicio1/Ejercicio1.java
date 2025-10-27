package ejercicio1;
import java.util.Scanner;

/**
 * Ejercicio1
 * @author Gabriel Acaro Sánchez
 */

public class Ejercicio1 {
    
    public static void PositiveNumChecker(int num) {
        if (num < 0) {
            System.out.println("El numero introducido es negativo.");
        }else {
            System.out.println("El numero introducido es positivo.");
        }
    }
    
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int num;
        
            System.out.println("Por favor, introduzca un numero: ");
            num = entry.nextInt();
        
        PositiveNumChecker(num);
    }

}
