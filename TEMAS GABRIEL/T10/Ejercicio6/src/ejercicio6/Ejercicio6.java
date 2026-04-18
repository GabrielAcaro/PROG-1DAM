package ejercicio6;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejercicio6
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio6 {
    public static final String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    
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
    
    public static void fillCarSales(ArrayList<Integer> intList) {
        int ventasUser = 0;
    
        for (int i = 0; i < MONTHS.length; i++) {
            System.out.println("Introduzca las ventas de coches de " + MONTHS[i] + ":");
            intList.add(i, ventasUser = Integer.parseInt(scanner()));
        }
    }
    
    public static void showCarSales(ArrayList<Integer> intList) {
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i));
        }
    }
    
    public static void showCarSalesReversed(ArrayList<Integer> intList) {
        for (int i = intList.size() - 1; i >= 0; i--) {
            System.out.println(intList.get(i));
        }
    }
    
    public static void showTotalCarSales(ArrayList<Integer> intList) {
        int suma = 0;
        
        for (int i = 0; i < intList.size(); i++) {
            suma += intList.get(i);
        }
        System.out.println("La suma de todas las ventas del año es: " + suma);
    }
    
    public static void showTotalCarSalesByLetterA(ArrayList<Integer> intList) {
        int suma = 0;
        
        for (int i = 0; i < intList.size(); i++) {
            if (MONTHS[i].contains("a") || MONTHS[i].contains("A")) {
                suma += intList.get(i);
            }
        }
        System.out.println("La suma de todas las ventas del año que tengan la letra 'a' es: " + suma);
    }
    
    public static void showTopSalesMonth(ArrayList<Integer> intList) {
        int topSalesMonth = -1, index = -1, j = 0;
        boolean repeated = false;
        
        for (int i = 0; i < intList.size(); i++) {
            if (topSalesMonth < intList.get(i)) {
                topSalesMonth = intList.get(i);
                index = i;
            }
        }
        
        while (j < intList.size()) {
            if (intList.get(j) == topSalesMonth && j != index) {
                repeated = true;
            }
            j++;
        }

        if (!repeated) {
            System.out.println("El mes con mas ventas es: " + MONTHS[index]);
        } else {
            System.out.println("Los meses con mas ventas son: ");
            
            for (int i = 0; i < intList.size(); i++) {
                if (intList.get(i) == topSalesMonth) {
                    System.out.println(MONTHS[i]);
                }
            }
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
                    fillCarSales(intList);
                }
                
                case 2 -> {
                    showCarSales(intList);
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
