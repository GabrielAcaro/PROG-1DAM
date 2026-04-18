package ejercicio7;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejercicio7
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio7 {
    public static final String[] DAYSOFTHEWEEK = {"Lunes", "Martes", "Miercoles", "Jueves",
        "Viernes", "Sabado", "Domingo"};
    public static final int WEEKS = 4;
    
    public static void menu() {
        System.out.println("\nIntroduzca uno de estos numeros para usar el programa: ");
            System.out.println("\nAñadir las ventas de coches de cada mes del año: 1)");
            System.out.println("Mostrar ventas de coches: 2)");
            System.out.println("Mostrar ventas de coches al reves: 3)");
            System.out.println("Mostrar la suma total de ventas de coches del año: 4)");
            System.out.println("Mostrar la suma total de ventas de coches del año que comiencen por 'a': 5)");
            System.out.println("Mostrar el nombre del mes o meses con mas ventas: 6)");
            System.out.println("Salir del programa: 0)");
    }
    
    public static String scanner(){
        Scanner scanner = new Scanner(System.in);
        String sc = "";
        
        return sc = scanner.nextLine();
    }
    
    public static void fillTemperaturesList(ArrayList<Integer> intList) {
        int monthAverageTemperature = 0;

        for (int j = 0; j < WEEKS; j++) {
            System.out.println("--- Semana " + (j + 1) + " ---");
            for (int i = 0; i < DAYSOFTHEWEEK.length; i++) {
                System.out.println("Introduzca la temperatura media del " + DAYSOFTHEWEEK[i] + ":");
                intList.add(monthAverageTemperature = Integer.parseInt(scanner()));
            }
        }
    }
    
    public static void showTemperaturesList(ArrayList<Integer> intList) {
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i));
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        int userOption = 0;
        
        do {
            menu();
            
            userOption = Integer.parseInt(scanner());
            
            switch (userOption) {
                case 1 -> {
                    fillTemperaturesList(intList);
                }
                
                case 2 -> {
                    showTemperaturesList(intList);
                }
                
                case 3 -> {
                    showCarSalesReversed(intList);
                }
                
                case 4 -> {
                    showTotalCarSales(intList);
                }
                
                case 5 -> {
                    showTotalCarSalesByLetterA(intList);
                }
                
                case 6 -> {
                    showTopSalesMonth(intList);
                }
                
                case 0 -> {
                    System.out.println("\nSaliendo del programa...");
                    System.out.println("Ha salido correctamente.");
                }
                
                default -> {
                    System.out.println("\nIntroduzca un numero entre el 0 y el 6!");
                }
            }
        } while (userOption != 0);
    }
}
