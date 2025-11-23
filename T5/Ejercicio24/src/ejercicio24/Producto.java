package ejercicio24;

/**
 * Producto
 * @author Gabriel Acaro Sánchez
 */
public class Producto {
    
    // Atributos privados
    
    private String fechaCaducidad;
    private String numeroLote;
    
    // Constructores
    
    public Producto() {
        fechaCaducidad = "";
        numeroLote = "";
    }
    
    public Producto(String fechaCaducidad, String numeroLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }
    
    // Getters y setters

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }
    
    // Otros métodos
    
    
    
    // ToString()

    @Override
    public String toString() {
        return "Fecha de caducidad: " + fechaCaducidad + "\nNumero de lote: " + numeroLote;
    }
}
