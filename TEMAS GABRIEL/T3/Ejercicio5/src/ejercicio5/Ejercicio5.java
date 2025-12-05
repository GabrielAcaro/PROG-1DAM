package ejercicio5;
import java.util.Scanner;
/**
 * Ejercicio 5
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        int num;
        Scanner entry = new Scanner(System.in);
        
            System.out.println("Introduzca un numero ");
            num = entry.nextInt();
                
            if (num % 2 == 0){
                System.out.println("El numero " + num + " es par.");
            } else {
                System.out.println("El numero " + num + " es impar.");
            }
                
    }
    
}
