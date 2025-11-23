package ejercicio15;

/**
 * Direccion
 * @author Gabriel Acaro Sánchez
 */
public class Direccion {
    
    // Atributos privados
    
    private String calle;
    private int numero;
    private String piso;
    private String ciudad;
    
    // Constructores
    
    public Direccion() {
        calle = "";
        numero = 0;
        piso = "";
        ciudad = "";
    }
    
    public Direccion(String calle, int numero, String piso, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.ciudad = ciudad;
    }
    
    //Getters y setters
    
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    // Otros métodos
    
    
    
    // toString()

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", numero=" + numero + ", piso=" + piso + ", ciudad=" + ciudad + '}';
    }
}
