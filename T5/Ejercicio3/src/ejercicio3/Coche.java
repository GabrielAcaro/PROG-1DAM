package ejercicio3;

/**
 * Ejercicio 3
 * @author Gabriel Acaro Sánchez
 */
public class Coche {
    
    // Atributos privados
    
    private String marca;
    private String modelo;
    private Rueda ruedas = new Rueda();
    
    // Constructores
    
    public Coche(){
        marca = "";
        modelo = "";
    }
    
    public Coche(String mar, String mod){
        marca = mar;
        modelo = mod;
    }
    
    // Getters y Setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Rueda getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda ruedas) {
        this.ruedas = ruedas;
    }
    
    // Otros métodos
    
    
    // ToString()

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", ruedas=" + ruedas + '}';
    }

    
}
