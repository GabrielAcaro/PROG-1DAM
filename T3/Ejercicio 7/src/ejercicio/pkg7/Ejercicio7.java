package ejercicio.pkg7;
import java.util.Scanner;

/**
 * Ejercicio 7
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        int diasemana;
        boolean laborable = false;
        Scanner entry = new Scanner(System.in);
        
            System.out.println("Introduzca el dia de la semana que es hoy (1 = lunes, 2 = martes ...): ");
            diasemana = entry.nextInt();
            
        switch (diasemana) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                laborable = true;
                break;
            case 6:
            case 7:
                laborable = false;
        }
        
        if (diasemana < 1 || diasemana > 7) {
            System.err.println("Introduzca un numero entre el 1 y el 7 (Ambos incluidos).");
        } else if (laborable) {
            System.out.println("Hoy es un dia laborable");
        } else {
            System.out.println("Hoy es un dia festivo");
        }
    }
    
}
