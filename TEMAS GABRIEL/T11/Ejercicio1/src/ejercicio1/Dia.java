package ejercicio1;

/**
 * Dia
 * @author Gabriel Acaro Sánchez
 */
public class Dia {
    
    // Atributos privados
    
    private String nombreDia;
    private int temperatura;
    
    //Constructores
    
    public Dia() {
        nombreDia = "";
        temperatura = 0;
    }
    
    public Dia(String nombreDia, int temperatura) {
        this.nombreDia = nombreDia;
        this.temperatura = temperatura;
    }
    
    // Getters y setters

    public String getNombreDia() {
        return nombreDia;
    }

    public void setNombreDia(String nombreDia) {
        this.nombreDia = nombreDia;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
    
    // Otros metodos
    
    public static void initializeDay() {
        
    }
    
    // ToString

    @Override
    public String toString() {
        return "Dia{" + "nombreDia=" + nombreDia + ", temperatura=" + temperatura + '}';
    }
}
