package ejercicio8;

/**
 * Sede
 * @author Gabriel Acaro Sánchez
 */
public class Sede {
    // Atributos privados
    
    private String nombre;
    private double ingresos;
    
    // Constructores

    public Sede() {
        nombre = "";
        ingresos = 0;
    }

    public Sede(String nombre, double ingresos) {
        this.nombre = nombre;
        this.ingresos = ingresos;
    }
    
    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }
    
    // Otros metodos
    
    
    
    // ToString

    @Override
    public String toString() {
        return "Sede{" + "nombre=" + nombre + ", ingresos=" + ingresos + '}';
    }
}
