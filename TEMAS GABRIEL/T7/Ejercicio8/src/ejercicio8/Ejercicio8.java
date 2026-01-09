package ejercicio8;

import java.util.Scanner;

/**
 * Ejercicio8
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio8 {
    public static int pedirNum() {
        int num = 0;
        Scanner entry = new Scanner(System.in);
        System.out.println("Introduzca un numero de 5 cifras: ");
        
        num = entry.nextInt();
        
        return num;
    }
    
    public static void rellenarVector(int num, int[] vector1) {
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = num % 10;
            num /= 10;
        }
    }
    
    public static void mostrarVector(int[] vector1) {
        int i;
        
        for (i = 0; i < vector1.length; i++) {
            System.out.println("Valor en la posicion " + i + ": " + vector1[i]);
        }
    }
    
    public static void main(String[] args) {
        int num = 0;
        int[] vector1 = new int[5];
        
        num = pedirNum();
        
        rellenarVector(num, vector1);
        
        mostrarVector(vector1);
    }

}