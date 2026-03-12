package ejercicio1;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejercicio1
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio1 {
    public static void fillList(ArrayList <String> list) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nIntroduzca el nombre de la persona a incluir en la lista: ");
        list.add(sc.nextLine());
    }
    
    public static void showList(ArrayList <String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> list = new ArrayList <>();
        
        int userOption = 0;
        
        do {
            System.out.println("\nIntroduzca la opcion que desee: ");
                System.out.println("\nIntroducir nombre en la lista: 1)");
                System.out.println("Mostrar nombres de la lista: 2)");
                System.out.println("Salir del programa: 3)");
            
            userOption = sc.nextInt();
            
            switch(userOption) {
                
                case 1 -> {
                    fillList(list);
                }
                
                case 2 -> {
                    showList(list);
                }
                
                case 3 -> {
                    System.out.println("\nSaliendo del programa...");
                    System.out.println("\nHa salido del programa correctamente!");
                }
                
                default -> {
                    System.err.println("\nIntroduzca un numero entre el 1 y el 3!");
                }
            }
        } while (userOption != 3);
    }
}
