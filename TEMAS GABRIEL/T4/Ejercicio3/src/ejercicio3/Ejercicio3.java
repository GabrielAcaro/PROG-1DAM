package ejercicio3;
import java.util.Scanner;

/**
 * Ejercicio3
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int num1=0, num2=0, num3=0, highest=0;
        
            System.out.println("Introduzca el primer numero: ");
            num1 = entry.nextInt();
            
            System.out.println("Introduzca el segundo numero: ");
            num2 = entry.nextInt();
            
            System.out.println("Introduzca el tercer numero: ");
            num3 = entry.nextInt();
            
            highestnumchecker.HighestNumChecker.highestNumChecker(num1, num2, num3, highest);
            
        
        
        
        
    }

}
