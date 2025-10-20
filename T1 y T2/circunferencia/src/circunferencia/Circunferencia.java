package circunferencia;
public class Circunferencia {
    /**
     * @author gabri
     * Calcular Longitud Circunferencia
     */
    public final static double PI = 3.141592; //Constante PI
    
    public static void main(String[] args) {
    double radio = 3.55;
    double longitud;
    longitud = 2 * PI * radio;
        System.out.println("La longitud de una circunferencia cuyo radio vale 3.55 seria igual a: " + longitud + " metros");
    }
    
}
