package ejercicio15;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejercicio15
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio15 {
    
    // Comienzo del menu del programa
    
    public static void menu() {
        System.out.println("Pulse alguno de estos numeros para usar el programa");
            System.out.println("Añadir empresas junto a sus empleados a una lista: 1)");
            System.out.println("Mostrar las empresas de la lista junto a sus empleados: 2)");
            System.out.println("Mostrar los empleados cuyo nombre contenga la letra 'A': 3)");
            System.out.println("Mostrar todos los empleados ordenados por el sueldo que cobran: 4)");
            System.out.println("Salir del programa: 0)");
    }
    
    // Metodo de scanner
    
    public static String scanner(){
        Scanner scanner = new Scanner(System.in);
        String sc = "";
        
        return sc = scanner.nextLine();
    }
    
    // Comienzo del metodo de mostrar los empleados que contengan la letra A
    
    public static void mostrarEmpleadosConA(ArrayList<Empresa> listaEmpresa) {
        for (int i = 0; i < listaEmpresa.size(); i++) { // Recorremos la lista de empresa
            ArrayList<Empleados> listaEmpleados = listaEmpresa.get(i).getListaEmpleados(); // Creamos la lista de empleados y la obtenemos de la lista de empresas
            for (int j = 0; j < listaEmpleados.size(); j++) { // Recoremos la lista de empleados
                if (listaEmpleados.get(j).getNombreEmpleado().toLowerCase().contains("a")) { // Si contiene la a lo mostramos
                    System.out.println(listaEmpleados.get(j).toString());
                }
            }
        }
    }
    
    // Comienzo del metodo que muestra todos los empleados ordenados por el sueldo que cobran (mayor a menor)
    
    public static void mostrarEmpleadosOrdenarSalario(ArrayList<Empresa> listaEmpresa) {
        ArrayList<Empleados> todosEmpleados = new ArrayList<>();
    
        // Recorremos la lista de empresas y añadimos todos los empleados a una sola lista
        
        for (int i = 0; i < listaEmpresa.size(); i++) {
            ArrayList<Empleados> listaEmpleados = listaEmpresa.get(i).getListaEmpleados();
            for (int j = 0; j < listaEmpleados.size(); j++) {
                todosEmpleados.add(listaEmpleados.get(j));
            }
        }
    
        // Ordenamos la lista de mayor a menor salario con burbuja
    
        for (int i = 0; i < todosEmpleados.size() - 1; i++) {
            for (int j = 0; j < todosEmpleados.size() - 1 - i; j++) {
                if (todosEmpleados.get(j).getSueldo() < todosEmpleados.get(j + 1).getSueldo()) {
                    Empleados temp = todosEmpleados.get(j);
                    todosEmpleados.set(j, todosEmpleados.get(j + 1));
                    todosEmpleados.set(j + 1, temp);
                }
            }
        }
    
        // Mostramos la lista ordenada
        for (int i = 0; i < todosEmpleados.size(); i++) {
            System.out.println(todosEmpleados.get(i).toString());
        }
    }
            
    public static void main(String[] args) {
        ArrayList<Empresa> listaEmpresa = new ArrayList<>(); // Creamos la lista de empresas
        
        int userOption = 0;
        
        do {
            menu(); // Llamamos al menu
            
            userOption = Integer.parseInt(scanner()); // Utilizamos el metodo parseInt para reutilizar el metodo scanner
            
            switch (userOption){
                case 1 -> {
                    Empresa.rellenarListaEmpresa(listaEmpresa); // Llamamos al metodo correspondiente
                }
                case 2 -> {
                    Empresa.mostrarEmpresas(listaEmpresa); // Llamamos al metodo correspondiente
                }
                case 3 -> {
                    mostrarEmpleadosConA(listaEmpresa); // Llamamos al metodo correspondiente
                }
                case 4 -> {
                    mostrarEmpleadosOrdenarSalario(listaEmpresa); // Llamamos al metodo correspondiente
                }
                case 0 -> {
                    System.out.println("\nSaliendo del programa...");
                    System.out.println("Saliste del programa correctamente.");
                }
                default -> {
                    System.out.println("Introduzca un numero entre el 0 y el 4");
                }
            }
        } while (userOption != 0);
    }
}
