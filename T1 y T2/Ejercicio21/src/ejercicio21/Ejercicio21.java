package ejercicio21;
import java.util.Scanner;
/**
* Ejercicio 21
* @author Gabriel Acaro Sánchez
*/
public class Ejercicio21 {
    public static void main(String[] args) {
        int seconds, days, hours, minutes, seconds2;
        Scanner entry = new Scanner (System.in);
        
            System.out.print("Por favor, introduzca un numero de segundos: ");
            seconds = entry.nextInt();
            
        days = seconds / 86400;
        int resto = seconds % 86400;
        hours = resto / 3600;
        minutes = resto % 3600 / 60;
        seconds2 = resto % 60;
        System.out.println(seconds + " segundos hacen un total de: " + days + " dias, " + hours + " horas, " + minutes + " minutos y " + seconds2 + " segundos.");
    }
    
}
