package ejercicio14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejercicio14
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio14 {
    
    // Comienzo del menu del programa
    
    public static void menu() {
        System.out.println("Pulse alguno de estos numeros para usar el programa");
            System.out.println("Introducir un nuevo alumno junto a sus notas: 1)");
            System.out.println("Mostrar los alumnos introducidos hasta el momento: 2)");
            System.out.println("Mostrar que alumno es el mejor de la clase: 3)");
            System.out.println("Mostrar cual es la asignatura mas dificil: 4)");
            System.out.println("Salir del programa: 5)");
    }
    
    // Metodo de scanner
    
    public static String scanner(){
        Scanner scanner = new Scanner(System.in);
        String sc = "";
        
        return sc = scanner.nextLine();
    }
    
    // Comienzo del metodo para mostrar el mejor alumno de la clase
    
    public static void mejorAlumno(ArrayList<Alumno> listaAlumnos){
        // Creacion e inicializacion de variables
        
        float media = 0, suma = 0, mejorMedia = -1;
        String nombreMejorAlumno = "";
        
        // Recorremos la lista de alumnos
        for (int i = 0; i < listaAlumnos.size(); i++) {
            Asignatura[] asignaturas = listaAlumnos.get(i).getAsignaturas(); // Creo el array de asignaturas y lo relleno con las notas del Alumno
            suma = 0;
            
            for(int j = 0; j < asignaturas.length; j++){ // Recorremos el vector de las asignaturas del alumno
                suma += asignaturas[j].getNotaAsignatura(); // Calculamos la suma de la nota de sus asignaturas
            }
            
            media = suma / asignaturas.length; // Calculamos la media del Alumno
            
            if(media > mejorMedia){ // Buscamos al mejor alumno comparando la nota media de todos
                mejorMedia = media;
                nombreMejorAlumno = listaAlumnos.get(i).getNombreAlumno();
            } else {
                System.out.println("No hay alumnos registrados."); // Damos feedback si no hay alumnos creados
            }
        }
    }
    
    // Comienzo del metodo para mostrar la asignatura mas dificil
    
    public static void asignaturaMasDificil(ArrayList<Alumno> listaAlumnos){
        
        //Inicializacion y creacion de variables
        
        int suspensosLengua = 0, suspensosMates = 0, suspensosFisica = 0;
        
        for(int i = 0; i < listaAlumnos.size(); i++){ // Recorremos la lista de Alumnos
            
            Asignatura[] asignaturas = listaAlumnos.get(i).getAsignaturas(); // Creo el array de asignaturas y lo relleno con las notas del Alumno
            
            for(int j = 0; j < asignaturas.length; j++){ // Recorremos el vector de las asignaturas del alumno
                
                if(asignaturas[j].getNotaAsignatura() < 5){ // Si la nota esta suspensa
                    
                    if(asignaturas[j].getNombreAsignatura().equalsIgnoreCase("Lengua")){
                        suspensosLengua++; // Contamos los suspensos de los alumnos en lengua
                    }
                    
                    if(asignaturas[j].getNombreAsignatura().equalsIgnoreCase("Mates")){
                        suspensosMates++; // Contamos los suspensos de los alumnos en mates
                    }
                    
                    if(asignaturas[j].getNombreAsignatura().equalsIgnoreCase("Fisica")){
                        suspensosFisica++; // Contamos los suspensos de los alumnos en Fisica
                    }
                }
            }
        }
        
        // Comparamos y mostramos cual es la asignatura mas dificil
        
        if(suspensosLengua >= suspensosMates && suspensosLengua >= suspensosFisica){
            System.out.println("La asignatura mas dificil es Lengua con " + suspensosLengua + " suspensos.");
        }
        else if(suspensosMates >= suspensosLengua && suspensosMates >= suspensosFisica){
            System.out.println("La asignatura mas dificil es Mates con " + suspensosMates + " suspensos.");
        }
        else{
            System.out.println("La asignatura mas dificil es Fisica con " + suspensosFisica + " suspensos.");
        }
    }

    public static void main(String[] args) {
        
        ArrayList<Alumno> listaAlumnos = new ArrayList<>(); // Creamos la lista de alumnos
        
        int userOption = 0;
        
        do {
            
            menu(); // Llamamos al menu
            
            userOption = Integer.parseInt(scanner()); // Leemos la opcion del usuario
            
            switch(userOption){
                
                case 1 -> {
                    Alumno.rellenarAlumno(listaAlumnos); // Llamamos al metodo correspondiente
                }
                
                case 2 -> {
                    Alumno.mostrarAlumnos(listaAlumnos); // Llamamos al metodo correspondiente
                }
                
                case 3 -> {
                    mejorAlumno(listaAlumnos); // Llamamos al metodo correspondiente
                }
                
                case 4 -> {
                    asignaturaMasDificil(listaAlumnos); // Llamamos al metodo correspondiente
                }
                
                case 0 -> {
                    System.out.println("Saliendo del programa...");
                    System.out.println("Saliste del programa correctamente.");
                }
                
                default -> {
                    System.err.println("Introduzca un numero entre 0 y 4!");
                }
            }
        } while(userOption != 0);
    }
}