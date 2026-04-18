package ejercicio1;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio1
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio1 {
    public static void menu() {
        System.out.println("Introduzca una de estas opciones para usar el programa:");
            System.out.println("Añadir contactos a la agenda: 1)");
            System.out.println("Visualizar la lista de contactos: 2)");
            System.out.println("Eliminar contactos de la lista: 3)");
            System.out.println("Mostrar todos los contactos ordenados por su edad: 4)");
            System.out.println("Salir del programa: 5)");
    }
    
    public static String scanner(){
        Scanner entry = new Scanner(System.in);
        
        return entry.nextLine();
    }
    
    public static void addContact(ArrayList<Agenda> contacts) {
        String name = "";
        int age = 0, phoneNumber = 0;
        
        System.out.println("Introduzca el nombre del nuevo contacto: ");
        name = scanner();
        
        System.out.println("Introduzca la edad del nuevo contacto: ");
        age = Integer.parseInt(scanner());
        
        System.out.println("Introduzca el numero del nuevo contacto: ");
        phoneNumber = Integer.parseInt(scanner());
        
        Agenda contact = new Agenda(name, age, phoneNumber);
        
        for (int i = 0; i < contacts.size(); i++) {
            contacts.add(contact);
        }
    }
    
    public static void showContactList(ArrayList<Agenda> contacts) {
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println(contacts.get(i));
        }
    }
    
    public static void removeContact(ArrayList<Agenda> contacts) {
        int phoneNumber = 0;
        
        System.out.println("Introduzca el numero de telefono del contacto a eliminar:");
        phoneNumber = Integer.parseInt(scanner());
        
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getNumMovil() ==  phoneNumber){
                contacts.remove(i);
            }
        }
    }
    
    public static void showContactListOrderByAge(ArrayList<Agenda> contacts) {
        
        for (int i = 0; i < contacts.size() - 1; i++) {
            for (int j = 0; j < contacts.size() - 1 - i; j++) {
                Agenda aux = new Agenda();
                if (contacts.get(j).getEdad() < contacts.get(j+1).getEdad()) {
                     aux.setNombre(contacts.get(j).getNombre());
                     aux.setEdad(contacts.get(j).getEdad());
                     aux.setNumMovil(contacts.get(j).getNumMovil());
                     
                     contacts.set(contacts.get(j+i));
                }
            }
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Agenda> contacts = new ArrayList<>();
        int userOption = 0;
        
        do {
            try {
                userOption = Integer.parseInt(scanner());
                switch (userOption) {
                case 1 -> {
                    addContact(contacts);
                }
                case 2 -> {
                    showContactList(contacts);
                }
                case 3 -> {
                    
                }
                case 4 -> {
                    
                }
                case 5 -> {
                    System.out.println("Saliendo del programa...");
                }
                default ->{
                    System.err.println("Introduzca un numero entre el 1 y el 5!");
                }
            }
            } catch (InputMismatchException e) {
                System.err.println("Caracter inválido!");
                userOption = 0;
            }
        } while (userOption != 5);
    }

}
