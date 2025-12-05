package ejercicio19;
import java.util.Scanner;

/**
 * Empleado
 * @author Gabriel Acaro Sánchez
 */
public class Empleado {
    
    // Atributos privados
    
    private String nombre;
    private int horasTrabajadas;
    private double tarifaHora;

    // Constructores
    
    public Empleado() {
        nombre = "";
        horasTrabajadas = 0;
        tarifaHora = 0;
    }
    
    public Empleado(String nombre, int horasTrabajadas, double tarifaHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }
    
    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    // Otros metodos
    
    public double sueldoBruto() {
        if (horasTrabajadas <= 40) {
            return horasTrabajadas * tarifaHora;
        } else {
            int horasExtra = horasTrabajadas - 40;
            return 40 * tarifaHora + horasExtra * tarifaHora * 1.5;
        }
    }

    public static Empleado leerEmpleado() {
        Scanner entry = new Scanner(System.in);
        System.out.print("Introduce el nombre del empleado: ");
        String nombre = entry.nextLine();
        System.out.print("Introduce las horas trabajadas: ");
        int horas = entry.nextInt();
        System.out.print("Introduce la tarifa por hora: ");
        double tarifa = entry.nextDouble();
        return new Empleado(nombre, horas, tarifa);
    }

    // toString()
    
    @Override
    public String toString() {
        return nombre + " trabajo " + horasTrabajadas + " horas, cobra " +
            tarifaHora + " euros por hora, por lo que le corresponde un sueldo de " +
            sueldoBruto() + " euros";
}

}
