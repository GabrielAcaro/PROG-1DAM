package ejercicio24;
import java.util.Scanner;
/**
 * Ejercicio 24
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio24 {
    public static void main(String[] args) {
        int prog, lmsgi, bd, ed, si, ingp, media; 
        Scanner entry = new Scanner (System.in);
            System.out.println("Por favor introduzca la nota de Programacion: ");
            prog = entry.nextInt();
            System.out.println("Por favor introduzca la nota de Lenguaje de Marcas: ");
            lmsgi = entry.nextInt();
            System.out.println("Por favor introduzca la nota de Base de Datos: ");
            bd = entry.nextInt();
            System.out.println("Por favor introduzca la nota de Entornos de Desarrollo: ");
            ed = entry.nextInt();
            System.out.println("Por favor introduzca la nota de Sistemas Informaticos: ");
            si = entry.nextInt();
            System.out.println("Por favor introduzca la nota de Ingles Profesional: ");
            ingp = entry.nextInt();
            media = (prog + lmsgi + bd + si + ingp) / 5;
            System.out.println("Su nota media del curso es de: " + media);
    }
    
}
