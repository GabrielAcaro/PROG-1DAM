package ejercicio9;

import java.util.Scanner;

/**
 * Ejercicio9
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio9 {
    public static int pedirNum() {
        int num = 0;
        Scanner entry = new Scanner(System.in);
        System.out.println("Introduzca un numero entero: ");
        
        num = entry.nextInt();
        
        return num;
    }
    
    public static int calcularCifras(int num) {
        int contador = 0;
        
        if (num == 0) {
            return 1;
        }
        
        while (num > 0) {
            num /= 10;
            contador++;
        }
        return contador;
    }
    
    public static void rellenarVector(int num, int[] vector1) {
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = num % 10;
            num /= 10;
        }
    }
    
    public static void mostrarVector(int[] vector1) {
        for (int i = 0; i < vector1.length; i++) {
            System.out.println("Valor en la posicion " + i + ": " + vector1[i]);
        }
    }
    
    public static void main(String[] args) {
        int num = 0, cifras = 0;
        
        num = pedirNum();
        
        cifras = calcularCifras(num);
        
        int[] vector1 = new int[cifras];
        
        rellenarVector(num, vector1);
        
        mostrarVector(vector1);
    }

}
