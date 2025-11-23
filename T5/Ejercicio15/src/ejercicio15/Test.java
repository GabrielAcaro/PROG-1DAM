package ejercicio15;

/**
 * Test
 * @author Gabriel Acaro Sánchez
 */
public class Test {
    
    // Inicio de la clase Main
    
    public static void main(String[] args) {
        
        // Creo los objetos Direccion
        
        Direccion dir1 = new Direccion("Calle Real", 10, "3A", "Madrid");
        Direccion dir2 = new Direccion("Gran Via", 25, "2B", "Barcelona");
        Direccion dir3 = new Direccion("Avenida del Sol", 5, "1C", "Valencia");

        // Creo los empleados
        
        Empleado emp1 = new Empleado("Juan Perez", 1800, dir1);
        Empleado emp2 = new Empleado("Maria Lopez", 2000, dir2);
        Empleado emp3 = new Empleado("Carlos Ruiz", 1700, dir3);

        // Mostramos la informacion
        
        System.out.println("EMPLEADO 1:");
        emp1.mostrarDatos();
        System.out.println("\nEMPLEADO 2:");
        emp2.mostrarDatos();
        System.out.println("\nEMPLEADO 3:");
        emp3.mostrarDatos();
    }
}
