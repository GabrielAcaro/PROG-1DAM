package ejercicio13;

/**
 * Alumno
 * @author Gabriel Acaro Sánchez
 */
public class Student {
    // Atributos privados
    
    private String name;
    private int age;
    private double averageGrade;
    
    // Constructores
    
    public Student() {
        name = "";
        age = 0;
        averageGrade = 0.0;
    }
    
    public Student(String name, int age, double averageGrade) {
        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
    }
    
    // Getters y setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }
    
    // toString

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", averageGrade=" + averageGrade + '}';
    }
}
