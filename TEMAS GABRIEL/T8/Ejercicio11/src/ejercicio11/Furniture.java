package ejercicio11;

/**
 * Mueble
 * @author Gabriel Acaro Sánchez
 */
public class Furniture {
    // Atributos privados
    
    private double price;
    private String description;
    
    // Constructores
    
    public Furniture() {
        price = 0;
        description = "";
    }
    
    public Furniture(double price, String description) {
        this.price = price;
        this.description = description;
    }
    
    // Getters y setters

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    // Otros métodos
    
    
    
    // ToString()

    @Override
    public String toString() {
        return "Precio del mueble: " + price + " euros. "
                + "\nDescripcion: " + description;
    }
}
