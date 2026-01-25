package ejercicio16;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio16
 * @author Gabriel Acaro Sánchez
 */

public class Ejercicio16 {
    // Declaro dos constantes para indicar el tamaño del array
    
    private static int ROW = 6;
    private static int COL = 4;
    
    // Comienzo del metodo que rellena el array con notas aleatorias entre el 0 y el 10
    
    public static void fillGrades(int[][] array1) {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                array1[i][j] = (int) (Math.random()* 11); // Si quisieramos introducirlas a mano, seria utilizar una variable + Scanner
            }
        }
    }
    
    // Metodo que muestra las notas de manera que primero aparece la asignatura y debajo las notas de los estudiantes
    
    public static void showGrades(int[][] array1, String[] students, String[] subjets) {
        
        // Con estos for lo que hago es recorrer el array al reves que default. Primero el primer valor de la columna y luego el valor de cada fila asignada a esa columna.
        for (int i = 0; i < COL; i++) {
            System.out.println("------------------------");
            System.out.println(subjets[i]); // Aqui muestro el nombre de la asignatura que corresponda dependiendo del numero de la iteracion
            System.out.println("------------------------");
            for (int j = 0; j < ROW; j++) {
                System.out.println(students[j] + ": " + array1[j][i]); // Aqui muestro el nombre del estudiante que corresponda dependiendo del numero de la iteracion y la nota
            }
            System.out.println("");
        }
        System.out.println("\n-----------------------------------------------------");
    }
    
    // Metodo que muestra el mejor estudiante.
    
    public static void bestStudent(int[][] array1, String[] students) {
    /** 
     * No utilizo la media para calcular cual es el mejor.
     * Lo que hago es sumar todas las notas de los estudiantes y ver cual es la suma mayor.
     * Con eso me salto el paso de calcular la nota media y simplemente comparo la suma de las asignaturas para ver cual es el mayor. 
     * La media que hay al final es por estetica, ya que no se pide mostrar la nota media.
     */
        int aux = 0, bestGrade = -1;
        double average = 0;
        String bestStudent = "";
        
        // Aqui sí recorro el array de manera default, ya que si no lo hiciera, esta logica no sería aplicable al revés
        
        for (int i = 0; i < ROW; i++) {
            aux = 0; // En cada iteracion aux adquiere valor 0 reseteando el valor anterior
            for (int j = 0; j < COL; j++) {
                aux += array1[i][j]; // Sumo todas las notas de la asignatura que toque
            }
            if (aux > bestGrade) { // Si esa suma es mayor que la mejor suma almacenada se intercambian los valores
                bestGrade = aux;
                bestStudent = students[i]; 
                // Asignamos a bestStudent el valor que tiene el String dependiendo del numero de iteración,
                // que equivale al mejor estudiante que está almacenado
            }
        }
        
        average = (double) bestGrade / 4; // Hago la media de las notas del mejor estudiante
        
        System.out.println("El mejor estudiante es: " + bestStudent + ", con una media de: " + average); // Muestro quien es el mejor estudiante
        System.out.println("\n-----------------------------------------------------");
    }
    
    // Comienzo del metodo que muestra el alumno con mas asignaturas suspensas
    
    public static void mostFailedSubjectsStudent(int[][] array1, String[] students) {
        int aux = -1, counter = 0;
        String mostFailSubjectsStudent = "";
        
        // For similar al anterior metodo
        
        for (int i = 0; i < ROW; i++) {
            counter = 0;
            for (int j = 0; j < COL; j++) {
                if (array1[i][j] < 5) { // Si la posicion del array es menor que 5 se considera un suspenso
                counter++; // Se suma como una asignatura suspensa
                }
            }
            if (counter > aux) { // Si el contador es mas grande que la cantidad de notas suspensas almacenadas se intercambian los valores
                aux = counter;
                mostFailSubjectsStudent = students[i]; // Asigno a mostFailSubjectsStudent el valor que tiene el String dependiendo del numero de iteración
            }
        }
        
        // Muestro el estudiante con mas asignaturas suspensas y cuantas son
        
        System.out.println("El estudiante con mas asignaturas suspensas es: " + mostFailSubjectsStudent + " con " + aux + " asignaturas suspensas");
        System.out.println("\n-----------------------------------------------------");
    }
    
    // Metodo que muestra la asignatura mas dificil
    
    public static void hardestSubjet(int[][] array1, String[] subjets) {
        int aux = 0, worstGrade = 41;
        float average;
        String hardestSubjet = "";
        
        // Invierto la logica del for por default de los arrays. Logica similar al for del metodo showGrades().
        // (Logica del metodo bestStudent() pero invertida.)
        for (int i = 0; i < COL; i++) {
            aux = 0;
            for (int j = 0; j < ROW; j++) {
                aux += array1[j][i]; // Como la logica esta invertida, aqui lo que sumo son las notas de cada uno de los estudiantes dependiendo de la asignatura.
            }
            if (aux < worstGrade) {  // Si esa suma es menor que la peor suma almacenada se intercambian los valores
                worstGrade = aux;
                hardestSubjet = subjets[i];
            }
        }
        
        average = (float) worstGrade / 6; // Hago la nota media de todos los estudiantes de la peor asignatura
        
        System.out.println("La asignatura mas dificil es: " + hardestSubjet + ", con una media de: " + average); // Muestro cuál es la peor asignatura
        System.out.println("\n-----------------------------------------------------");
    }
    
    // Metodo que muestra el menu de opciones que tiene el usuario
    
    public static void showMenuOptions() {
        System.out.println("\nSeleccione una de estas opciones pulsando en el numero indicado: ");
            System.out.println("\nRellenar el array con las notas de los alumnos: 1)");
            System.out.println("\nMostrar las notas de los alumnos: 2)");
            System.out.println("\nMostrar el mejor alumno de la clase: 3)");
            System.out.println("\nMostrar el alumno con mas asignaturas suspensas: 4)");
            System.out.println("\nMostrar la asignatura mas dificil: 5)");
            System.out.println("\nSalir del programa: 6\n");
    }
    
    // Comienzo del metodo main
    
    public static void main(String[] args) {
        
        // Declaro los arrays y el Scanner
        
        String[] students = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "Maria"};
        String[] subjets = {"Lengua", "Mates", "Historia", "Fisica"};
        Scanner entry = new Scanner(System.in);
        int[][] array1 = new int[ROW][COL];
        
        // Declaro otras variables
        
        int userOption = 0;
        
        // Comienzo del menu del programa
        
        do {
            showMenuOptions();
            try { // Con este try catch controlo que no se cierre el programa si se introduce una letra
                userOption = entry.nextInt();
            
                switch (userOption) { // Cada case del switch es una opcion del programa, en cada uno de los cases se llama a un metodo menos en el de cerrar el programa
                        case 1 -> {
                            System.out.println("-----------------------------------------------------");
                            System.out.println("\nRellenando el array con las notas de los alumnos... \n");
                            System.out.println("\nNotas de los alumnos rellenadas.\n");
                            System.out.println("-----------------------------------------------------");
                            fillGrades(array1);
                        }
                    
                        case 2 -> {
                            System.out.println("-----------------------------------------------------");
                            System.out.println("\nMostrando las notas de los alumnos... \n");
                            showGrades(array1, students, subjets);
                        }
                    
                        case 3 -> {
                            System.out.println("-----------------------------------------------------");
                            System.out.println("\nMostrando el mejor alumno de la clase... \n");
                            bestStudent(array1, students);
                        }
                    
                        case 4 -> {
                            System.out.println("-----------------------------------------------------");
                            System.out.println("\nMostrando el alumno con mas asignaturas suspensas... \n");
                            mostFailedSubjectsStudent(array1, students);
                        }
                    
                        case 5 -> {
                            System.out.println("-----------------------------------------------------");
                            System.out.println("\nMostrando la asignatura mas dificil... \n");
                            hardestSubjet(array1, subjets);
                        }
                    
                        case 6 -> {
                            System.out.println("-----------------------------------------------------");
                            System.out.println("\nSaliendo del programa... \n");
                            System.out.println("Ha salido correctamente.\n");
                        }
                    
                        default -> {
                            System.err.println("\nIntroduzca un numero entre el 1 y el 6!\n"); // Con este default controlo que el usuario tenga feedback si introduce un numero erroneo
                        }
                }
            } catch (InputMismatchException e) {
                System.err.println("\nIntroduzca un numero entre el 1 y el 6!\n");
                entry.nextLine(); // Limpio el bufer del scanner
                userOption = -1; // Asigno un valor distinto de 0 a esta variable para que no se acabe el bucle / programa
            }
        } while(userOption != 6); // Se acaba el programa si el usuario introduce 6
    }
}