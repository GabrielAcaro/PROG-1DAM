package ejercicio24;

/**
 * Producto Congelado
 * @author Gabriel Acaro Sánchez
 */
public class ProductoCongelado extends Producto {
    
    // Atributos privados
    
    private double temperaturaRecomendada;
    
    // Constructores
    
    public ProductoCongelado() {
        temperaturaRecomendada = 0;
    }
    
    public ProductoCongelado(String fechaCaducidad, String numeroLote, double temperaturaRecomendada) {
        super(fechaCaducidad, numeroLote);
        this.temperaturaRecomendada = temperaturaRecomendada;
    }
    
    // Getters y setters

    public double getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public void setTemperaturaRecomendada(double temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }
    
    // Otros métodos
    
    
    
    // ToString()
    
    @Override
    public String toString() {
        return "Producto Congelado:\n" + super.toString() + "\nTemperatura recomendada: " + temperaturaRecomendada + "ºC";
    }
}
