package ejercicio4;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejercicio4
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio4 {
    public static void menu() {
        System.out.println("\nIntroduzca uno de estos numeros para usar el programa: ");
            System.out.println("\nAñadir valores a la lista: 1)");
            System.out.println("Mostrar lista: 2)");
            System.out.println("Cambiar valores duplicados por 0: 3)");
            System.out.println("Salir del programa: 0)");
    }
    
    public static void fillArrayList(ArrayList<Integer> list) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        
        System.out.println("\nIntroduzca el numero a incluir en la lista: ");
        num = sc.nextInt();
        
        if (num <= 0) {
            System.err.println("\nIntroduzca un numero positivo y mayor que 0!");
            num = sc.nextInt();
        }
            
        list.add(num);
    }
    
    public static void duplicateValuesExchanger(ArrayList<Integer> list) {
        System.out.println("\nCambiando valores duplicados por 0...");
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j)) && !list.get(i).equals(0)) {
                    list.set(i, 0);
                    list.set(j, 0);
                }
            }
        }
        System.out.println("Valores cambiados.");
    }
    
    public static void showList(ArrayList<Integer> list) {
        System.out.println("\nLa lista contiene:");
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Posicion " + i + ": " + list.get(i));
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        int userOption = 0;
        do {
            menu();
            userOption = sc.nextInt();
            
            switch(userOption) {
                case 1 -> {
                    fillArrayList(list);
                }
                
                case 2 -> {
                    showList(list);
                }
                
                case 3 -> {
                    duplicateValuesExchanger(list);
                }
                
                case 0 -> {
                    System.out.println("\nSaliendo del programa...");
                    System.out.println("Ha salido correctamente.");
                }
                
                default -> {
                    System.err.println("Introduzca un numero entre el ");
                }
            }
        } while (userOption != 0);
    }

}
