package ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio2
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio2 {
    
    public static void fillVector(int[] vector1) {
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = (int) ((Math.random() * 6) + 1);
        }
    }
    
    public static void showVector(int[] vector1) {
        for (int i : vector1) {
            System.out.println("\nPosicion del vector: " + i + "\n");
        }
    }
    
    public static int[] chooseSize() {
        Scanner entry = new Scanner(System.in);
        int size = 0;
        
        try {
            do {
                System.out.println("Introduzca un numero entre el 1 y el 10: \n");
                size = entry.nextInt();
                
                if (size < 1 || size > 10) {
                    System.err.println("\nIntroduzca un numero entre el 1 y el 10!\n");
                }
            } while (size < 1 || size > 10);
        } catch (InputMismatchException e) {
            System.out.println("Introduzca un numero entre el 1 y el 10!");
        }
        
        int[] vector1 = new int[size];
        
        return vector1;
    }
    
    public static void main(String[] args) {
        int[] vector1;
        
        vector1 = chooseSize();
        
        fillVector(vector1);
        
        showVector(vector1);
    }

}
