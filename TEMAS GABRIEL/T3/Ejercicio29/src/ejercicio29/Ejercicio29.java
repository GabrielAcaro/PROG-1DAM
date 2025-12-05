package ejercicio29;
import java.util.Scanner;

/**
 * Ejercicio 29
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int randomNum = (int)(Math.random()*100)+ 1;
        int num, attemps = 0;
        
        System.out.println("Bienvenido a \"Adivina el numero\"");
        
        do {
            System.out.println("\nIntroduca un numero para continuar: ");
            num = entry.nextInt();
            attemps++;
            
            if (num < randomNum) {
                System.out.println("\nEl numero misterioso es mayor que " + num);
            } else if (num > randomNum){
                System.out.println("El numero misterioso es menor que " + num);
            }
            
            if (num == randomNum) {
                System.out.println("\nFelicidades adivinaste el numero misterioso: " + randomNum);
                System.out.println("Lo has adivinado en " + attemps + " intentos");
            }
            
        } while (num != randomNum);
        
    }

}
