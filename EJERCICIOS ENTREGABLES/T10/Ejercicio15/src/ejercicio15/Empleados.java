package ejercicio15;

/**
 * Empleados
 * @author Gabriel Acaro Sánchez
 */
public class Empleados {
    
    // Atributos privados
    
    private String nombreEmpleado;
    private int sueldo;
    
    // Constructores
    
    public Empleados() {
        nombreEmpleado = "";
        sueldo = 0;
    }

    public Empleados(String nombreEmpleado, int sueldo) {
        this.nombreEmpleado = nombreEmpleado;
        this.sueldo = sueldo;
    }
    
    // Getter y setter

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    // ToString

    @Override
    public String toString() {
        return nombreEmpleado
                + "\nSueldo: " + sueldo;
    }
}
