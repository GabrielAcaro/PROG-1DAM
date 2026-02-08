package ejericicio1;
import java.util.Scanner;

/**
 * Ejericicio1
 * @author Gabriel Acaro Sánchez
 */
public class Ejericicio1 {
    
    public static void createSubject(Subject[] vector1) {
        Scanner entry1 = new Scanner(System.in);
        Scanner entry2 = new Scanner(System.in);
        
        String subjectName = "";
        int grade = 0;
        
        for (int i = 0; i < vector1.length; i++) {
            System.out.println("Introduce el nombre de la Asignatura");
            subjectName = entry1.nextLine();
            
            System.out.println("Introduce la nota del alumno");
            grade = entry2.nextInt();
            
            vector1[i] = new Subject(subjectName, grade);
        }
    }
    
    public static void main(String[] args) {
        Subject[] vector1 = new Subject[6];
        
        createSubject(vector1);
        
        float average = Subject.average(vector1);
        System.out.println("La nota media del curso es: " + average);
    }

}
