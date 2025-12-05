package ejercicio.pkg23;
import java.util.Scanner;
/**
 * Ejercicio 23
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio23 {
    public static void main(String[] args) {
        double price, units, totalPrice;
        Scanner entry = new Scanner (System.in);
        
            System.out.println("Por favor, introduzca el precio del modelo de ordenador que desea comprar: ");
            price = entry.nextDouble();
            System.out.println("¿Cuantas unidades quiere llevarse?" );
            units = entry.nextDouble();
            totalPrice = price * units;
            System.out.println("El precio total de su compra es de: " + totalPrice + " Euros.");
        
    }
    
}
