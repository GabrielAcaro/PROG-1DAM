package ejercicio5;

/**
 * Ejercicio 5
 * @author Gabriel Acaro Sánchez
 */
public class Asignatura {
    
    // Atributos privados
    
    private String nombre;
    private int nota;
    
    // Constructores
    
    public Asignatura(){
        nombre = "";
        nota = 0;
    }
    
    public Asignatura(String nom){
        nombre = nom;
        nota = 0;
    }
    
    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    // Otros métodos
    
    public static int calcularMedia(int media, int ingles, int lmsgi, int bd, int prog, int ipe, int si, int ed){
        media = (ingles + lmsgi + bd + prog + ipe + si + ed) / 7;
        
        return media;
    }
    
    // ToString()

    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
}
