package ejercicio9;

/**
 * Ejercicio9
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        int num1=0, num2=0, num3=0, aux=0;
        System.out.println("Introduzca un numero: ");
        num1 = ejercicio9.Method1_Ejercicio9.NumReceiver();
        
        System.out.println("Introduzca un segundo numero: ");
        num2 = ejercicio9.Method1_Ejercicio9.NumReceiver();
        
        System.out.println("Introduzca un tercer numero: ");
        num3 = ejercicio9.Method1_Ejercicio9.NumReceiver();
        
        ejercicio9.Method2_Ejercicio9.MinorNumDisplay(num1, num2, num3, aux);
    }

}
