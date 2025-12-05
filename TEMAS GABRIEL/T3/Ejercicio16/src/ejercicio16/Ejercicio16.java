package ejercicio16;

/**
 * Ejercicio 16
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        int num =  20;
        int contador = 0;
        do {
            if (num % 2 != 0) {
            System.out.println(num);
            contador++;
            }
            num++;
        } while (num < 160);
        System.out.println("La cantidad de numeros impresos ha sido: " + contador);
    }
    
}
