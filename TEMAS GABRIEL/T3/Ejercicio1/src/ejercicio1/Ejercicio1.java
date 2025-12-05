package ejercicio1;
import java.util.Scanner;
/**
 * Ejercicio 1
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        int num;
        System.out.println("Por favor, introduzca un numero: ");
        Scanner entry = new Scanner(System.in);
        num = entry.nextInt();
        if (num >= 0) {
        System.out.println("El numero introducido es positivo");
        }
        else if (num < 0){
        System.out.println("El numero introducido es negativo");
                }
        
    }
    
}
