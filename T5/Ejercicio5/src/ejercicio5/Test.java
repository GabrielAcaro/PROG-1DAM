package ejercicio5;

import java.util.Scanner;

/**
 * Test
 * @author Gabriel Acaro Sánchez
 */
public class Test {
    
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int media = 0, notaIngles = 0, notaLmsgi = 0, notaBd = 0, notaProg = 0, notaIpe = 0, notaSi = 0, notaEd = 0;
        
        Asignatura ingles = new Asignatura("Ingles");
        Asignatura lmsgi = new Asignatura("lmsgi");
        Asignatura bd = new Asignatura("bd");
        Asignatura prog = new Asignatura("prog");
        Asignatura ipe = new Asignatura("ipe");
        Asignatura si = new Asignatura("si");
        Asignatura ed = new Asignatura("ed");
        
        System.out.println("Introduzca su nota de ingles: ");
        ingles.setNota(notaIngles = entry.nextInt());
        
        System.out.println("\nIntroduzca su nota de lmsgi: ");
        lmsgi.setNota(notaLmsgi = entry.nextInt());
        
        System.out.println("\nIntroduzca su nota de bd: ");
        bd.setNota(notaBd = entry.nextInt());
        
        System.out.println("\nIntroduzca su nota de prog: ");
        prog.setNota(notaProg = entry.nextInt());
        
        System.out.println("\nIntroduzca su nota de ipe: ");
        ipe.setNota(notaIpe = entry.nextInt());
        
        System.out.println("\nIntroduzca su nota de si: ");
        si.setNota(notaSi = entry.nextInt());
        
        System.out.println("\nIntroduzca su nota de ed: ");
        ed.setNota(notaEd = entry.nextInt());
        
        System.out.println("\nLa nota media del curso es de: " + Asignatura.calcularMedia(media, notaIngles, notaLmsgi, notaBd, notaProg, notaIpe, notaSi, notaEd));
    }

}
