package ejercicio6;

import java.util.Scanner;

/**
 * Ejercicio6
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio6 {
    public static void approvedChecker(int num) {
        
        if (num < 0 || num > 10) {
            System.err.println("Introduzca un numero entre 0 y 10");
        } else if (num <= 4) {
            System.out.println("Suspenso");
        } else if (num <= 6) {
            System.out.println("Bien");
        } else if (num <= 8) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        
            
        }
        
    }
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int num;
        
            System.out.println("Introduzca un numero: ");
            num = entry.nextInt();
        
        approvedChecker(num);
    }

}
