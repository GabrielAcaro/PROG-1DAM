package ejercicio17;
import java.util.Scanner; // Importamos la clase Scanner para poder leer datos introducidos por el usuario

/**
 * Ejercicio17
 * @author Gabriel Acaro Sanchez
 */
public class Ejercicio17 {
    
    // Metodo que genera una letra minuscula aleatoria entre a y z y la devuelve
    
    public static char randomLetterGenerator() {
        double random = Math.random(); // Usamos el metodo random de la clase Math que devuelve un numero entre 0 y 1
        int codigo = (int) (random * 26) + 97; // Transformamos ese numero al rango de letras minusculas de la a a la z usando su codigo ASCII
        char randomLetter = (char) codigo; // Convertimos el numero en char
        return randomLetter; // Devolvemos la letra generada
    }

    // Metodo que pide al usuario una letra y la devuelve
    
    public static char requestLetter() {
        Scanner entry = new Scanner(System.in); // Creamos el objeto Scanner para leer datos introducidos por el usuario
        char letter; // Declaramos la variable letter
        
            System.out.println("Introduce una letra minuscula: "); // Pedimos al usuario que introduzca una letra
            letter = entry.nextLine().charAt(0); // Leemos la letra introducida por el usuario
        
        return letter; // Devolvemos la letra
    }

    // Metodo que compara la letra del usuario con la letra generada y da las pistas necesarias
    
    public static void letterAkinator() {
        char randomLetter = randomLetterGenerator(); // Llamamos al metodo que genera la letra aleatoria
        char userLetter; // Declaramos la variable que guardara la letra introducida por el usuario
        int intentos = 0; // Declaramos e inicializamos el contador de intentos
        
        // Bucle que se repite hasta que el usuario adivine la letra
        
        do {
            userLetter = requestLetter(); // Llamamos al metodo que pide la letra al usuario
            intentos++; // Aumentamos el contador de intentos
            
            // Comprobamos si la letra del usuario es igual a la letra aleatoria
            
            if (userLetter == randomLetter) { 
                System.out.println("Has acertado, la letra es: " + randomLetter); // Mostramos mensaje de acierto
                System.out.println("Has necesitado: " + intentos + " intentos"); // Mostramos el numero de intentos
            } else if (userLetter < randomLetter) { 
                System.out.println("La letra que debes adivinar esta despues en el alfabeto! "); // Damos pista al usuario
            } else { 
                System.out.println("La letra que debes adivinar esta antes en el alfabeto! "); // Damos pista al usuario
            }
        } while (userLetter != randomLetter); // Repetimos mientras el usuario no acierte
    }

    // Inicio del metodo main
    public static void main(String[] args) {
        System.out.println("Adivina la letra minuscula "); // Mensaje de inicio del juego
        letterAkinator(); // Llamamos al metodo letterAkinator para iniciar el juego
    }
}
