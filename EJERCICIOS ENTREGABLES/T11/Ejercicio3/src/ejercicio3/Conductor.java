package ejercicio3;

/**
 * Conductor
 * @author Gabriel Acaro Sánchez
 */
public class Conductor {
    // Atributos privados
    
    private String dni;
    private String nombre;
    
    // Constructor
    
    public Conductor() {
        dni = "";
        nombre = "";
    }
    
    public Conductor(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    
    // Getters y setters

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Otros metodos
    
    
    
    // To String

    @Override
    public String toString() {
        return "Conductor{" + "dni=" + dni + ", nombre=" + nombre + '}';
    }
}
