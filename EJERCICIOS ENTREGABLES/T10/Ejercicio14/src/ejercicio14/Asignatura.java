package ejercicio14;

/**
 * Asignaturas
 * @author Gabriel Acaro Sánchez
 */
public class Asignatura {
    
    // Atributos privados
    
    private String nombreAsignatura;
    private float notaAsignatura;
    
    // Constructores

    public Asignatura(String nombreAsignatura, float notaAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
        this.notaAsignatura = notaAsignatura;
    }
    
    // Getters y setters

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public float getNotaAsignatura() {
        return notaAsignatura;
    }

    public void setNotaAsignatura(float notaAsignatura) {
        this.notaAsignatura = notaAsignatura;
    }
    
    // Otros metodos
    
    
    
    // ToString

    @Override
    public String toString() {
        return nombreAsignatura + ": " + notaAsignatura;
    }
}
