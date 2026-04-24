package ejercicio4;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Ejercicio4
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio4 {
    public static final String[] YEARMOTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo",
        "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    
    
    public static void main(String[] args) {
         HashSet<String> monthsNotLinked = new HashSet<>();
         LinkedHashSet<String> monthsLinked = new LinkedHashSet<>();
         
         for (int i = 0; i < YEARMOTHS.length; i++) {
            monthsNotLinked.add(YEARMOTHS[i]);
        }
         for (int i = 0; i < YEARMOTHS.length; i++) {
            monthsLinked.add(YEARMOTHS[i]);
        }
         
         System.out.println("HashSet:\n");
         
         for (String elem : monthsNotLinked) {
             System.out.println(elem);
         }
         
         System.out.println("\nLinkedHashSet:\n");
         
         for (String elem : monthsLinked) {
             System.out.println(elem);
         }
         
         
         
         
         
    }

}
