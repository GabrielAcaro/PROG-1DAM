package ejericicio1;

/**
 * Asignatura
 * @author Gabriel Acaro Sánchez
 */

public class Subject {
    
    // Atributos privados
    
    private String name;
    private int grade;
    
    // Constructores
    
    public Subject() {
        name = "";
        grade = 0;
    }
    
    public Subject(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
    
    // Getters y setters
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    // Otros métodos
    
    public static float average(Subject[] vector1) {
        float average = 0;
        
        for (int i = 0; i < vector1.length; i++) {
            average += vector1[i].getGrade();
        }
        
        return average / vector1.length;
    }
    
    // ToString()

    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + name + ", nota=" + grade + '}';
    }
}
