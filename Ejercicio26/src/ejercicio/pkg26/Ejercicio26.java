package ejercicio.pkg26;
import java.util.Scanner; // Importamos la clase Scanner
/**
 * Ejercicio 26
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio26 {
    public static void main(String[] args) {
        int num;
        Scanner entry = new Scanner (System.in); // Creamos un objeto Scanner llamado "entry"
        
            System.out.println("Por favor, introduzca un numero de 4 cifras: ");// Pedimos el numero al usuario
            num = entry.nextInt(); // Guardamos el numero en la variable "num"
        
        int cifra1 = num / 1000; // Division entera (quita las ultimas 3 cifras)
        int cifra2 = (num / 100) % 10; // Elimina las ultimas 2 cifras y nos quedamos con la segunda
        int cifra3 = (num / 10) % 10; // Elimina la ultima cifra y nos quedamos con la tercera
        int cifra4 = num % 10; // Resto de dividir entre 10 que equivale a la ultima cifra
        
        // Mostrmos el resultado
        
            System.out.println("La primera cifra es: " + cifra1);
            System.out.println("La segunda cifra es: " + cifra2);
            System.out.println("La tercera cifra es: " + cifra3);
            System.out.println("La cuarta cifra es: " + cifra4);
    }
    
}
