package ejercicio16;
/**
 * Ejercicio 16 moodle
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        int cartera = 130;
        int billetes50 = cartera / 50;
        int resto = cartera % 50;
        int billetes10 = resto / 10;
            System.out.println("130 euros hacen un total de: " + billetes50 + " billetes de 50 euros y " + billetes10 + " billetes de 10 euros.");
        
    }
    
}
