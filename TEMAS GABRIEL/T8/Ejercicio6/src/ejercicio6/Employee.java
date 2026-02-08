package ejercicio6;

/**
 * Empleados
 * @author Gabriel Acaro Sánchez
 */
public class Employee {
    // Atributos privados
    
    private String name;
    private int workedHours;
    private int workFee;
    
    // Constructores
    
    public Employee() {
        name = "";
        workedHours = 0;
        workFee = 0;
    }
        
    public Employee(String name, int workedHours, int workFee) {
        this.name = name;
        this.workedHours = workedHours;
        this.workFee = workFee;
    }
    
    // Getters y setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    public int getWorkFee() {
        return workFee;
    }

    public void setWorkFee(int workFee) {
        this.workFee = workFee;
    }
    
    // Otros métodos
    
    public static void showSalary(Employee[] employeesVector) {
        int salary = 0;
        
        // Recorro el vector con un for
        
        for (int i = 0; i < employeesVector.length; i++) {
            
            // Si el trabajador trabaja 40 horas... (Debe de trabajar 40h ya que si no, seria despedido o si esta de vacaciones las horas se pagan)
           
            if (employeesVector[i].getWorkedHours() == 40) { 
                
                // Obtengo lo que valgan los atributos de los objetos del vector y calculo el salario
                
                salary = (employeesVector[i].getWorkedHours() * employeesVector[i].getWorkFee()) * 4; 
            
                System.out.println("\nEl sueldo al mes de " + employeesVector[i].getName() + " que trabaja " + employeesVector[i].getWorkedHours() + " horas por semana y cobra " + employeesVector[i].getWorkFee() + " euros la hora es de: " + salary + " euros");
                
                // Si el empleado trabaja mas de 40 horas...
                
            } else if (employeesVector[i].getWorkedHours() > 40) {
                
                // Obtengo lo que valgan los atributos de los objetos del vector y calculo el salario
                
                salary = (employeesVector[i].getWorkedHours() * (employeesVector[i].getWorkFee() + employeesVector[i].getWorkFee() / 2)) * 4; 
            
                System.out.println("\nEl sueldo al mes de " + employeesVector[i].getName() + " que trabaja " + employeesVector[i].getWorkedHours() + " horas por semana y cobra " + employeesVector[i].getWorkFee() + " euros la hora es de: " + salary + " euros");
            }  
        }
    }
    
    // ToString()

    @Override
    public String toString() {
        return "Employees{" + "name=" + name + ", workedHours=" + workedHours + ", workFee=" + workFee + '}';
    }
}
