package ejercicio4;

/**
 * Leon
 * @author Gabriel Acaro Sánchez
 */
public class Leon extends Felino {

    // Atributos privados

    // Constructores
    public Leon() {
        super();
    }

    public Leon(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }

    // Getters y setters

    // Otros metodos
    @Override
    public String sonido() { return "Rugido"; }

    @Override
    public String alimentacion() { return "Carnivora"; }

    @Override
    public String habitat() { return "Sabana"; }

    @Override
    public String nombreCientifico() { return "Panthera leo"; }

    // ToString()
    @Override
    public String toString() { return super.toString(); }
}
