package ejemploswitch;

/**
 * EjemploSwitch
 * @author Gabriel Acaro Sánchez
 */
public class EjemploSwitch {
    public static void main(String[] args) {
        int num = 1;
        switch (num) {
            case 1:
                System.out.println("Es un 1");
                
            case 2:
                System.out.println("Es un 2");
                break;
            case 3:
                System.out.println("Es un 3");
                break;
            default:
                System.out.println("No es ninguno");
                break;
        }
    
    }
    
}
