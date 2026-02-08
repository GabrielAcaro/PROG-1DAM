package ejercicio9;
import java.util.Scanner;

/**
 * Ejercicio9
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        String[] nombreAlumnos = {"Pepe", "Juan", "Marta"};
        
        
        Alumno[] alu  = new Alumno[3];
        
        for (int i = 0; i < alu.length; i++) {
            alu[i] = new Alumno();
            alu[i].setNombreAlumno(nombreAlumnos[i]);
        }
        
        Asignatura[] notas = new Asignatura[4];
        
        for (int i = 0; i < notas.length; i++) {
            notas[i] = new Asignatura();
            notas[i].setNombreAsignatura(asignaturas[i]);
        }
        
        Asignatura.rellenarNotas(notas, nombreAlumnos);
        Asignatura.mostrarNotas(notas, nombreAlumnos);
        
    }

}
