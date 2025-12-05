package ejercicio30;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * Ejercicio 30
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int randomNum = (int)(Math.random()*100)+ 1;
        int num=0, attemps = 1;
        
        System.out.println("Bienvenido a \"Adivina el numero\"");
        
        do {
            try {
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
            }
            catch (InputMismatchException e){
                System.err.println("\nError: Introduce solo numeros!"); // Avisamos de el error que el usuario comete
                entry.next();
            }
            
        } while (num != randomNum);
        
        
    }

}