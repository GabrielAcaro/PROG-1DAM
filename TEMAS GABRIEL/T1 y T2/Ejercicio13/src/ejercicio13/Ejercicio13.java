package ejercicio13;

/**
 * Ejercicio 13
 * @author gabri
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        int num1=1;
        int num2=2;
        int aux;
        
        aux = num1;
        num1 = num2;
        num2 = aux;
        System.out.println("La variable num1 contiene el valor " + num1 + " y la variable num2 contiene el valor " + num2 + ".");
        num2 = num1;
        num1 = aux;
        System.out.println("Ahora, la variable num1 contiene el valor " + num1 + " y la variable num2 contiene el valor " + num2 + ".");
    }
    
}
