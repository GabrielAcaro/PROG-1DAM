package ejercicio2;

/**
 * Ejercicio2
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio2 {
    public static void rellenarVector(int[] vector1) {
        int i;
        
        for (i = 0; i < 7; i++) {
            vector1[i] = i;
        }
    }
    
    public static void mostrarVector(int[] vector1) {
        int i;
        
        for (i = 0; i < 7; i++) {
            System.out.println("Este es el vector numero: " + vector1[i]);
        }
    }
    
    public static void intercambiarVector(int[] vector1) {
        int i, aux;
        
        aux = vector1[1];
        vector1[1] = vector1[3];
        vector1[3] = aux;
    }
    
    public static void main(String[] args) {
        int[] vector1 = new int[7];
        
        rellenarVector(vector1);
        
        mostrarVector(vector1);
        System.out.println("");
        
        intercambiarVector(vector1);
        
        mostrarVector(vector1);
        System.out.println("");
    }

}
