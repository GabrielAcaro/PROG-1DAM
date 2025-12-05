package ejercicio6;
import java.util.Scanner;
/**
 * Ejercicio 6
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        int nota;
        System.out.println("Introduzca la nota del alumno: ");
        Scanner entry = new Scanner(System.in);
        nota = entry.nextInt();
            switch (nota) {
             case 0, 1, 2 ,3 ,4:
                    System.out.println("Suspenso");
                    break;
                case 5, 6:
                    System.out.println("Bien");
                    break;
                case 7, 8:
                    System.out.println("Notable");
                    break;
                case 9, 10:
                    System.out.println("Sobresaliente");
                    break;
                default:
                    System.out.println("Error en tiempo de ejecuccion: Selecciona un numero entre 0 y 10");
            }
    }
}
