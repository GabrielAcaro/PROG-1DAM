package ejercicio11;
import java.util.Scanner;

/**
 * Ejercicio11
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio11 {
    public static double pedirNum() {
        Scanner entry = new Scanner(System.in);
        double num = 0;
        
        num = entry.nextDouble();
        
        return num;
    }
    
    public static double calcularRaiz(double raiz) {
        return Math.sqrt(raiz);
    }
    
    public static void mostrarResultado() {
        double raiz = 0;
        double aux = 0;
        
        
        System.out.println("Introduzca un numero para calcular su raiz: \n");
        aux = pedirNum();
        
        do {
        if (aux < 0) {
            System.out.println("Introduzca un numero positivo para continuar! \n");
            aux = pedirNum();
        } else {
            
        }
        } while (aux < 0);
        
        raiz = calcularRaiz(aux);
        
        System.out.println("La raiz de " + aux + " es: " + raiz);
    }
    public static void main(String[] args) {
        mostrarResultado();
    }

}
