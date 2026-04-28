package ejercicio8;
import java.util.HashSet;

/**
 * Ciudad
 * @author Gabriel Acaro Sánchez
 */
public class Ciudad {
    // Atributos privados
    
    private String nombre;
    private HashSet<Sede> conjuntoSedes;
    
    // Constructores

    public Ciudad() {
        nombre = "";
        conjuntoSedes = new HashSet<>();
    }

    public Ciudad(String nombre, HashSet<Sede> conjuntoSedes) {
        this.nombre = nombre;
        this.conjuntoSedes = conjuntoSedes;
    }
    
    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Sede> getConjuntoSedes() {
        return conjuntoSedes;
    }

    public void setConjuntoSedes(HashSet<Sede> conjuntoSedes) {
        this.conjuntoSedes = conjuntoSedes;
    }
    
    // Otros metodos
    
    
    
    // ToString

    @Override
    public String toString() {
        return "Ciudad{" + "nombre=" + nombre + ", conjuntoSedes=" + conjuntoSedes + '}';
    }
}
