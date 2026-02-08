package ejercicio12;

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
    
    public static void furnitureVectorInitializer(Furniture[] furnituresVector) {
        for (int i = 0; i < furnituresVector.length; i++) { // For que recorre el vector
            furnituresVector[i] = new Furniture(); // Inicializamos todas las posiciones del vector con objetos de la clase Furniture
        }
    }
    
    // ToString()

    @Override
    public String toString() {
        return "\nPrecio del mueble: " + price + " euros. "
                + "\nDescripcion: " + description + "\n";
    }
}
