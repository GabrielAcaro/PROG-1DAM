package ejercicio9;
import java.util.Scanner;
/**
 * Ejercicio 9
 * @author gabri
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        int num1, num2, num3, num4, aux;
        
            Scanner entry = new Scanner(System.in);
                System.out.println("Introduzca el primer numero: ");
                num1 = entry.nextInt();
                
                System.out.println("Introduzca el segundo numero: ");
                num2 = entry.nextInt();
                
                System.out.println("Introduzca el tercer numero: ");
                num3 = entry.nextInt();
                
                System.out.println("Introduzca el cuarto numero: ");
                num4 = entry.nextInt();
                
            // EJEMPLO CON 4 - 3 - 2 - 1 //
            
            if (num1 > num2){ // 3 - 4 - 2 - 1
                aux = num1;
                num1 = num2;
                num2 = aux;
            }
            if (num1 > num3){ // 2 - 4 - 3 - 1
                aux = num1;
                num1 = num3;
                num3 = aux;
            }
            if (num1 > num4){ // 1 - 4 - 3 - 2
                aux = num1;
                num1 = num4;
                num4 = aux;
            }
            if (num2 > num3){ // 1 - 3 - 4 - 2
                aux = num2;
                num2 = num3;
                num3 = aux;
            }
            if (num2 > num4){ // 1 - 2 - 4 - 3
                aux = num2;
                num2 = num4;
                num4 = aux;
            }
            if (num3 > num4){ // 1 - 2 - 3 - 4
                aux = num3;
                num3 = num4;
                num4 = aux;
            }
                System.out.println("El orden de los numeros introducidos es el " + num1 + " - " + num2 + " - " + num3 + " - " + num4);
        }
    }
