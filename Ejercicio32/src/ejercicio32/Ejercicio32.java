package ejercicio32;
import java.util.Scanner;
/**
 * Ejercicio 32
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio32 {
    public static void main(String[] args) {
        int cantidad;
        int billetes50, billetes20, billetes10, billetes5, monedas2, monedas1;
        Scanner entry = new Scanner(System.in);
        
            System.out.print("Por favor, indique una cantidad de dinero: "); // Pedimos al usuario una cantidad en euros
            
        cantidad = entry.nextInt(); // Variables para guardar cuantos billetes o monedas se usaran
        
        billetes50 = cantidad / 50; // Numero de billetes de 50 euros
        cantidad = cantidad % 50; // Lo que sobra despues de quitar billetes de 50 euros

        billetes20 = cantidad / 20; // Numero de billetes de 20euros
        cantidad = cantidad % 20;        

        billetes10 = cantidad / 10; // Numero de billetes de 10 euros
        cantidad = cantidad % 10;

        billetes5 = cantidad / 5; // Numero de billetes de 5 euros
        cantidad = cantidad % 5;

        monedas2 = cantidad / 2; // Numero de monedas de 2 euros
        cantidad = cantidad % 2;

        monedas1 = cantidad; // Lo que queda son monedas de 1 euro

        // Mostramos el resultado
            System.out.println("\nDesglose:");
            System.out.println(billetes50 + " billetes de 50 euros");
            System.out.println(billetes20 + " billetes de 20 euros");
            System.out.println(billetes10 + " billetes de 10 euros");
            System.out.println(billetes5 + " billetes de 5 euros");
            System.out.println(monedas2 + " monedas de 2 euros");
            System.out.println(monedas1 + " monedas de 1 euro");
    }
    
}
