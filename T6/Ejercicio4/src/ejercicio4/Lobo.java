package ejercicio4;

/**
 * Lobo
 * @author Gabriel Acaro Sánchez
 */
public class Lobo extends Canido {

    // Atributos privados

    // Constructores
    public Lobo() {
        super();
    }

    public Lobo(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }

    // Getters y setters

    // Otros metodos
    @Override
    public String sonido() { return "Aullido"; }

    @Override
    public String alimentacion() { return "Carnivora"; }

    @Override
    public String habitat() { return "Bosque"; }

    @Override
    public String nombreCientifico() { return "Canis lupus"; }

    // ToString()
    @Override
    public String toString() { return super.toString(); }
}
