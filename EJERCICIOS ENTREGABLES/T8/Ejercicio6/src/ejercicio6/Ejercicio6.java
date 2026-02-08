package ejercicio6;
import java.util.Scanner;

/**
 * Ejercicio6
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio6 {
    // Comienzo del metodo que inicializa los objetos Employee en un vector Employee[]
    
    public static Employee[] createEmployees() {
        Scanner entry = new Scanner(System.in);
        int employeesNum = 0;
        
        employeesNum = entry.nextInt(); // Pedimos el numero de empleados a introducir al sistema
        
        Employee[] employeesVector = new Employee[employeesNum]; // Creamos el vector en base al numero de empleados que quiera introducir el usuario

        for (int i = 0; i < employeesVector.length; i++) {
            employeesVector[i] = new Employee(); // Recorremos el vector con un for e inicializamos cada uno de los objetos
        }
        
        return employeesVector;
    }
    
    public static void createModifiedEmployees(Employee[] employeesVector) {
        Scanner entry = new Scanner(System.in);
        
        String name = "";
        int workedHours = 0, workFee = 0;
        
        for (int i = 0; i < employeesVector.length; i++) { // Recorremos el vector con un for
            System.out.println("\nIntroduzca el nombre del empleado " + (i + 1)); // El i+1 es para facilitar al usuario la lectura y que comience en empleado 1 (no en empleado 0)
            
            employeesVector[i].setName(name = entry.nextLine()); // Llamo al .set correspondiente y al scanner para introducir datos del usuario
            
            System.out.println("\nIntroduzca el numero de horas trabajadas a la semana del empleado " + (i + 1));
            
            employeesVector[i].setWorkedHours(workedHours = entry.nextInt()); // Llamo al .set correspondiente y al scanner para introducir datos del usuario
            entry.nextLine(); // Limpiamos el buffer para reutilizar el mismo Scanner
            
            System.out.println("\nIntroduzca la tarifa por horas del empleado " + (i + 1));
            
            employeesVector[i].setWorkFee(workFee = entry.nextInt()); // Llamo al .set correspondiente y al scanner para introducir datos del usuario
            entry.nextLine(); // Limpiamos el buffer para reutilizar el mismo Scanner
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Introduzca la cantidad de empleados a introducir en el sistema: ");
        
        Employee[] employeesVector = createEmployees(); // Igualo un vector del objeto Employee al metodo createEmployees() para crear e inicializar los objetos
        
        createModifiedEmployees(employeesVector); // Llamo al metodo createModifiedEmployee() para introducir los datos de los empleados
        
        Employee.showSalary(employeesVector); // Llamo al metodo de la clase Employee para mostrar el salario de los empleados del vector
        
    }
}