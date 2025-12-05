package ejercicio5;
import java.util.Scanner;

/**
 * Ejercicio5
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int num;
        
        System.out.println("Introduzca un numero: ");
        num = entry.nextInt();
        
        evenorodd.EvenOrOdd.evenOrOdd(num);
    }

}
