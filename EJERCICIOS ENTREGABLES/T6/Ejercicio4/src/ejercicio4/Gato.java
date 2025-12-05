package ejercicio4;

/**
 * Gato
 * @author Gabriel Acaro Sánchez
 */
public class Gato extends Felino {

    // Atributos privados

    // Constructores
    public Gato() {
        super();
    }

    public Gato(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }

    // Getters y setters

    // Otros metodos
    @Override
    public String sonido() { return "Maullido"; }

    @Override
    public String alimentacion() { return "Ratones"; }

    @Override
    public String habitat() { return "Domestico"; }

    @Override
    public String nombreCientifico() { return "Felis silvestris catus"; }

    // ToString()
    @Override
    public String toString() { return super.toString(); }
}
