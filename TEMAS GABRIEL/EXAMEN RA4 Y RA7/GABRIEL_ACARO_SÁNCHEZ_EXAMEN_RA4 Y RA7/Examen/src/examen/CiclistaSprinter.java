package examen;

/**
 * Ciclista Sprinter
 * @author Gabriel Acaro Sánchez
 */
public class CiclistaSprinter extends Ciclista implements Pedaleable{
    
    
    // Atributos privados
    
    private double aceleracion;
    
    // Constructores

    public CiclistaSprinter() {
        super();
        aceleracion = 0;
    }

    public CiclistaSprinter(double aceleracion, String nombre, boolean estaEscapado, double kmMeta, double velocidad) {
        super(nombre, estaEscapado, kmMeta, velocidad);
        this.aceleracion = aceleracion;
    }
    
    // Getters Setters

    public double getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }
    
    // Otros metodos
    
    // Implementacion de los metodos abstractos de la clase padre Ciclista
    
    @Override
    public void comer() {
        if (getKmMeta() > 10){
            setEnergia(getEnergia() + 25);
            
            System.out.println("El sprinter " + getNombre() + " acaba de tomarse un gel.");
            System.out.println("Su energia ahora es de: " + getEnergia());
        } else {
            System.out.println("No puedes comer!");
        }
    }

    @Override
    public void beber() {
        if (getNumeroBidones() == 0){
            cogerBidones();
            
        } else if (getNumeroBidones() > 0) {
            setNivelHidratacion(getNivelHidratacion() + 5);
            
            tirarBidon();
            
            System.out.println("El sprinter " + getNombre() + " se ha hidratado.");
            System.out.println("Su nivel de hidratacion ahora es de: " + getNivelHidratacion());
        }
    }
    
    // Implementacion del comportamiento de los Ciclistas Sprinters con los metodos abstractos de la interfaz Pedaleable
    
    @Override
    public void sprintar(){
        if (getKmMeta() < 1 && getEnergia() >= 50) {
            
            setVelocidad(getVelocidad() + aceleracion);
            setEnergia(getEnergia() - 50);
            
            System.out.println("El sprinter " + getNombre() + " esta esprintando a " + getVelocidad() + " Km/h");
        } else {
            System.out.println("Aun no puedes esprintar!");
        }
    }
    
    @Override
    public void atacar(){
        if (!isEstaEscapado() == false) {
            
            setEstaEscapado(true);
            setNivelHidratacion((int) (getNivelHidratacion() - (getNivelHidratacion() * 0.1)));
            
            System.out.println("El sprinter " + getNombre() + " esta atacando");
        } else {
            System.out.println("Aun no puedes atacar!");
        }
    }
    
    @Override
    public float recuperar(float kmRecuperacion){
        if (getKmMeta() > 5) {
            
            setEnergia ((int) (getEnergia() + (kmRecuperacion * 5)));
            
            System.out.println(getNombre() + " esta recuperando.");
        } else {
            System.out.println("Aun no puedes recuperar!");
        }
        
        return getEnergia();
    }
    
    // ToString

    @Override
    public String toString() {
        return "CiclistaSprinter{" + " Nombre: " + getNombre() + ", Energia: " + getEnergia() + 
                ", Esta Escapado: " + isEstaEscapado() + ", Km a meta: " + getKmMeta() +
                ", \nNumero de Bidones: " + getNumeroBidones() + ", Velocidad: " + getVelocidad() + 
                ", Ciclistas Totales: " + getCONTADOR_CICLISTAS() + " km/h, Nivel de Hidratacion: " + getNivelHidratacion() + 
                ", aceleracion: " + aceleracion + '}';
    }
}
