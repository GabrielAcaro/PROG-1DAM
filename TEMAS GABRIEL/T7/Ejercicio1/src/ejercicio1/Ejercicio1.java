package ejercicio1;

import java.util.Scanner;

/**
 * Ejercicio1
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio1 {
    
    public static void rellenarVector(int[] vector1) {
        Scanner entry = new Scanner(System.in);
        int i;
        
        for (i = 0; i < 10; i++) {
            vector1[i] = entry.nextInt();
        }
    }
    
    public static void mostrarVector(int[] vector1) {
        int i;
        
        for (i = 0; i < 10; i++) {
            if (vector1[i] % 2 == 0) {
                System.out.println("Este es el vector numero: " + vector1[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        int[] vector1 = new int[10];
        
        rellenarVector(vector1);
        mostrarVector(vector1);
    }

}
