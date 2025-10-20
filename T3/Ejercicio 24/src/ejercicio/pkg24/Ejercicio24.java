package ejercicio.pkg24;
import java.util.Scanner;

/**
 * Ejercicio 24
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int num=0, numbers=0;
        
        System.out.println("Introduce un numero: ");
        num = entry.nextInt();
            
        do {
            if (num <= 0) {
                System.err.println("Error: Intruduzca un numero mayor que 0: ");
                num = entry.nextInt();
            }
            if (num > 0) {
                for (int i = 1; i <= num; i++) {
                    if (i % 3 == 0) {
                        System.out.println(i);
                        numbers++;
                    }
                }
            }
            
        } while (num <= 0);
        System.out.println("Numeros mostrados: " + numbers);
            
    }

}
