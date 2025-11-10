/**
 * Ejercicio1
 * @author Gabriel Acaro Sanchez
 */
public class Coche {
    
    // Atributos
    
    //Privados
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;
    private boolean motorEncendido = false;
    
    //Constructores
    //Lo veremos más adelante
    
    //Getters/Setters
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String m){
        marca = m;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String mod){
        modelo = mod;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String c){
        color = c;
    }
    
    //Otros métodos
    
    public void arrancarCoche() {
        motorEncendido = true;
        velocidad = 10;
        System.out.println("El coche se ha arrancado");
    }
    
    public void apagarCoche() {
        motorEncendido = false;
        velocidad = 0;
        System.out.println("El coche se a apagado");
    }
    
    public void acelerarCoche() {
        if (motorEncendido) {
            velocidad += 20;
            System.out.println("El coche ha acelerado. Velocidad actual: " + velocidad + " km/h");
        } else {
            System.out.println("No se puede acelerar con el motor apagado");
        }
    }
    
    public void frenarCoche() {
        if (motorEncendido) {
            velocidad -= 20;
            System.out.println("El coche a frenado. Velocidad actual: " + velocidad + " km/h");
        }
        if (velocidad <= 0) {
            velocidad = 0;
        }
    }
    
    public void obtenerEstado() {
        
    }
    
    //Mostrar
    
}
