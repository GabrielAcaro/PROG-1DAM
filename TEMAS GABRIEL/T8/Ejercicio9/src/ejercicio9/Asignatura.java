package ejercicio9;
import java.util.Scanner;

/**
 * Asignatura
 * @author Gabriel Acaro Sánchez
 */
public class Asignatura {
    // Atributos privados
    
    private String nombreAsignatura;
    private float nota;
    
    // Constructores
    
    public Asignatura() {
        nombreAsignatura = "";
        nota = 0f;
    }
    
    public Asignatura(String nombreAsignatura, float nota) {
        this.nombreAsignatura = nombreAsignatura;
        this.nota = nota;
    }
    
    // Getters y setters

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    
    // Otros métodos
    
    public static Asignatura[] rellenarAsignaturas() {
        String[] asignaturas = {"Lengua", "Mates", "Historia", "Fisica"};
        
        Asignatura[] notas = new Asignatura[4];
        
        for (int i = 0; i < notas.length; i++) {
            notas[i] = new Asignatura();
            notas[i].setNombreAsignatura(asignaturas[i]);
        }
        
        return notas;
    }
    
    public static void rellenarNotas(Asignatura[] notas, String[] nombreAlumno) {
        Scanner entry = new Scanner(System.in);
        float aux = 0f;
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Introduzca la nota del alumno " + nombreAlumno[i] + " de " + notas[i] + ":");
            aux = entry.nextFloat();
            
            notas[i].setNota(aux);
        }
    }
    
    
    public static void mostrarNotas(Asignatura[] notas, String[] nombreAlumno) {
        Scanner entry = new Scanner(System.in);
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("La nota del alumno " + nombreAlumno[i] + " es: " + notas[i].toString());
        }
    }
    
    // ToString()

    @Override
    public String toString() {
        return "Asignatura{" + "nombreAsignatura=" + nombreAsignatura + ", nota=" + nota + '}';
    }
    
}
