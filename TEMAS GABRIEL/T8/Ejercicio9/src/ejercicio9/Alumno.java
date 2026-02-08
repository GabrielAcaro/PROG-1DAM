package ejercicio9;

/**
 * Alumno
 * @author Gabriel Acaro Sánchez
 */
public class Alumno {
    // Atributos privados
    private String nombreAlumno;
    private Asignatura[] notas;
    
    
    // Constructores
    
    public Alumno() {
        nombreAlumno = "";
        notas = new Asignatura[4];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = new Asignatura();
        }
    }
    
    // Getters y setters

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public Asignatura[] getNotas() {
        return notas;
    }

    public void setNotas(Asignatura[] notas) {
        this.notas = notas;
    }
    
    // Otros métodos
    
    public static void rellenarAlumno() {
        
    }
    
    // ToString()

    @Override
    public String toString() {
        return "Alumno{" + "nombreAlumno=" + nombreAlumno + ", notas=" + notas + '}';
    }
}
