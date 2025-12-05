package ejercicio16;

import java.util.Scanner;

/**
 * Alumno
 * @author Gabriel Acaro Sánchez
 */
public class Alumno {

    // Atributos privados
    
    private String nombre;
    private int nota;
    
    // Constructores
    
    public Alumno() {
        nombre = "";
        nota = 0;
    }
    
    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
    //Getters y setters
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        if(nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            System.out.println("Error: la nota debe estar entre 0 y 10.");
            this.nota = -1; // valor inválido
        }
    }
    
    // Otros métodos
    
    public String resultadosNota() {
        if (nota >= 0 && nota <= 4) {
            return  "Suspenso";
        }
        else if (nota <= 6){
            return "Bien";
        }
        else if (nota <= 8){
            return "Notable";
        }
        else if (nota <= 10){
            return "Sobresaliente";
        }
        else {
            return "Introduzca una nota válida (0-10)";
        }
    }
    
    public void introducirDatos() {
        Scanner entry = new Scanner(System.in);
        
        System.out.print("Introduce el nombre del alumno: ");
        nombre = entry.nextLine();
        
        System.out.print("\nIntroduce la nota final (0-10): ");
        nota = entry.nextInt();
        
        if(nota < 0 || nota > 10) {
            System.out.println("Error: la nota debe ser entre 0 y 10");
        }
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        
        if(nota >= 0 && nota <= 10) {
            System.out.println("Nota: " + nota);
            System.out.println("Calificacion: " + resultadosNota());
        } else {
            System.out.println("Calificacion: invalida");
        }
    }
    
    // toString()

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
}
