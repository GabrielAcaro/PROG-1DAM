package ejercicio14;
import java.util.Scanner;

/**
 * Ejercicio14
 * @author Gabriel Acaro Sanchez
 */
public class Ejercicio14 {

    // Metodo que muestra el menu del programa
    public static void menu() {
        System.out.print("\nElige una opcion:\n");
        System.out.println("\nRellenar un alumno: 1)\n");
        System.out.println("Mostrar vector de alumnos: 2)\n");
        System.out.println("Mostrar alumnos con nota media superior a una dada: 3)\n");
        System.out.println("Mostrar cuantos alumnos estan suspensos: 4)\n");
        System.out.println("Buscar alumno por nombre: 5)\n");
        System.out.println("Salir: 0)\n");
    }

    // Metodo que pide al usuario los datos para rellenar el vector de la clase Student
    public static void fillStudent(Student[] studentVector) {
        Scanner entry = new Scanner(System.in);

        int position = 0;
        String name = "";
        int age = 0;
        double averageGrade = 0;

        // Pedimos posicion hasta que sea valida y no este ocupada
        do {
            System.out.print("Introduzca posicion (0-4): ");
            position = entry.nextInt();
            entry.nextLine();

            if (position < 0 || position >= studentVector.length) {
                System.out.println("Posicion fuera de rango.");
            } else if (studentVector[position] != null) {
                System.out.println("Esa posicion ya esta ocupada.");
            }
        } while (position < 0 || position >= studentVector.length || studentVector[position] != null);

        // Pedimos datos del alumno
        System.out.print("Introduzca el nombre del alumno: ");
        name = entry.nextLine();

        System.out.print("Introduzca la edad del alumno: ");
        age = entry.nextInt();

        System.out.print("Introduzca la nota media del alumno: ");
        averageGrade = entry.nextDouble();

        // Creamos objeto Student y lo insertamos en el vector
        studentVector[position] = new Student(name, age, averageGrade);
        System.out.println("Alumno insertado correctamente.");
    }

    // Metodo que muestra la informacion de los alumnos del vector
    public static void showStudent(Student[] studentVector) {
        for (int i = 0; i < studentVector.length; i++) {
            if (studentVector[i] != null) {
                System.out.println("Posicion " + i + ": " + studentVector[i]);
            }
        }
    }

    // Metodo que muestra alumnos con nota media superior a la introducida
    public static void showStudentsByAverageGrade(Student[] studentVector) {
        Scanner entry = new Scanner(System.in);
        double minusGrade = 0.0;

        System.out.print("Introduce la nota minima: ");
        minusGrade = entry.nextDouble();

        for (Student i : studentVector) {
            if (i != null && i.getAverageGrade() > minusGrade) {
                System.out.println(i);
            }
        }
    }

    // Metodo que muestra cuantos alumnos tienen nota media suspensa (<5)
    public static void showStudentsByAverageGradeFailing(Student[] studentVector) {
        int failings = 0;

        for (Student i : studentVector) {
            if (i != null && i.getAverageGrade() < 5) {
                failings++;
            }
        }

        System.out.println("Numero de alumnos suspensos: " + failings);
    }

    // Metodo que busca un alumno por nombre en el vector
    public static void studentSearch(Student[] studentVector) {
        Scanner entry = new Scanner(System.in);

        String nameToSearch = "";
        boolean found = false;

        System.out.print("Introduce el nombre a buscar: ");
        nameToSearch = entry.nextLine();

    for (int i = 0; i < studentVector.length; i++) {
        if (studentVector[i] != null && studentVector[i].getName().equalsIgnoreCase(nameToSearch)) {
            found = true; // marcamos que se encontro
        }
    }
    
        if (found) {
            System.out.println("El alumno esta matriculado.");
        } else {
            System.out.println("El alumno NO esta matriculado.");
        }
    }

    // Metodo Main
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);
        Student[] studentVector = new Student[5];
        int opcion;

        do {
            menu();

            opcion = entry.nextInt();
            entry.nextLine(); // Limpiar buffer

            switch (opcion) {

                case 1 -> {
                    System.out.println("\nRellene el estudiante: ");
                    fillStudent(studentVector);
                    System.out.println("\nEstudiante rellenado correctamente.");
                }

                case 2 -> {
                    System.out.println("\nMostrando estudiantes...");
                    showStudent(studentVector);
                }

                case 3 -> {
                    System.out.println("\nMostrando estudiantes...");
                    showStudentsByAverageGrade(studentVector);
                }

                case 4 -> {
                    System.out.println("\nMostrando estudiantes...");
                    showStudentsByAverageGradeFailing(studentVector);
                }

                case 5 -> {
                    System.out.println("\nBuscando estudiante...");
                    studentSearch(studentVector);
                }

                case 0 -> {
                    System.out.println("\nSaliendo del programa...");
                    System.out.println("\nSaliste del programa correctamente.");
                }

                default -> {
                    System.err.println("\nIntroduzca un numero entre el 0 y el 5!");
                }
            }
        } while (opcion != 0);
    }
}

