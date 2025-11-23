package pruebaclases;

/**
 * PruebaClases
 * @author Gabriel Acaro Sánchez
 */
public class PruebaClases {
    public static void main(String[] args) {
        
        Bicicleta bici1 = new Bicicleta();
        bici1.setMarca("Orbea");
        bici1.setColor("Azul");
        bici1.setTipo("Montania");
        bici1.setAntiguedad(6);
        
        Bicicleta bici2 = new Bicicleta("Cannondale", "Roja", "Carretera", 15, "Juan", 18);
        // bici2.setMarca("Canondale");
        // bici2.setColor("Roja");
        // bici2.setTipo("Carretera");
        // bici2.setAntiguedad(15);
        
        Bicicleta bici3 = new Bicicleta("Mitical");
        bici3.setColor("Negro");
        bici3.setTipo("Montania");
        bici3.setAntiguedad(12);
        
        System.out.println("Bici 1: \n");
        bici1.mostrarBicicleta();
        
        System.out.println("\nBici 2: \n");
        System.out.println(bici2.toString());
        System.out.println("Marca: " + bici2.getMarca());
        
        
        System.out.println("\nAntiguedad Bici 1: \n");
        bici1.mostrarAntiguedad();
        
        System.out.println("\nAntiguedad Bici 2: \n");
        bici2.mostrarAntiguedad();
        
        System.out.println("\nBici 3:\n");
        bici3.mostrarBicicleta();
        
        System.out.println("\nNumero de bicicletas: " + Bicicleta.getContadorBicicletas());
    }

}
