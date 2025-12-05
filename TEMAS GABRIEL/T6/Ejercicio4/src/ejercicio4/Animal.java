package ejercicio4;

/**
 * Animal
 * @author Gabriel Acaro Sánchez
 */
public abstract class Animal {

    // Atributos privados
    private String nombre;
    private int edad;
    private double peso;

    // Constructores
    public Animal() {
        this.nombre = "";
        this.edad = 0;
        this.peso = 0.0;
    }

    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Otros metodos
    public abstract String sonido();
    public abstract String alimentacion();
    public abstract String habitat();
    public abstract String nombreCientifico();

    // ToString()
    @Override
    public String toString() {
        return "Nombre: " + getNombre() +
               ", Edad: " + getEdad() +
               ", Peso: " + getPeso() +
               ", Sonido: " + sonido() +
               ", Alimentacion: " + alimentacion() +
               ", Habitat: " + habitat() +
               ", NombreCientifico: " + nombreCientifico();
    }
}
