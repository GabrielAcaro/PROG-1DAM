package ejercicio23;
import java.util.Scanner;

/**
 * Ejercicio 23
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int num=0;
        
        System.out.println("Introduzca un numero: ");
        num = entry.nextInt();
            
        do {
            if (num <= 1) {
                System.err.println("Error: Intruduzca un numero mayor que 1: ");
                num = entry.nextInt();
            }
            if (num > 1){
                for (int i=1 + 1;i < num;i++) {
                    System.out.println(i);
                }
            }
        } while (num <= 1);
        
            
        }
    }
