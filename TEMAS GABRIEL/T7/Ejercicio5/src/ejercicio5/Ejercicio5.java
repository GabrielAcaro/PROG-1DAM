package ejercicio5;
import java.util.Scanner;

/**
 * Ejercicio5
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio5 {
    
    private static int ROW = 4;
    private static int COL = 2;
    
    public static void fillArray(int[][] array1) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                Scanner entry = new Scanner(System.in);
                
                System.out.println("Introduzca el valor de la posicion: " + i + j);
                array1[i][j] = entry.nextInt();
            }
        }
    }
    
    public static void showArray(int[][] array1) {
        for (int i = 0; i < array1.length; i++) {
            String row = "";
            for (int j = 0; j < array1[i].length; j++) {
                row += "[" + i + j + "]-->" + array1[i][j] + " ";
            }
            System.out.println(row);
        }
    }
    
    public static void highestNum(int[][] array1) {
        int aux = array1[0][0];
        
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j] > aux) {
                    aux = array1[i][j];
                }
            }
        }
        System.out.println("El numero mas grande es el: " + aux);
    }
    
    public static void lowestNum(int[][] array1) {
        int aux = array1[0][0];
        
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (aux > array1[i][j]) {
                    aux = array1[i][j];
                }
            }
        }
        System.out.println("El numero mas pequenio es el: " + aux);
    }
    
    public static void sumOfAll(int[][] array1) {
        int aux = 0;
        
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                aux += array1[i][j];
            }
        }
        System.out.println("La suma de todos los numeros es: " + aux);
    }
    
    public static void main(String[] args) {
        int[][] Array1 = new int[ROW][COL];
        
        fillArray(Array1);
        
        showArray(Array1);
        
        System.out.println("");
        
        highestNum(Array1);
        
        lowestNum(Array1);
        
        sumOfAll(Array1);
    }

}
