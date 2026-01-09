package ejercicio3;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio3
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio3 {
    public static int elegirLongitudVector() {
        Scanner entry = new Scanner(System.in);
        int tamanioVector = 0;
        boolean valido = false;
            do {
                try {
                    System.out.println("Elija el tamanio que quieres que tenga el vector: ");
                    tamanioVector = entry.nextInt();
            
                    if (tamanioVector < 1 || tamanioVector > 10) {
                        System.err.println("Introduzca un valor entre el 1 y el 10!");
                    } else {
                        valido = true;
                    }
                    
                } catch (InputMismatchException e) {
                    System.err.println("Introduzca un numero entero!");
                    entry.next();
                }
            } while (!valido);
            
        return tamanioVector;
    }
    
    public static void rellenarVector(int[] vector1) {
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = (int)(Math.random() * 6) + 1;
        }
    }
    
    public static void mostrarVector(int[] vector1) {
        int i;
        
        for (i = 0; i < vector1.length; i++) {
            System.out.println("Valor en la posicion " + i + ": " + vector1[i]);
        }
    }
    
    public static void main(String[] args) {
        int tamanio = elegirLongitudVector();
        
        int[] vector1 = new int[tamanio];
        
        rellenarVector(vector1);
        
        mostrarVector(vector1);
    }

}
