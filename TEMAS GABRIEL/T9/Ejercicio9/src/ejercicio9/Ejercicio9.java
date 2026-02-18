package ejercicio9;
import java.util.Scanner;

/**
 * Ejercicio9
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio9 {
    
    // Metodo que pide el Nombre de Usuario
    
    public static String requestUserName(){
        Scanner sc = new Scanner(System.in);
        String userName = "";
        
        System.out.println("Introduzca su usuario: ");
        userName = sc.nextLine();
        
        return userName;
    }
    
    // Metodo que pide la contraseña
    
    public static String requestPassword(){
        Scanner sc = new Scanner(System.in);
        String password = "";
        
        System.out.println("Introduzca su contrasenia: ");
        password = sc.nextLine();
        
        return password;
    }
    
    // Metodo que comprueba si la contraseña cumple con los requisitos del ejercicio
    
    public static boolean passwordChecker(String password, String userName){
        char[] characters = password.toCharArray(); // Creamos un vector de char
        int digitCounter = 0;
        
        // Si la contraseña es menor de 6 damos feedback al usuario
        
        if (password.length() < 6) {
            System.err.println("La contrasenia introducida no es valida! Debe contener minimo 6 caracteres.");
            return false;
        }

        for (int i = 0; i < characters.length; i++) { // Con este for recorremos el vector 
            if (characters[i] >= '0' && characters[i] <= '9') { // Si en el array se encuentran numeros aumentamos el contador
                digitCounter++;
            }
        }
        
        // Si la contraseña contiene menos de 2 digitos damos feedback al usuario
        
        if (digitCounter < 2) {
            System.err.println("La contrasenia introducida no es valida! Debe contener al menos 2 digitos.");
            return false;
        }
        
        // Si en la contraseña se encuentra el nombre de usuario damos feedback al usuario
        
        if (password.toLowerCase().indexOf(userName.toLowerCase()) != -1) { // El -1 es debido a que si no coincide da -1, por lo tanto si da distinto de menos 1 damos feedback
            System.err.println("La contrasenia introducida no valida! No puede contener el nombre de usuario.");
            return false;
        }

        return true;
    }
    
    // Metodo Main
    
    public static void main(String[] args) {
        String userName = requestUserName(); // Pedimos el nombre de usuario
        String password = requestPassword(); // Pedimos la contraseña

        if (passwordChecker(password, userName)) { // Si la contraseña cumple con los requisitos...
            System.out.println("Contrasenia valida. Bienvenido, " + userName + "!");
        }
    }
}
