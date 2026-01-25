package ejercicio10;

/**
 * Ejercicio10
 * @author Gabriel Acaro Sánchez
 * 
 */
public class Ejercicio10 {
    
    // Comienzo del metodo que utilizo para rellenar el vector de numeros aleatorios entre el 1 y el 8
    
    public static int[] fillVector() {
        int[] vector1 = new int[10]; // Declaro el vector
        
        for (int i = 0; i < vector1.length; i++) { // Este for recorre todas las posiciones del vector
            vector1[i] = (int) ((Math.random()* 8) + 1); // En cada una de las posiciones del vector se añade un numero aleatorio entre el 1 y el 8
        }
        
        return vector1; // Devuelvo el valor del vector y sus posiciones
    }
    
    // Comienzo del metodo que reemplaza los numero repetidos por 0
    
    public static void replaceNum(int[] vector1) {
        int aux = 0;
        boolean same = false;
        
        // Logica de reemplazo de los numero reptidos por 0
        
        for (int i = 0; i < vector1.length; i++) { // Este for recorre todo el vector
            aux = vector1[i]; // Damos valor a la variable aux, este se comparará con los demas valores del vector mas adelante
            same = false; // Cada vez que e hace una iteracion el booleano se inicializa con false porque no sabemos si ese numero tiene repetidos
            
            for (int j = 0; j < i; j++) { // Este segundo for recorre el vector en busca de nuemeros repetidos
                if (aux == vector1[j] && aux != 0) { 
                    same = true; // Si se encuentra un numero repetido y que sea distinto de 0, el booleano adquiere el valor true
                }
                
                if (same) { // Este for recorre el vector de nuevo
                    for (int k = 0; k < vector1.length; k++) { 
                        if (vector1[k] == aux) { // Con este if buscamos si en el vector hay mas numeros iguales al que ya sabemos que tiene 1 igual minimo
                            vector1[k] = 0; // Y todos los que sean iguales al numero los sutituye por un 0
                        }
                    }
                }
            }
        }
    }

    // Comienzo del metodo que muestra los valores del vector
    
    public static void showVector(int[] vector1) {
        for (int i = 0; i < vector1.length; i++) { // Este for recorre todas las posiciones del vector
            System.out.println("Valor en la posicion " + i + ": " + vector1[i]); // Muestra un mensaje y el valor de cada posicion del vector
        }
    }
    
    // Comienzo del metodo Main del ejercicio
    
    public static void main(String[] args) {
        int[] vector1; // Inicializo un vector que se rellenara con el metodo fillVector()
        vector1 = fillVector(); // Le damos un tamaño y valores al vector llamando al metodo fillVector()
        
        showVector(vector1); // Mostramos el vector
        
        System.out.println("");
        
        replaceNum(vector1); // Sustituimos los valores repetidos por 0 con el metodo replaceNum
        
        showVector(vector1); // Mostramos el vector
    }

}
