package ejercicio.pkg4;
import java.util.Scanner;
/**
 * Ejercicio 4
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        int num1, num2, num3, menor;
        Scanner entry = new Scanner(System.in);
        
            System.out.println("Introduzca el primer numero: ");
            num1 = entry.nextInt();
                
            System.out.println("Introduzca el segundo numero: ");
            num2 = entry.nextInt();
                
            System.out.println("Introduzca el tercer numero: ");
            num3 = entry.nextInt();
                
                if (num1 < num2){
                    menor = num1;
                }
                if (num1 < num3){
                    menor = num1;
                } else if (num2 < num3) {
                    menor = num2;
                } else {
                    menor = num3;
                }
                
                
            System.out.println("El numero menor de los introducidos es: " + menor);
        
    }
    
}
