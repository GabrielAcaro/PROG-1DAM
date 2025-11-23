package ejercicio3;

/**
 * Ejercicio 3
 * @author Gabriel Acaro Sánchez
 */
public class Rueda {
    
    // Atributos privados
    private String material;
    private int pulgadas;
    
    // Constructores
    
    public Rueda() {
        material = "";
        pulgadas = 0;
    }
    
    public Rueda(String m, int p){
        material = m;
        pulgadas = p;
    }
    
    //Getters y setters
    
    public String getMaterial(){
        return material;
    }
    
    public void setMaterial(String m){
        material = m;
    }
    
    public int getPulgadas(){
        return pulgadas;
    }
    
    public void setPulgadas(int p){
        pulgadas = p;
    }
    
    // Otros métodos
    
    
    
    // ToString()

    @Override
    public String toString() {
        return "Ruedas: " + "\nMaterial: " + material + "\nPulgadas: " + pulgadas;
    }
    
}
