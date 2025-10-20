package ejercicio15;
import java.util.Scanner;
/**
 * Ejercicio 15
 * @author Gariel Acaro Sánchez
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int i, num, resultado;
            System.out.println("Introduce un numero para calcular su tabla de multiplicar: ");
            num = entry.nextInt();
            System.out.println("Tabla del " + num + ":");
            
        for (i = 1; i <=10; i++) {
            System.out.println(num + " * " + i + " = " + (resultado = num * i));
            
        }
    }
    
}