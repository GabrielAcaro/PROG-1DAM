package examen;

/**
 * Ciclista
 * @author Gabriel Acaro Sanchez
 */
public abstract class Ciclista {
    
    // Atributos privados
    
    private String nombre;
    private int energia;
    private boolean estaEscapado;
    private double kmMeta;
    private int numeroBidones;
    private double velocidad;
    private int nivelHidratacion;
    private static int CONTADOR_CICLISTAS;
    
    // Constructores
    
    public Ciclista(){ // Por defecto
        nombre = "";
        energia = 50;
        estaEscapado = false;
        kmMeta = 120;
        numeroBidones = 2;
        velocidad = 0;
        nivelHidratacion = 50;
        CONTADOR_CICLISTAS++;
    }
    
    public Ciclista(String nombre, boolean estaEscapado, double kmMeta, double velocidad){ // Parametrizado
        
        this.nombre = nombre;
        this.energia = 50;
        this.estaEscapado = estaEscapado;
        this.kmMeta = kmMeta;
        this.numeroBidones = 2;
        this.velocidad = velocidad;
        this.nivelHidratacion = 50;
        CONTADOR_CICLISTAS++;
    }
    
    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public boolean isEstaEscapado() {
        return estaEscapado;
    }

    public void setEstaEscapado(boolean estaEscapado) {
        this.estaEscapado = estaEscapado;
    }

    public double getKmMeta() {
        return kmMeta;
    }

    public void setKmMeta(double kmMeta) {
        this.kmMeta = kmMeta;
    }

    public int getNumeroBidones() {
        return numeroBidones;
    }

    public void setNumeroBidones(int numeroBidones) {
        this.numeroBidones = numeroBidones;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getNivelHidratacion() {
        return nivelHidratacion;
    }

    public void setNivelHidratacion(int nivelHidratacion) {
        this.nivelHidratacion = nivelHidratacion;
    }

    public static int getCONTADOR_CICLISTAS() {
        return CONTADOR_CICLISTAS;
    }

    public static void setCONTADOR_CICLISTAS(int CONTADOR_CICLISTAS) {
        Ciclista.CONTADOR_CICLISTAS = CONTADOR_CICLISTAS;
    }
    
    // Otros metodos
    
    public void cogerBidones() {
        if (kmMeta > 10) {
            numeroBidones += 2;
        } else {
            System.out.println("No puedes coger bidones a menos de 10 km de meta");
        }
    }
    
    public void tirarBidon() {
        numeroBidones--;
    }
    
    public void aumentarNumeroCiclistas(){
        CONTADOR_CICLISTAS++;
    }
    
    public void verNumeroCiclistas(){
        System.out.println(getCONTADOR_CICLISTAS());
    }
    
    // Creacion de los metodos abstractos requeridos
    
    public abstract void comer();
    
    public abstract void beber();
    
    // ToString

    @Override
    public String toString() {
        return "Ciclista{" + "nombre:" + nombre + ", energia:" + energia + ","
                + " estaEscapado:" + estaEscapado + ", kmMeta:" + kmMeta + ","
                + " numeroBidones:" + numeroBidones + ", velocidad:" + velocidad + ","
                + " nivelHidratacion:" + nivelHidratacion + '}';
    }
}