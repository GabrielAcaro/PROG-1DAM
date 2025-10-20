package ejercicio18;
import java.util.Scanner;

/**
 * Ejercicio 18
 * @author Gabriel Acaro Sánchez
 */

public class Ejercicio18 {
    public static void main(String[] args) {
        
    Scanner entry = new Scanner(System.in);
    int password = 1234;
    int enterPassword = 0;
    int attempts = 0;
    boolean passwordTrue = false;
    
        do {
            System.out.println("Introduca su contrasenia: ");
            enterPassword = entry.nextInt();
            attempts++;
            
            if (enterPassword == password) {
                passwordTrue = true;
                System.out.println("Enhorabuena, contrasenia correcta.");
            } else if (attempts < 3){
                System.err.println("Error: Contrasenia incorrecta");
            }
            
        } while (!passwordTrue && attempts < 3);
        if (!passwordTrue){
            System.err.println("Acceso denegado,  has superado el numero de intentos.");
        }
    }
    
}
