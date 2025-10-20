package ejercicio27;
import java.util.Scanner;

/**
 * Ejercicio 27
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in); 
        int num1=0, num2=0, result=0, calculator=0; // Declaro las variables que usaremos y las inicializo por seguridad
        
        // Comienzo del bucle Do...While (Esto hace qeu se repita siempre todo hasta que el usuario introduzca el numero 5, que es el cierre de programa)
        
        do {
            // Pedimos que introduzca los números para comenzar a operar
            
            System.out.println("\nIntruduzca el primer numero: ");
            num1 = entry.nextInt();
            System.out.println("\nIntruduzca el segundo numero: ");
            num2 = entry.nextInt();
            
            // Mostramos las operaciones posibles y sus respectivos numeros y pedimos al usuario que introduzca un numero
            
            System.out.println("\nIntroduzca uno de los siguientes numeros para realizar la opericion que desee: ");
                System.out.println("Suma: 1");
                System.out.println("Resta: 2");
                System.out.println("Multiplicacion: 3");
                System.out.println("Division: 4");
                System.out.println("Salir del programa: 5");
            calculator = entry.nextInt();
            
            
            // Comienzo del switch (Esto hará que dependiendo del numero/operacion que el usuario introduzca, se realice una operacion u otra)
            
            switch (calculator) {
            case 1: // Caso de suma
                result = num1 + num2;
                System.out.println("\nEl resultado de sumar " + num1 + " + " + num2 + " es: " + result); // Mostramos el resultado de la operacion
                break;
            case 2: // Caso de resta
                result = num1 - num2;
                System.out.println("\nEl resultado de restar " + num1 + " - " + num2 + " es: " + result); // Mostramos el resultado de la operacion
                break;
            case 3: // Caso de multiplicación
                result = num1 * num2;
                System.out.println("\nEl resultado de multiplicar " + num1 + " * " + num2 + " es: " + result); // Mostramos el resultado de la operacion
                break;
            case 4: // Caso de division (Añadimos una excepción para las divisiones entre 0)
                
                // Comienzo de la excepción
                
                try {
                    result = num1 / num2;
                }
                catch(ArithmeticException e) {
                    System.err.println("\nError: Estas dividiendo entre 0!"); // Avisamos de el error que el usuario comete
                    result=0; // En este caso, como no se puede dividir entre 0, damos a la variable result el valor 0
                }
                
                // Fin de la excepción
                
                System.out.println("\nEl resultado de dividir " + num1 + " / " + num2 + " es: " + result); // Mostramos el resultado de la operacion
                break;
            case 5: // Caso de cerrar el programa
                System.out.println("\nSaliste del programa correctamente");
                break;
            default: /** Caso predeterminado (En este caso, si el usuario introduce un numero distinto al que tenemos configurado en los
                     *   cases del switch, recibirá un mensaje de error)
                     */
                System.out.println("\nIntruduzca un numero de operacion valido (1-5)");
        }
        } while (calculator != 5); /** Aqui hacemos que el programa se ejecute mientras que el valor de operacion que el usuario intruzca
                                   *   sea distinto de 5, por lo que se ejecutara siempre que el usuario no pulse el boton para salir del programa
                                   */
        
        // Fin de el Do...While
    }
    
}
