package ejercicio3;

/**
 * Ejercicio 3
 * @author Gabriel Acaro Sánchez
 */
public class Test {
    public static void main(String[] args) {
        
        // Objetos de la clase Rueda
        
        Rueda rueda1 = new Rueda("Caucho", 15);
        Rueda rueda2 = new Rueda("Goma", 20);
        
        // Objetos de la clase coche
        
        Coche coche1 = new Coche("Toyota", "Corolla");
        Coche coche2 = new Coche("Volkswagen", "Golf");
        Coche coche3 = new Coche("Ford", "Fiesta");
        
        
        // Mostrar Ruedas
        
        System.out.println("Rueda1:\n");
        
        System.out.println("Material: " + rueda1.getMaterial());
        System.out.println("Pulgadas: " + rueda1.getPulgadas());
        
        System.out.println("\nRueda 2:\n");
        
        System.out.println("Material: " + rueda2.getMaterial());
        System.out.println("Pulgadas: " + rueda2.getPulgadas() + "\n");
        
        
        // Establecer las ruedas1 y 2 a coche1 y 2
        
        coche1.setRuedas(rueda1);
        coche2.setRuedas(rueda1);
        
        coche3.setRuedas(rueda2);
        
        // Mostrar coches
        
        System.out.println("Coche 1:\n");
        
        System.out.println("Marca: " + coche1.getMarca());
        System.out.println("Modelo: " + coche1.getModelo());
        System.out.println("\n" + coche1.getRuedas());
        
        System.out.println("\nCoche 2:\n");
        
        System.out.println("Marca: " + coche2.getMarca());
        System.out.println("Modelo: " + coche2.getModelo());
        System.out.println("\n" + coche2.getRuedas());
        
        System.out.println("\nCoche 3:\n");
        
        System.out.println("Marca: " + coche3.getMarca());
        System.out.println("Modelo: " + coche3.getModelo());
        System.out.println("\n" + coche3.getRuedas());
        
    }
}
