package ejercicio20;
import java.util.Scanner; // Importamos la clase Scanner para poder leer los datos introducidos por el usuario

/**
 * Ejercicio20
 * @author Gabriel Acaro Sanchez
 */
public class Ejercicio20 {
    
    // Declaramos constantes con las respuestas correctas
    
    public static final String CAPITAL_ESPANIA = "Madrid"; // Constante para la respuesta de la primera pregunta
    public static final String DESCUBRIDOR_AMERICA = "Cristobal Colon"; // Constante para la respuesta de la segunda pregunta
    
    // Metodo que realiza la primera pregunta del examen y devuelve la nota
    
    public static int testQuestion1() {
        Scanner entrada = new Scanner(System.in); // Creamos el objeto Scanner para leer la respuesta del usuario
        String answer; // Declaramos el objeto answer con la clase String
        
            System.out.println("1ª PREGUNTA: ¿Cual es la capital de Espania? "); // Mostramos la pregunta
            answer = entrada.nextLine(); // Leemos la respuesta del usuario
        
        // Comprobamos si la respuesta es correcta
        
        if (answer.equalsIgnoreCase(CAPITAL_ESPANIA)) { 
            System.out.println("Muy bien respuesta correcta "); // Mensaje de acierto
            return 5; // Devolvemos 5 puntos si acierta
        } else { 
            System.out.println("No es correcto la respuesta correcta seria " + CAPITAL_ESPANIA); // Mensaje de error y respuesta correcta
            return 0; // Devolvemos 0 puntos si falla
        }
    }
    
    // Metodo que realiza la segunda pregunta del examen y devuelve la nota
    
    public static int testQuestion2() {
        Scanner entrada = new Scanner(System.in); // Creamos el objeto Scanner para leer la respuesta del usuario
        String answer;
        
            System.out.println("2ª PREGUNTA Quien descubrio America "); // Mostramos la pregunta
            answer = entrada.nextLine(); // Leemos la respuesta del usuario
        
        // Comprobamos si la respuesta es correcta
        
        if (answer.equalsIgnoreCase(DESCUBRIDOR_AMERICA)) { 
            System.out.println("Muy bien respuesta correcta "); // Mensaje de acierto
            return 5; // Devolvemos 5 puntos si acierta
        } else { 
            System.out.println("No es correcto la respuesta correcta seria " + DESCUBRIDOR_AMERICA); // Mensaje de error y respuesta correcta
            return 0; // Devolvemos 0 puntos si falla
        }
        
    }
    
    // Inicio del metodo main
    
    public static void main(String[] args) {
        System.out.println("EXAMEN DE CULTURA GENERAL "); // Mensaje de inicio del examen
        int grade = 0; // Declaramos e inicializamos la variable grade
        
        grade += testQuestion1(); // Sumamos la nota obtenida en la primera pregunta
        grade += testQuestion2(); // Sumamos la nota obtenida en la segunda pregunta
        
        System.out.println("NOTA DEL EXAMEN " + grade); // Mostramos la nota final del examen
    }
}
