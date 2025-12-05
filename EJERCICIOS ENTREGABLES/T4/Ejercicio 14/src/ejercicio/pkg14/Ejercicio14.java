package ejercicio.pkg14;
import java.util.Scanner; // Importamos la clase Scanner

/**
 * Ejercicio14
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio14 {
    
    // Metodo que pide al usuario un numero y lo devuelve
    
    public static int requestNum() {
        Scanner entry = new Scanner(System.in); 
        int num=0; // Declaramos la variable y la inicializamos por seguridad
            
            System.out.println("Introduce un numero mayor que 0: "); // Imprimimos un texto para que a continuacion el usuario introduzca un numero
            num = entry.nextInt(); // Pedimos al usuario un numero
        
        return num; // devolvemos el numero
    }
    
    // Metodo que comprueba si el numero introducido es mayor que 0
    
    public static boolean checkNum(int num) {
        
        if (num > 0) { // Si el numero es mayor que 0
            return true; // Devolvemos true
        } else { // Si no
            System.out.println("Error el numero debe ser mayor que 0 "); // Mostramos mensaje de error
            return false; // Devolvemos false
        }
    }
    
    // Metodo que muestra los multiplos de 3 entre 1 y el numero introducido
    
    public static void displayMultiples(int num) { 
        int contador = 0; // Declaramos e inicializamos la variable contador de multiplos

            System.out.println("Los numeros multiplos de 3 entre 1 y " + num + " son "); // mostramos texto inicial

        // Bucle que recorre los numeros desde 1 hasta el numero introducido
        
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0) { // Comprobamos si el numero es multiplo de 3
                System.out.println(i); // Mostramos el numero
                contador++; // Aumentamos el contador
            }
        }
        
        // Mostramos al usuario el total de numeros mostrados
        System.out.println("El total de numeros multiplos de 3 mostrados es " + contador);
    }
    
    // Comienzo del metodo main
    public static void main(String[] args) {
        int num; // Declaramos la variable para el numero
        boolean valid; // Declaramos la variable para comprobar si el numero es valido

        // Pedimos el numero y comprobamos que sea valido repitiendo hasta que lo sea
        do {
            num = requestNum(); // Pedimos el numero al usuario llamando al metodo requestNum()
            valid = checkNum(num); // Comprobamos si es mayor que 0 llamando al metodo checkNum()
        } while (!valid); // Repetimos mientras no sea valido

        // Llamamos al metodo que muestra los multiplos de 3
        displayMultiples(num);
    }
}