package ejercicio8;
import java.util.Scanner;

/**
 * Ejercicio8
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio8 {
    public static void exchangeCalculator(int dinero, int billetes50, int billetes20, int billetes10, int billetes5, int monedas2, int monedas1) {
        billetes50 = dinero / 50;
        billetes20 = (dinero % 50) / 20;
        billetes10 = ((dinero % 50) % 20) / 10;
        billetes5 = (((dinero % 50) % 20) % 10) / 5;
        monedas2 = ((((dinero % 50) % 20) % 10) % 5) / 2;
        monedas1 = (((((dinero % 50) % 20) % 10) % 5) % 2) / 1;
        
        if (billetes50 > 0) {
            System.out.println("Billetes de 50: " + billetes50);
        }
        if (billetes20 > 0) {
            System.out.println("Billetes de 20: " + billetes20);
        }
        if (billetes10 > 0) {
            System.out.println("Billetes de 10: " + billetes10);
        }
        if (billetes5 > 0) {
            System.out.println("Billetes de 5: " + billetes5);
        }
        if (monedas2 > 0) {
            System.out.println("Billetes de 2: " + monedas2);
        }
        if (monedas1 > 0) {
            System.out.println("Billetes de 1: " + monedas1);
        }
        
        
    }
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int dinero, billetes50=0, billetes20=0, billetes10=0, billetes5=0, monedas2=0, monedas1=0;
        
            System.out.println("Introduzca una cantidad en euros sin decimales: ");
            dinero = entry.nextInt();
        
        exchangeCalculator(dinero, billetes50, billetes20, billetes10, billetes5, monedas2, monedas1);
    }

}
