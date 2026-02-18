package ejercicio16;
import java.util.Scanner;

/**
 * Ejercicio16
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio16 {
    public static String[] secretWords() {
        String[] secretWords = new String[10];
        
        secretWords[0] = "tiburon";
        secretWords[1] = "delfin";
        secretWords[2] = "ballena";
        secretWords[3] = "medusa";
        secretWords[4] = "pulpo";
        secretWords[5] = "estrella";
        secretWords[6] = "caballito";
        secretWords[7] = "tortuga";
        secretWords[8] = "coral";
        secretWords[9] = "cangrejo";
        
        return secretWords;
    }
    
    public static int randomNumberGenerator() {
        int random = 0;
        
        random = (int) (Math.random() * 9) + 1;
        
        return random;
    }
    
    public static String gameWord(String[] secretWords, int random) {
        String gameWord = "";
        random = randomNumberGenerator();
        
        gameWord = secretWords[random];
        
        return gameWord;
    }
    
    public static void letterGesser(String gameWord, String[] secretWords, int random) {
        Scanner sc = new Scanner(System.in);
        
        String userLetter = "";
        String displayWord = "";
        int attempts = 6;
        boolean guessed = false;
        
        gameWord = gameWord(secretWords, random);
        
        
        for (int i = 0; i < gameWord.length(); i++) {
            displayWord += "_";
        }
        
        while (attempts > 0 && !guessed) {
            System.out.println("Palabra secreta: ");
            for (int i = 0; i < displayWord.length(); i++) {
                System.out.println(displayWord.charAt(i) + " ");
            }
            System.out.println("\nIntentos restantes: " + attempts);
            
            System.out.println("Introduce una letra: ");
            userLetter = sc.next().toLowerCase();
            // Verificar si la letra está en la palabra
        boolean found = false;
        String newDisplayWord = "";
        
        for (int i = 0; i < gameWord.length(); i++) {
            if (gameWord.substring(i, i + 1).equals(userLetter)) {
                newDisplayWord += userLetter;
                found = true;
            } else {
                newDisplayWord += displayWord.substring(i, i + 1);
            }
        }
        
        displayWord = newDisplayWord;
        
        if (!found) {
            attempts--;
            System.out.println("¡Letra incorrecta!");
        } else {
            System.out.println("¡Correcto!");
        }
        
        // Verificar si ganó
        guessed = displayWord.equals(gameWord);
    }
    
    if (guessed) {
        System.out.println("¡Felicidades! Adivinaste la palabra: " + gameWord);
    } else {
        System.out.println("Perdiste. La palabra era: " + gameWord);
    }
    }
    
    public static void menu() {
        System.out.println("- Bienvenido al juego del ahoracado -");
            System.out.println("Intenta adivinar la palabra secreta realacionada con especies marinas");
            System.out.println("----");
    }
    
    public static void main(String[] args) {
        String[] secretWords = secretWords();
        
        int random = 0;
        int attempts = 6;
        boolean guessed = false;
        
        random = randomNumberGenerator();
        
        String gameWord = gameWord(secretWords, random);
        
        menu();
        
        letterGesser(gameWord, secretWords, attempts);
    }

}
