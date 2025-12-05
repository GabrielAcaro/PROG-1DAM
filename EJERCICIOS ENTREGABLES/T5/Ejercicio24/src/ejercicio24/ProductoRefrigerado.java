package ejercicio24;

/**
 * Producto Refrigerado
 * @author Gabriel Acaro Sánchez
 */
public class ProductoRefrigerado extends Producto{
    
    // Atributos privados
    
    private String codigoOrganismo;
    
    // Constructores
    
    public ProductoRefrigerado() {
        codigoOrganismo = "";
    }
    
    public ProductoRefrigerado(String fechaCaducidad, String numeroLote, String codigoOrganismo) {
        super(fechaCaducidad, numeroLote);
        this.codigoOrganismo = codigoOrganismo;
    }
    
    // Getters y setters

    public String getCodigoOrganismo() {
        return codigoOrganismo;
    }

    public void setCodigoOrganismo(String codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }
    
    // Otros métodos
    
    
    
    // ToString()
    
    @Override
    public String toString() {
        return "Producto Refrigerado:\n" + super.toString() + "\nCodigo del organismo: " + codigoOrganismo;
    }
    
}
