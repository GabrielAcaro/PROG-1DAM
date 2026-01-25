package ejercicio17;

/**
 * Ejercicio17
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio17 {
    
    // Metodo que rellena el vector con numeros aleatorios entre el 0 y el 9
    
    public static void fillVector(int[] vector1) {
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = (int) (Math.random() * 10);
        }
    }
    
    // Metodo que muestra el vector
    
    public static void showVector(int[] vector1) {
        for (int i = 0; i < vector1.length; i++) {
            System.out.println("Valor de la posicion " + i + " del vector: " + vector1[i]);
        }
    }
    
    // Metodo que ordena de mayor a menor el vector
    
    public static void orderVector(int[] vector1) {
        int aux = 0;
        
        for (int i = 0; i < vector1.length - 1; i++) { // Este for controla el numero de pasadas completas del vector
            for (int j = 0; j < vector1.length - 1 - i; j++) { // En este for comparo las posiciones del array
                if (vector1[j] < vector1[j + 1]) { // Si el número de la izquierda es menor que el de la derecha, se intercambian las posiciones 
                    aux = vector1[j];
                    vector1[j] = vector1[j + 1];
                    vector1[j + 1] = aux;
                }
            }
        } 
    /**
     * Explicacion de mis apuntes de esta logica:
     * 
     * En este metodo burbuja, -i quita las comparaciones al final del recorrido.
     * 
     * Esto optimiza el codigo para no tener que volver a comparar el dato de la posicion 0 que pasa a estar en la posicion 9
     * lo de aqui ⬇️ abajo ⬇️
     *                  
     * 1ra pasada del for ->  0  1  2  3  4  5  6  7  8  9  (Asi comienza)
     *                        9  1  2  3  4  5  6  7  8  0  (Asi se ordena)
     * 
     * 2da pasada del for ->  9  1  2  3  4  5  6  7  8 (Asi comienza ya que se quita la ultima posicion)
     *                        9  8  2  3  4  5  6  7  1 (Asi se ordena)
     * 
     *(En la primera pasada pasa el 0 a la ultima posicion, por eso: "vector1.length - 1 - i", el -1 hace que no se compare la
     * ultima posicion con la siguiente a esa, la cual no existe y daria error, y el -i hace que no se compare la penultima posicion con la ultima, ya
     * que no es necesario, asi sucesivamente)
     * 
     * ...
     * ...
     * ...
     * 
     * ultima pasada del for ->  9 8 7 6 5 4 3 2 1 0 (ordenado de mayor a menor)
     */
    }
    
    // Comienzo del metodo main
    
    public static void main(String[] args) {
        int[] vector1 = new int[10];
        
        fillVector(vector1);
        showVector(vector1);
        
        System.out.println("");
        
        orderVector(vector1);
        showVector(vector1);
        
    }

}
