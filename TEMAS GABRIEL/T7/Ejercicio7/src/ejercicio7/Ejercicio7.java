package ejercicio7;

/**
 * Ejercicio7
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio7 {
    
    public static int[] fillVector() {
        int[] vector1 = new int[15];
        
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = (int) (Math.random()* 51);
        }
        
        return vector1;
    }
    
    public static void orderVector(int[] vector1) {
        int aux = 0;
        
        for (int i = 0; i < vector1.length - 1; i++) {
            for (int j = 0; j < vector1.length - 1 - i; j++) {
                if (vector1[j] < vector1[j + 1]) {
                    aux = vector1[j];
                    vector1[j] = vector1[j + 1];
                    vector1[j + 1] = aux;
                }
            }
        }
        /**
     * Recuerda!
     * 
     * En este metodo burbuja, -i quita las comparaciones al final del recorrido.
     * 
     * Esto optimiza el codigo para no tener que volver a comparar el dato de la posicion 0 que pasa a estar en la posicion 14
     * lo de aqui ⬇️ abajo ⬇️
     *                  
     * 1ra pasada del for ->  0  1  2  3  4  5  6  7  8  9  10 11 12 13 14 (Asi comienza)
     *                        1  2  3  4  5  6  7  8  9 10 11 12 13 14 0   (Asi se ordena)
     * 
     * 2da pasada del for ->  1  2  3  4  5  6  7  8  9 10 11 12 13 14 0   (Asi comienza)
     *                        2  3  4  5  6  7  8  9 10 11 12 13 14 1  0   (Asi se ordena)
     * 
     *(En la primera pasada pasa el 0 a la ultima posicion, por eso: "vector1.length - 1 - i", el -1 hace que no se comparen la
     * posicion 14 con la 15, la cual no existe y daria error, y el -i hace que no se compare la penultima posicion con la ultima, ya
     * que no es necesario, asi sucesivamente)
     * 
     * ...
     * ...
     * ...
     * 
     * ultima pasada del for ->  14 13 12 11 10 9 8 7 6 5 4 3 2 1 0
     */
    }
    
    public static void showVector(int[] vector1) {
        for (int i = 0; i < vector1.length -5; i++) {
            System.out.println("Valor en la posicion " + i + ": " + vector1[i]);
        }
    }
    
    public static void main(String[] args) {
        int[] vector1;
        vector1 = fillVector();
        
        orderVector(vector1);
        showVector(vector1);
    }

}
