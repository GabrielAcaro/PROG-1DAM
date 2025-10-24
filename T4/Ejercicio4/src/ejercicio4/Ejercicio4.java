package ejercicio4;
import java.util.Scanner;

/**
 * Ejercicio4
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio4 {
    public static void lowestNumChecker (int num1, int num2, int num3, int lowest){
        if (num1 < num2 && num1 < num3){
            lowest = num1;
        }else if (num2 < num1 && num2 < num3) {
            lowest = num2;
        }else {
            lowest = num3;
        }
        
        System.out.println("EL numero menor de los introducidos es el " + lowest + ".");
    }
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int num1=0, num2=0, num3=0, lowest=0;
        
            System.out.println("Introduzca el primer numero: ");
            num1 = entry.nextInt();
            
            System.out.println("Introduzca el segundo numero: ");
            num2 = entry.nextInt();
            
            System.out.println("Introduzca el tercer numero: ");
            num3 = entry.nextInt();
            
            lowestNumChecker(num1, num2, num3, lowest);
    }

}
