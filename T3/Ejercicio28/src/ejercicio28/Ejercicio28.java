package ejercicio28;

/**
 * Ejercicio 28
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio28 {
    public static void main(String[] args) {
        int randomNum = (int)(Math.random()*100)+ 1;
        
        if (randomNum % 2 == 0) {
            System.out.println("Este numero es par: " + randomNum);
        } else {
            System.out.println("Este numero es impar: " + randomNum);
        }
    }

}
