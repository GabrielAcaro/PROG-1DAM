package ejercicio12;
import java.util.Scanner;

/**
 * Ejercicio12
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio12 {
    public static int pedirContrasenia() {
        Scanner entry = new Scanner(System.in);
        int num = 0;
        
        num = entry.nextInt();
        
        return num;
    }
    
    public static boolean comprobarContrasenia(int usercontrasenia) {
        int contrasenia = 1234;
        
        return usercontrasenia == contrasenia;
    }
    
    public static void main(String[] args) {
        int usercontrasenia = 0, intento = 0;
        boolean contrasenia;
        
        
        System.out.println("Introduzca la contrasenia para ingresar al programa: \n");
        
        do {
            usercontrasenia = pedirContrasenia();
            contrasenia = comprobarContrasenia(usercontrasenia);
            
            if (contrasenia) {
                System.out.println("Contrasenia correcta, tienes acceso.");
                
            } else if (!contrasenia && intento < 2) {
                System.err.println("Contrasenia incorrecta! Intentelo de nuevo: ");
            }
            
            intento++;
            
            if (intento == 3) {
                System.err.println("Superaste el maximo de intentos! Acceso denegado!");
            }
            
        } while (intento < 3 && !contrasenia);
    }
}
