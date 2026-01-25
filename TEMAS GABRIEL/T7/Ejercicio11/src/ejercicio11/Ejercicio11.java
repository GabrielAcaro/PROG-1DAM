package ejercicio11;

/**
 * Ejercicio11
 * @author Gabriel Acaro Sánchez
 */

    /**
     * Escribe un programa que contenga un método que rellene un vector de 10
     * números enteros con números aleatorios entre 0 y 9, sin repetir. • Otro
     * método visualizará el array creado. 
     * 
     * • Ejemplo de ejecución: Se ha generado el siguiente array: 
     * 
     *                      8 1 5 7 2 0 9 4 3 6
     */
public class Ejercicio11 {
    public static int[] fillVector(){
        int[] vector1 = new int[10];
        boolean same = false;
        
        for (int i = 0; i < vector1.length; i++) {
            same = true;

            while (same) {
                vector1[i] = (int) (Math.random() * 10);
                
                for (int j = 0; j < i; j++) {
                    if (vector1[i] == vector1[j]) {
                        same = true;
                    }
                }
            }
    }
        
        return vector1;
    }
    
    public static void mostrarVector(int[] vector1) {
        int i;
        
        for (i = 0; i < vector1.length; i++) {
            System.out.println("Valor en la posicion " + i + ": " + vector1[i]);
        }
    }
    
    public static void main(String[] args) {
        int[] vector1;
        
        vector1 = fillVector();
        
        mostrarVector(vector1);
    }

}
