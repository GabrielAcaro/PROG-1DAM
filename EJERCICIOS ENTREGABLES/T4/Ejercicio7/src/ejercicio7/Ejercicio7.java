package ejercicio7;
import java.util.Scanner; // Importamos la clase Scanner

/**
 * Ejercicio7
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio7 {
    public static void MinorToMajor(int num1, int num2, int num3, int num4, int aux) { // Inicio del método que ordena cuatro números enteros de menor a mayor
        
        // Inicip del bucle que compara los numeros con el siguiente hasta dar con el orden correcto
        for (int i=1; i<=3; i++){
            if (num1 > num2) {
                aux = num1;
                num1 = num2;
                num2 = aux;
            }
            
            if (num2 > num3) {
                aux = num2;
                num2 = num3;
                num3 = aux;
            }
            
            if (num3 > num4) {
                aux = num3;
                num3 = num4;
                num4 = aux;
            }
        }
            System.out.println("El orden de los numeros introducidos es el de: " + num1 + " - " + num2 + " - "+ num3 + " - " + num4); // Imprimimos los números
    }
    
    // Comienzo de la clase main
    
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in); // Declaramos el objeto Scanner para poder leer datos introducidos por el usuario
        
        int num1=0, num2=0, num3=0, num4=0, aux=0; // Declaramos e inicializamos de las variables a utilizar
        
            System.out.println("Introduzca el primer numero: "); // Imprimimos un texto para que a continuacion el usuario introduzca un numero
            num1 = entry.nextInt(); // Pedimos al usuario un numero
            
            System.out.println("Introduzca el segundo numero: ");
            num2 = entry.nextInt(); // Pedimos al usuario un numero
            
            System.out.println("Introduzca el tercer numero: ");
            num3 = entry.nextInt(); // Pedimos al usuario un numero
            
            System.out.println("Introduzca el cuarto numero: ");
            num4 = entry.nextInt(); // Pedimos al usuario un numero
            
        MinorToMajor(num1, num2, num3, num4, aux); // Llamamos al metodo que ordena los números de menor a mayor
    }

}
