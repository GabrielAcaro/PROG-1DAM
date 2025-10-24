package highestnumchecker;

/**
 * HighestNumChecker
 * @author Gabriel Acaro Sánchez
 */
public class HighestNumChecker {
    public static void highestNumChecker (int num1, int num2, int num3, int highest){
        
        if (num1 > num2 && num1 > num3){
            highest = num1;
        }else if (num2 > num1 && num2 > num3) {
            highest = num2;
        }else {
            highest = num3;
        }
        
        System.out.println("EL numero mayor de los introducidos es el " + highest + ".");
        
    }

}
