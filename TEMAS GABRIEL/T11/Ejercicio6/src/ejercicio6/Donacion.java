package ejercicio6;

/**
 * Donacion
 * @author Gabriel Acaro Sánchez
 */
public class Donacion {
    
    // Atributos Privados
    
    private String nombre;
    private double donacion;
    
    // Constructores

    public Donacion() {
        nombre = "";
        donacion = 0;
    }

    public Donacion(String nombre, double donacion) {
        this.nombre = nombre;
        this.donacion = donacion;
    }
    
    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDonacion() {
        return donacion;
    }

    public void setDonacion(double donacion) {
        this.donacion = donacion;
    }
    
    // Otros Metodos
    
    
    
    // ToString

    @Override
    public String toString() {
        return "Donacion{" + "nombre=" + nombre + ", donacion=" + donacion + '}';
    }
}
