package ejercicio7;

/**
 * ControlRemoto
 * @author Gabriel Acaro Sánchez
 */
public interface ControlRemoto {
    
    // Metodo para apagar el dispositivo
    void apagar();

    // Metodo para encender el dispositivo
    void encender();

    // Metodo para bajar el volumen
    void bajarVolumen();

    // Metodo para subir el volumen
    void subirVolumen();

    // Metodo para cambiar el canal o emisora segun el dispositivo
    void cambiarCanal(double canal);
    
}
