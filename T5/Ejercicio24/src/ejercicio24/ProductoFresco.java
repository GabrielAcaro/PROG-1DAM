package ejercicio24;

/**
 * Producto Fresco
 * @author Gabriel Acaro Sánchez
 */
public class ProductoFresco extends Producto {
    
    // Atributos privados
    
    private String fechaEnvasado;
    private String paisOrigen;
    
    // Constructores
    
    public ProductoFresco() {
        fechaEnvasado = "";
        paisOrigen = "";
    }
    
    public ProductoFresco(String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }
    
    // Getters y setters

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    
    // Otros métodos
    
    
    
    // ToString()

    @Override
    public String toString() {
        return "Producto Fresco:\n" + super.toString() + "\nFecha de envasado: " + fechaEnvasado + "\nPais de origen: " + paisOrigen;
    }
    
    
    
}
