package ejercicio1;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Ejercicio1
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio1 {
    public static final String[] WEEKDAYS = {"Lunes", "Martes", "Miercoles",
        "Jueves", "Viernes", "Sabado", "Domingo"};
    
    public static void menu() {
        System.out.println("Pulse uno de estos numeros para seleccionar una opcion:");
            System.out.println("Rellenar el mapa de las temperaturas del mes: 1)");
            System.out.println("Mostrar las temperaturas del mes: 2)");
            System.out.println("Ver la temperatura media del mes: 3)");
            System.out.println("Dia o dias mas calurosos del mes: 4)");
            System.out.println("Salir del programa: 5)");
    }
    
    public static String scanner() {
        Scanner entry = new Scanner(System.in);
        
        return entry.nextLine();
    }
    
    public static void fillTemperatures(HashMap<Integer,Dia> temperatures) {
        int randomStartDay = (int) (Math.random() * (1 - 7 + 1)) + 7;
        
        
        for (int i = 0; i < 31; i++) {
            int temp = (int) (Math.random() * (40 - 25 + 1)) + 25;
            
            String dayName = WEEKDAYS[(randomStartDay + i -1) % 7];
            
            Dia d = new Dia(dayName, temp);
            
            temperatures.put(i, d);
        }
    }
    
    public static void showTemperatures(HashMap<Integer, Dia> temperatures) {
        for (Integer key : temperatures.keySet()) {
            Dia d = temperatures.get(key);

            System.out.println("Dia " + (key + 1) + ", " 
                + d.getNombreDia() + ", " 
                + d.getTemperatura() + " grados");
        }
        System.out.println("");
    }
    
    public static void monthAverageTemperature(HashMap<Integer, Dia> temperatures) {
        int average = 0, aux = 0;
        
        for (int i = 0; i < temperatures.size(); i++) {
            Dia d = temperatures.get(i);
            
            aux += d.getTemperatura();
        }
        
        average = aux / 31;
        
        System.out.println("La media de temperaturas del mes es de: " + average + " grados.\n");
    }
    
    public static void hottestDay(HashMap<Integer, Dia> temperatures) {
        int aux = 0;
        
        for (int i = 0; i < temperatures.size(); i++) {
            Dia d = temperatures.get(i);
            
            if (aux < d.getTemperatura()) {
                aux = d.getTemperatura();
            }
        }
        
        System.out.println("Los dias mas calurosos del mes son:");
        
        for (Integer key : temperatures.keySet()) {
            Dia d = temperatures.get(key);
            
            if (aux == d.getTemperatura()) {
                System.out.println(d.getNombreDia() + ", día " + (key + 1) 
                        + " con " + d.getTemperatura() + " grados.");
            }
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int userOption = 0;
        HashMap<Integer,Dia> temperatures = new HashMap<>();
        do {
            menu();
            
            try {
                userOption = Integer.parseInt(scanner());
            } catch (NumberFormatException e) {
                userOption = -1;
            }
            
            switch(userOption) {
                case 1 -> {
                    fillTemperatures(temperatures);
                }
                case 2 -> {
                    showTemperatures(temperatures);
                }
                case 3 -> {
                    monthAverageTemperature(temperatures);
                }
                case 4 -> {
                    hottestDay(temperatures);
                }
                case 5 -> {
                    System.out.println("\nSaliendo del programa...");
                    System.out.println("Saliste del programa correctamente");
                }
                default -> {
                    System.err.println("\nIntroduzca un numero entre el 1 y el 5!\n");
                }
            }
        } while(userOption != 5);
    }

}
