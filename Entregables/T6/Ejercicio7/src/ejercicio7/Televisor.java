package ejercicio7;

/**
 * Televisor
 * @author Gabriel Acaro Sánchez
 */
public class Televisor implements ControlRemoto {
    // Atributos privados
    
    private boolean encendido; // Atributo que indica si la tv esta encendida
    private int canal; // Atributo que guarda el canal actual
    private int volumen; // Atributo que guarda el volumen actual
    
    // Constructores
    
    public Televisor() {
        this.encendido = false; // La tv empieza apagada
        this.canal = 1; // Canal inicial
        this.volumen = 10; // Volumen inicial
    }
    
    // Getters y setters

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    
    // Otros métodos
    
    // Metodo que muestra la informacion del televisor
    public void mostrarInfo() {
        System.out.println("Estado TV Encendida " + isEncendido());
        System.out.println("Canal actual " + getCanal());
        System.out.println("Volumen actual " + getVolumen());
    }
    
    // Metodo que enciende la tv si esta apagada
    @Override
    public void encender() {
        if (!encendido) {
            encendido = true; // Encendemos la tv
            System.out.println("La TV se ha encendido canal actual " + canal);
        }
    }

    // Metodo que apaga la tv si esta encendida
    @Override
    public void apagar() {
        if (encendido) {
            System.out.println("La TV se apagara en 10s");
            encendido = false; // Apagamos la tv
        }
    }

    // Metodo que baja el volumen en una unidad
    @Override
    public void bajarVolumen() {
        if (encendido) {
            volumen--; // Reducimos el volumen
            System.out.println("Volumen actual " + volumen);
        }
    }

    // Metodo que sube el volumen en una unidad
    @Override
    public void subirVolumen() {
        if (encendido) {
            volumen++; // Aumentamos el volumen
            System.out.println("Volumen actual " + volumen);
        }
    }

    // Metodo que cambia el canal por el valor introducido
    @Override
    public void cambiarCanal(double canal) {
        if (encendido) {
            this.canal = (int) canal; // Cambiamos canal
            System.out.println("Canal actual " + this.canal);
        }
    }
    
    // ToString()
    @Override
    public String toString() {
        return "Televisor{" + "encendido=" + encendido + ", canal=" + canal + ", volumen=" + volumen + '}';
    }
}
