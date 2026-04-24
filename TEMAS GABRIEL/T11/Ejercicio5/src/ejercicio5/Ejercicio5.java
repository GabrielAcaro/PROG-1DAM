package ejercicio5;

import java.util.LinkedHashMap;
import java.util.TreeMap;


/**
 * Ejercicio5
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio5 {
    public static final String[] YEARMOTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo",
        "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    
    
    public static void main(String[] args) {
        TreeMap<Integer, String> monthsTreeMap = new TreeMap<>();
        LinkedHashMap<Integer, String> monthsLinkedHashMap = new LinkedHashMap<>();
        
    
        for (int i = YEARMOTHS.length - 1; i >= 0; i--) {
            monthsTreeMap.put(i + 1, YEARMOTHS[i]);
        }
       
        for (int i = YEARMOTHS.length - 1; i >= 0; i--) {
           monthsLinkedHashMap.put(i + 1, YEARMOTHS[i]);
        }
         
        System.out.println("TreeMap:\n");
         
        for (Integer key : monthsTreeMap.keySet()) {
            System.out.println(key + " " + monthsTreeMap.get(key));
        }
         
        System.out.println("\nLinkedHashMap:\n");
         
        for (Integer key : monthsLinkedHashMap.keySet()) {
            System.out.println(key + " " + monthsLinkedHashMap.get(key));
        }
    }
}
