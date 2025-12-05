package ejercicio16;

/**
 * Ejercicio16
 * @author Gabriel Acaro Sánchez
 */
public class Test {
    public static void main(String[] args) {
        
        // Cro los objetos alumno
        
        Alumno alum1 = new Alumno();
        Alumno alum2 = new Alumno();
        Alumno alum3 = new Alumno();

        // Leo los datos
        
        System.out.println("Alumno 1:");
        alum1.introducirDatos();
        System.out.println("\nAlumno 2:");
        alum2.introducirDatos();
        System.out.println("\nAlumno 3:");
        alum3.introducirDatos();

        // Mostramos los resultados
        
        System.out.println("\nResultados:");
        System.out.println("Alumno 1:");
        alum1.mostrarDatos();
        System.out.println("\nAlumno 2:");
        alum2.mostrarDatos();
        System.out.println("\nAlumno 3:");
        alum3.mostrarDatos();
    }
}
