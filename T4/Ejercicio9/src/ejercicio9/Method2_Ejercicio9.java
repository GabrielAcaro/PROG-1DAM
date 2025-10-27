package ejercicio9;

/**
 * Ejercicio 9
 * @author Gabriel Acaro Sánchez
 */
public class Method2_Ejercicio9 {
    public static void MinorNumDisplay(int num1, int num2, int num3, int aux) {
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
        }
        
        System.out.println("El numero menor es: " + num1);
    }
}
