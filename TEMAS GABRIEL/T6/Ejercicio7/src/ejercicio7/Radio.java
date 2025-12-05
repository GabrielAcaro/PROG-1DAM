package ejercicio7;

/**
 * Radio
 * @author Gabriel Acaro Sánchez
 */
public class Radio implements ControlRemoto {
    // Atributos privados
    
    private boolean encendido; // Atributo que indica si la radio esta encendida
    private double emisora; // Atributo que guarda la emisora actual
    private int volumen; // Atributo para el volumen actual
    
    // Constructores
    
    public Radio() {
        this.encendido = false; // La radio empieza apagada
        this.emisora = 80.0f; // Emisora inicial
        this.volumen = 15; // Volumen inicial
    }
    
    // Getters y setters

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public double getEmisora() {
        return emisora;
    }

    public void setEmisora(double emisora) {
        this.emisora = emisora;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    
    // Otros métodos
    
    // Metodo que muestra la informacion de la radio
    
    public void mostrarInfo() {
        System.out.println("Estado Radio Encendida " + isEncendido());
        System.out.println("Emisora actual " + getEmisora());
        System.out.println("Volumen actual " + getVolumen());
    }

    // Metodo que enciende la radio si esta apagada
    
    @Override
    public void encender() {
        if (!encendido) {
            encendido = true; // Encendemos la radio
            System.out.println("La radio se ha encendido");
        }
    }

    // Metodo que apaga la radio si esta encendida
    
    @Override
    public void apagar() {
        if (encendido) {
            encendido = false; // Apagamos la radio
            System.out.println("La radio se ha apagado");
        }
    }

    // Metodo que baja el volumen en cinco unidades
    
    @Override
    public void bajarVolumen() {
        if (encendido) {
            volumen -= 5; // Reducimos el volumen
            System.out.println("Volumen actual " + volumen);
        }
    }

    // Metodo que sube el volumen en cinco unidades
    
    @Override
    public void subirVolumen() {
        if (encendido) {
            volumen += 5; // Aumentamos volumen
            System.out.println("Volumen actual " + volumen);
        }
    }

    // Metodo que cambia la emisora por la pasada por parametro
    
    @Override
    public void cambiarCanal(double canal) {
        if (encendido) {
            emisora = canal; // Cambiamos emisora
            System.out.println("Emisora actual " + emisora);
        }
    }
    
    // ToString()

    @Override
    public String toString() {
        return "Radio{" + "encendido=" + encendido + ", emisora=" + emisora + ", volumen=" + volumen + '}';
    }
}
