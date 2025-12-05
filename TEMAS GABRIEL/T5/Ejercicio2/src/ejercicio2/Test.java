package ejercicio2;

/**
 * Ejercicio 2
 * @author Gabriel Acaro Sánchez
 */
public class Test {
    public static void main(String[] args) {
        Curso curso1 = new Curso("LMSGI", 4);
        Curso curso2 = new Curso("BD", 6);
        
        System.out.println("Nombre del Curso: " + curso1.obtenerNombre());
        System.out.println("Numero de horas del Curso: " + curso1.obtenerHoras());
        
        System.out.println("\nNombre del Curso: " + curso2.obtenerNombre());
        System.out.println("Numero de horas del Curso: " + curso2.obtenerHoras());
        
        System.out.println("\nNumero de Cursos total: " + Curso.verCursos());
        
    }

}
