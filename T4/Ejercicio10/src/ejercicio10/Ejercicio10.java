package ejercicio10;
import java.util.Scanner;

/**
 * Ejercicio10
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio10 {
    public static int pedirNum() {
        Scanner entry = new Scanner(System.in);
        int num = 0;
        
        num = entry.nextInt();
        
        return num;
    }
    
    public static void calcularTabla(int num, int resultado) {
        num = 0;
        resultado = 0;
        
        num = pedirNum();
        
        for (int i = 0; i <= 10; i++) {
            resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
        }
    }
    
    public static void main(String[] args) {
        int num = 0, resultado = 0;
        System.out.println("Introduzca un numero para calcular su tabla de multiplicar: \n");
        
        calcularTabla(num, resultado);
        
    }

}
