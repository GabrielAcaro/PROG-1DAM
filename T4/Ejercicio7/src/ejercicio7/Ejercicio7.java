package ejercicio7;
import java.util.Scanner;

/**
 * Ejercicio7
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio7 {
    public static void MinorToMajor(int num1, int num2, int num3, int num4, int aux) {
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
            System.out.println("El orden de los numeros introducidos es el de: " + num1 + " - " + num2 + " - "+ num3 + " - " + num4);
    }
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int num1=0, num2=0, num3=0, num4=0, aux=0;
        
            System.out.println("Introduzca el primer numero: ");
            num1 = entry.nextInt();
            
            System.out.println("Introduzca el segundo numero: ");
            num2 = entry.nextInt();
            
            System.out.println("Introduzca el tercer numero: ");
            num3 = entry.nextInt();
            
            System.out.println("Introduzca el cuarto numero: ");
            num4 = entry.nextInt();
            
        MinorToMajor(num1, num2, num3, num4, aux);
    }

}
