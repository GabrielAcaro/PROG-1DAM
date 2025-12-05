package media;
public class Media {

    /**
     * @author Gabriel Acaro Sánchez
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String asignatura1 = "Matematicas";
        String asignatura2 = "Lengua";
        float notaAsignatura1=7.4F, notaAsignatura2=9.5F;
        float media;
        media = (notaAsignatura1 + notaAsignatura2) / 2;
            System.out.println("Asignaturas este trimestre: " + asignatura1 + " y " + asignatura2 );
            System.out.println("La nota media es: " + media);
    }
}
