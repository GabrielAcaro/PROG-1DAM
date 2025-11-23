package ejercicio19;

/**
 * Test
 * @author Gabriel Acaro Sánchez
 */
public class Test {
    public static void main(String[] args) {
        
        // Creolos objetos empleado
        
        Empleado emp1 = Empleado.leerEmpleado();
        Empleado emp2 = Empleado.leerEmpleado();
        Empleado emp3 = Empleado.leerEmpleado();

        // Mostramos los sueldos brutos
        
        System.out.println("\nSueldos brutos de los empleados:");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
    }
}
