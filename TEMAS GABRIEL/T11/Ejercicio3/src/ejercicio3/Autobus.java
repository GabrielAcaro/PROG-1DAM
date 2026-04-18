package ejercicio3;
import java.util.HashMap;

/**
 * Autobus
 * @author Gabriel Acaro Sánchez
 */
public class Autobus {
    // Atributos privados
    
    private String matricula;
    private HashMap<String, String> conductores;
    
    // Constructores
    
    public Autobus() {
        matricula = "";
        HashMap<String, String> conductores = new HashMap<>();
    }
    
    public Autobus(String matricula, HashMap<String, String> conductores) {
        this.matricula = matricula;
        this.conductores = conductores;
    }
    
    // Getters y setteres

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public HashMap<String, String> getConductores() {
        return conductores;
    }

    public void setConductores(HashMap<String, String> conductores) {
        this.conductores = conductores;
    }
    
    // Otros metodos
    
    
    
    // ToString

    @Override
    public String toString() {
        return "Autobus{" + "matricula=" + matricula + ", conductores=" + conductores + '}';
    }
}
