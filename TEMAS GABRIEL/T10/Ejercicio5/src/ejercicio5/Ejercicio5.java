package ejercicio5;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejercicio5
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio5 {
    public static void menu() {
        System.out.println("\nIntroduzca uno de estos numeros para usar el programa: ");
            System.out.println("\nAñadir valores a la lista: 1)");
            System.out.println("Mostrar lista: 2)");
            System.out.println("Calcular el valor par mas alto: 3)");
            System.out.println("Calcular el valor impar mas bajo: 4)");
            System.out.println("Intercambiar las posiciones del par mas alto y el impar mas bajo: 5)");
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
    
    public static void showList(ArrayList<Integer> list) {
        System.out.println("\nLa lista contiene:");
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Posicion " + i + ": " + list.get(i));
        }
    }
    
    public static int calcHigherEvenNum(ArrayList<Integer> list) {
        int aux = 0;
        int j = 0;
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > aux && list.get(i) % 2 == 0) {
                aux = list.get(i);
                j = i;
            }
        }
        
        System.out.println("\nEl numero par mas grande es: \n" + aux);
        
        return j;
    }
    
    public static int calcLowerOddNum(ArrayList<Integer> list) {
        int aux = list.get(0);
        int j = 0;
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < aux && list.get(i) % 2 != 0) {
                aux = list.get(i);
                j = i;
            }
        }
        
        System.out.println("\nEl numero impar mas pequeño es: \n" + aux);
        
        return j;
    }
    
    public static void valuesExchanger(ArrayList<Integer> list) {
        int higherEvenNum = calcHigherEvenNum(list);
        int lowerOddNum = calcLowerOddNum(list);
        int aux = 0;
        
        aux = list.get(higherEvenNum);
        list.set(higherEvenNum, list.get(lowerOddNum));
        list.set(lowerOddNum, aux);
        
        System.out.println("\nPosiciones " + higherEvenNum + " y " + lowerOddNum + " intercambiadas.");
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
                    fillArrayList(list);
                }
                
                case 2 -> {
                    showList(list);
                }
                
                case 3 -> {
                    calcHigherEvenNum(list);
                }
                
                case 4 -> {
                    calcLowerOddNum(list);
                }
                
                case 5 -> {
                    valuesExchanger(list);
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
