package ejercicio3;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejercicio3
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio3 {
    public static void insertNumIntoList(ArrayList<Integer> list) {
        Scanner sc = new Scanner(System.in);
        int userOption = 0, num = 0;
        
        do {
            System.out.println("\nDesea introducir un numero?");
            System.out.println("\nSI: 1)");
            System.out.println("NO: 0)");
            
            userOption = sc.nextInt();
            
            switch (userOption) {
                case 1 -> {
                    System.out.println("\nIntroduzca el numero:");
                    num = sc.nextInt();
                    list.add(num);
                }
                case 0 -> {
                    System.out.println("\nSaliendo de la introduccion de datos...");
                    System.out.println("Saliste correctamente");
                }
                default -> System.err.println("Introduzca 1 o 0!");
            }
            
        } while(userOption != 0);
    }
    
    public static void showList(ArrayList<Integer> list) {
        System.out.println("\nLa lista contiene:");
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Posicion " + i + ": " + list.get(i));
        }
    }
    
    public static void changeArrayListPositions(ArrayList<Integer> list) {
        int aux = 0;
        
        if (list.size() > 4) {
            aux = list.get(2);
            list.set(2, list.get(4));
            list.set(4, aux);
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.println("\nIntroduzca los numeros que prefiera para añadir a la lista:");
        
        insertNumIntoList(list);
        
        System.out.println("\nMostrando la lista... ");
        
        showList(list);
        
        
        if (list.size() >= 4) {
            System.out.println("\nIntercambiando las posiciones 2 y 4...");
            
            changeArrayListPositions(list);
            
            System.out.println("Posiciones intercambiadas.");
        
            System.out.println("\nMostrando la lista... ");
        
            showList(list);
        } else {
            System.err.println("Para intercambiar los valores introduzca mas valores a la lista!");
        }
    }
}
