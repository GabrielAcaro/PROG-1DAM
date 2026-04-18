package ejercicio1;
import java.util.ArrayList;

/**
 * Agenda
 * @author Gabriel Acaro Sánchez
 */
public class Agenda {
    // Atributos privados
    
    String nombre;
    int edad;
    int numMovil;
    
    // Constructores
    
    public Agenda() {
        nombre = "";
        edad = 0;
        numMovil = 0;
    }
    
    public Agenda(String Nombre, int edad, int numMovil) {
        this.nombre = Nombre;
        this.edad = edad;
        this.numMovil = numMovil;
    }
    
    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumMovil() {
        return numMovil;
    }

    public void setNumMovil(int numMovil) {
        this.numMovil = numMovil;
    }
    
    // Otros Metodos

    
    
    // ToString

    @Override
    public String toString() {
        return "Agenda{" + "nombre=" + nombre + ", edad=" + edad + ", numMovil=" + numMovil + '}';
    }
}
