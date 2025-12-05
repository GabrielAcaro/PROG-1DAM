package ejercicio17;
import java.util.Scanner;

/**
 * Test
 * @author Gabriel Acaro Sánchez
 */
public class Test {
    public static void requestAnswer(String answer){
        Scanner entry = new Scanner(System.in);
        answer = entry.nextLine();
    }
    
    public static double testQuestion1(){
        String answer = "";
        Enunciado pregunta1 = new Enunciado("¿Quien descubrio america?", "Cristobal Colon");
        
            System.out.println("Primera pregunta: " + pregunta1.getQuestion());
            System.out.println("Responda: ");
            requestAnswer(answer);
            
        if (answer.equals(pregunta1.getAnswer())){
            System.out.println("Felicidades! Sumas 2.5 puntos, pasemos a la siguiente pregunta");
            return 2.5;
        } else {
            System.out.println("Muy mal, 0 puntos.");
            return 0;
        }
    }
    public static double testQuestion2(){
        String answer = "";
        Enunciado pregunta2 = new Enunciado("¿Quien es el presidente de España?", "Pedro Sanchez");
        
            System.out.println("Primera pregunta: " + pregunta2.getQuestion());
            System.out.println("Responda: ");
            requestAnswer(answer);
            
        if (answer.equals(pregunta2.getAnswer())){
            System.out.println("Felicidades! Sumas 2.5 puntos, pasemos a la siguiente pregunta");
            return 2.5;
        } else {
            System.out.println("Muy mal, 0 puntos.");
            return 0;
        }
    }
    public static double testQuestion3(){
        String answer = "";
        Enunciado pregunta3 = new Enunciado("¿Cuanto es 8*5?", "40");
        
            System.out.println("Primera pregunta: " + pregunta3.getQuestion());
            System.out.println("Responda: ");
            requestAnswer(answer);
            
        if (answer.equals(pregunta3.getAnswer())){
            System.out.println("Felicidades! Sumas 2.5 puntos, pasemos a la siguiente pregunta");
            return 2.5;
        } else {
            System.out.println("Muy mal, 0 puntos.");
            return 0;
        }
    }
    public static double testQuestion4(){
        String answer = "";
        Enunciado pregunta4 = new Enunciado("¿En que ciudad se encuentra la Torre Eiffel?", "Paris");
        
            System.out.println("Primera pregunta: " + pregunta4.getQuestion());
            System.out.println("Responda: ");
            requestAnswer(answer);
            
        if (answer.equals(pregunta4.getAnswer())){
            System.out.println("Felicidades! Sumas 2.5 puntos, pasemos a la siguiente pregunta");
            return 2.5;
        } else {
            System.out.println("Muy mal, 0 puntos.");
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println("Listo para el examen? No me importa, comencemos!");
        testQuestion1();
        testQuestion2();
        testQuestion3();
        testQuestion4();
        
        
    }
}
