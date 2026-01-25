package ejercicio6;

/**
 * Ejercicio6
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio6 {
    
    public static boolean isPrime(int num) {
        int i = 2;
        boolean found = true;
        
        while (i <= num / 2 && found) {
            if (num % i == 0) {
                found = false;
            }
            i++;
        }
        
        return found;
    }
    
    public static int[] rellenarVector() {
        int[] vector1 = new int[80];
        int i = 0, num = 2;
        
        while (i < 80) {
            if (isPrime(num)) {
                vector1[i] = num;
                i++;
            }
            num++;
        }
        return vector1;
    }
    
    public static void mostrarVector(int[] vector1) {
        for (int i = 0; i < vector1.length; i++) {
            System.out.println("Valor en la posicion " + i + ": " + vector1[i]);
        }
    }
    
    public static void main(String[] args) {
        int[] vector1 = new int[80];
        vector1 = rellenarVector();
        mostrarVector(vector1);
    }
}
