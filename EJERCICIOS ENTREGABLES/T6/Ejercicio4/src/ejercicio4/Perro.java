package ejercicio4;

/**
 * Perro
 * @author Gabriel Acaro Sánchez
 */
public class Perro extends Canido {

    // Atributos privados

    // Constructores
    public Perro() {
        super();
    }

    public Perro(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }

    // Getters y setters

    // Otros metodos
    @Override
    public String sonido() { return "Ladrido"; }

    @Override
    public String alimentacion() { return "Carnivora"; }

    @Override
    public String habitat() { return "Domestico"; }

    @Override
    public String nombreCientifico() { return "Canis lupus familiaris"; }

    // ToString()
    @Override
    public String toString() { return super.toString(); }
}
