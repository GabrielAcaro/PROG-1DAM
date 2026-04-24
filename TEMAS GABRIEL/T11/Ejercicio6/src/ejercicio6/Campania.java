package ejercicio6;
import java.util.HashSet;

/**
 * Campania
 * @author Gabriel Acaro Sánchez
 */
public class Campania {
    
    // Atributos privados
    
    private HashSet<Donacion> donaciones;
    private String nombreCampania;
    
    // Constructores

    public Campania() {
        HashSet<Donacion> donaciones = new HashSet<>();
        nombreCampania = "";
    }

    public Campania(HashSet<Donacion> donaciones, String nombreCampania) {
        this.donaciones = donaciones;
        this.nombreCampania = nombreCampania;
    }
    
    // Getters y setters

    public HashSet<Donacion> getDonaciones() {
        return donaciones;
    }

    public void setDonaciones(HashSet<Donacion> donaciones) {
        this.donaciones = donaciones;
    }

    public String getNombreCampania() {
        return nombreCampania;
    }

    public void setNombreCampania(String nombreCampania) {
        this.nombreCampania = nombreCampania;
    }
    
    // Otros metodos
    
    
    
    // ToString

    @Override
    public String toString() {
        return "Campania{" + "donaciones=" + donaciones + ", nombreCampania=" + nombreCampania + '}';
    }
}
