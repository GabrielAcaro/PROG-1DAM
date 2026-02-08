package ejercicio11;

/**
 * Ejercicio11
 * @author Gabriel Acaro Sánchez
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Furniture mueble1 = new Furniture();
        Furniture mueble2 = new Furniture(149.99, "Mesa");
        
        System.out.println("Primera lectura\n");
        
        System.out.println(mueble1.toString());
        System.out.println("");
        System.out.println(mueble2.toString());
        System.out.println("");
        
        mueble1.setPrice(300.0);
        mueble1.setDescription("Sofa");
        
        mueble2.setDescription("Mesa simple");
        
        System.out.println("Segunda lectura\n");
        
        System.out.println(mueble1.toString());
        System.out.println("");
        System.out.println(mueble2.toString());
        System.out.println("");
    }

}
