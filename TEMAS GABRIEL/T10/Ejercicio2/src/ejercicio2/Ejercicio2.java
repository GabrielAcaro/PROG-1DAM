package ejercicio2;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejercicio2
 * @author Gabriel Acaro Sánchez
 */

public class Ejercicio2 {
    
    public static void menu() {
        System.out.println("\nIntroduzca uno de estos numeros para usar el programa: ");
            System.out.println("\nAñadir valores a la lista: 1)");
            System.out.println("Mostrar lista: 2)");
            System.out.println("Calcular el valor mas alto: 3)");
            System.out.println("Calcular el valor mas bajo: 4)");
            System.out.println("Calcular la suma de todos los numeros: 5)");
            System.out.println("Salir del programa: 0)");
    }
    
    public static void addValuesIntoList(ArrayList<Integer> list) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        
        System.out.println("\nIntroduzca el numero a incluir en la lista: ");
        num = sc.nextInt();
          
        if (num < 0) {
            System.err.println("\nIntroduzca un numero positivo!");
            num = sc.nextInt();
        }
            
        list.add(num);
    }
    
    public static void calcHigherNum(ArrayList<Integer> list) {
        int aux = 0;
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > aux) {
                aux = list.get(i);
            }
        }
        
        System.out.println("\nEl numero mas grande es: \n" + aux);
    }
    
    public static void calcLowerNum(ArrayList<Integer> list) {
        int aux = list.get(0);
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < aux) {
                aux = list.get(i);
            }
        }
        
        System.out.println("\nEl numero mas pequeño es: \n" + aux);
    }
    
    public static void calcAllNumSum(ArrayList<Integer> list) {
        int aux = 0;
        
        for (int i = 0; i < list.size(); i++) {
            aux += list.get(i);
        }
        
        System.out.println("\nLa suma de los numero de la lista da: \n" + aux);
    }
    
    public static void showList(ArrayList<Integer> list) {
        System.out.println("\nLa lista contiene: ");
        
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
            
            switch (userOption) {
                case 1 -> {
                    addValuesIntoList(list);
                }
                
                case 2 -> {
                    showList(list);
                }
                
                case 3 -> {
                    calcHigherNum(list);
                }
                
                case 4 -> {
                    calcLowerNum(list);
                }
                
                case 5 -> {
                    calcAllNumSum(list);
                }
                
                case 0 -> {
                    System.out.println("\nSaliendo del programa...");
                    System.out.println("Ha salido correctamente.");
                }
                
                default -> {
                    System.out.println("\nIntroduzca un numero entre el 0 y el 5!");
                }
            }
        } while (userOption != 0);
    }
}
