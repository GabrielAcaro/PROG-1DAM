package examen;

/**
 * Ciclista Escalador
 * @author Gabriel Acaro Sánchez
 */

public class CiclistaEscalador extends Ciclista implements Pedaleable{
    
    // Atributos privados
    
    private double potencia;
    private double fuerza;
    
    // Constructores

    public CiclistaEscalador() { // Por defecto
        super();
        potencia = 0;
        fuerza = 0;
    }

    public CiclistaEscalador(double potencia, double fuerza,
            String nombre, boolean estaEscapado, double kmMeta, double velocidad) { // Parametrizado
        super(nombre, estaEscapado, kmMeta, velocidad);
        this.potencia = potencia;
        this.fuerza = fuerza;
    }
    
    // Getter y Setter

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getFuerza() {
        return fuerza;
    }

    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }
    
    // Otros metodos
    
    // Implementacion de los metodos abstractos de la clase padre Ciclista
    @Override
    public void comer() {
        if (getKmMeta() > 20) {
            setEnergia(getEnergia() + 30);
            System.out.println("El escalador " + getNombre() + " acaba de tomarse un gel.");
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
            setNivelHidratacion(getNivelHidratacion() + 10);
            
            tirarBidon();
            tirarBidon();
            
            System.out.println("El escalador " + getNombre() + " se ha hidratado.");
            System.out.println("Su nivel de hidratacion ahora es de: " + getNivelHidratacion());
        }
    }
    
    // Implementacion del comportamiento de los Ciclistas Escaladores con los metodos abstractos de la interfaz Pedaleable
    
    @Override
    public void sprintar(){
        if (getKmMeta() < 0.3 && getEnergia() >= 20) {
            
            setVelocidad(getVelocidad() + (potencia / fuerza));
            setEnergia(getEnergia() - 20);
            
            System.out.println("El escalador " + getNombre() + " esta esprintando a " + getVelocidad() + " Km/h");
        } else {
            System.out.println("Aun no puedes esprintar!");
        }
    }
    
    @Override
    public void atacar(){
        if (!isEstaEscapado()) {
            
            setEstaEscapado(true);
            setNivelHidratacion((int) (getNivelHidratacion() - (getNivelHidratacion() * 0.2)));
            
            System.out.println("El escalador " + getNombre() + " esta atacando");
        } else {
            System.out.println("Aun no puedes atacar!");
        }
    }
    
    @Override
    public float recuperar(float kmRecuperacion){
        if (getKmMeta() > 15) {
            
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
        return "CiclistaEscalador{" + " Nombre: " + getNombre() + ", Energia: " + getEnergia() + 
                ", Esta Escapado: " + isEstaEscapado() + ", Km a meta: " + getKmMeta() +
                ", \nNumero de Bidones: " + getNumeroBidones() + ", Velocidad: " + getVelocidad() + 
                " km/h, Nivel de Hidratacion: " + getNivelHidratacion() + ", Ciclistsas Totales: " + getCONTADOR_CICLISTAS() +
                ", potencia: " + potencia + ", fuerza: " + fuerza + '}';
    }    
}
