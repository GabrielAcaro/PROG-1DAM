package ejercicio5;

/**
 * Contacto
 * @author Gabriel Acaro Sánchez
 */
public class Contacto {
    // Atributos privados
    
    private String nombre;
    private int edad;
    private int numeroTelefono;
    
    // Constructores

    public Contacto() {
        nombre = "";
        edad = 0;
        numeroTelefono = 0;
    }

    public Contacto(String nombre, int edad, int numeroTelefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroTelefono = numeroTelefono;
    }
    
    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    
    // Otros metodos
    
    
    
    // ToString

    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", edad=" + edad + ", numeroTelefono=" + numeroTelefono + '}';
    }
}
