package ejercicio2;

/**
 * Ejercicio 2
 * @author Gabriel Acaro Sánchez
 */
public class Curso {
    
    // Atributos privados
    private String nombre;
    private int numeroHoras;
    private static int numeroDeCursos;
    
    // Constructores
    
    public Curso(){
        nombre = "";
        numeroHoras = 0;
        numeroDeCursos = 0;
        sumarCursos();
    }
    
    public Curso(String n, int h){
        nombre = n;
        numeroHoras = h;
        sumarCursos();
    }
    
    // Getters y setters
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public int obtenerHoras(){
        return numeroHoras;
    }
    
    public void establecerHoras(int h){
        numeroHoras = h;
    }
    
    public static void sumarCursos(){
        numeroDeCursos++;
    }
    
    public static int verCursos(){
        return numeroDeCursos;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombre=" + nombre + ", numeroHoras=" + numeroHoras + '}';
    }
    
}
