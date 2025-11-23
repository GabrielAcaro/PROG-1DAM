package ejercicio7;

/**
 * Ejercicio 7
 * @author Gabriel Acaro Sánchez
 */
public class Descarga {
    // Atributos privados
    
    private String nombreDescarga;
    private double tamanioDescarga;
    private double velocidadDescarga;
    
    // Constructores
    
    public Descarga(){
        nombreDescarga = "";
        tamanioDescarga = 0;
        velocidadDescarga = 0;
    }
    
    public Descarga(String nom, double tam, double vel) {
        nombreDescarga = nom;
        tamanioDescarga = tam;
        velocidadDescarga = vel;
    }
    
    //Getters y setters
    
    public String getNombreDescarga() {
        return nombreDescarga;
    }

    public void setNombreDescarga(String nombreDescarga) {
        this.nombreDescarga = nombreDescarga;
    }

    public double getTamanioDescarga() {
        return tamanioDescarga;
    }

    public void setTamanioDescarga(double tamanioDescarga) {
        this.tamanioDescarga = tamanioDescarga;
    }

    public double getVelocidadDescarga() {
        return velocidadDescarga;
    }

    public void setVelocidadDescarga(double velocidadDescarga) {
        this.velocidadDescarga = velocidadDescarga;
    }
    
    // Otros métodos
    
    // ToString()

    @Override
    public String toString() {
        return "Descarga{" + "nombreDescarga=" + nombreDescarga + ", tamanioDescarga=" + tamanioDescarga + ", velocidadDescarga=" + velocidadDescarga + '}';
    }

    
    
    
    
}
