package ejercicio.pkg3;
import java.util.Scanner;
/**
 * Ejercicio 3
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        int num1, num2, num3, mayor;
        Scanner entry = new Scanner(System.in);
        
            System.out.println("Introduzca el primer numero: ");
            num1 = entry.nextInt();
                
            System.out.println("Introduzca el segundo numero: ");
            num2 = entry.nextInt();
                
            System.out.println("Introduzca el tercer numero: ");
            num3 = entry.nextInt();
                
                if (num1 > num2){
                    mayor = num1;
                }
                if (num1 > num3){
                    mayor = num1;
                } else if (num2 > num3) {
                    mayor = num2;
                } else {
                    mayor = num3;
                }
                
                
            System.out.println("El numero mayor de los introducidos es: " + mayor);
                
    }
    
}
