package ejercicio4;

/**
 * Ejercicio 4
 * @author Gabriel Acaro Sánchez
 */
public class Test {
    public static void main(String[] args) {

        // Creacion de los objetos
        
        Perro perro = new Perro("Perro", 5, 20);
        Lobo lobo = new Lobo("Lobo", 6, 35);
        Leon leon = new Leon("Leon", 7, 190);
        Gato gato = new Gato("Gato", 2, 4);
        
        // Mostramos cada uno con toString
        
        System.out.println(perro.toString());
        System.out.println(lobo.toString());
        System.out.println(leon.toString());
        System.out.println(gato.toString() + "\n");

        // Con el Polimorfismo creamos los objetos a partir de Animal
        
        Animal a1 = new Perro("Perro2", 3, 18);
        Animal a2 = new Lobo("Lobo2", 4, 32);
        Animal a3 = new Leon("Leon2", 8, 200);
        Animal a4 = new Gato("Gato2", 1, 3);
        
        // Mostramos cada uno con toString
        
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        System.out.println(a4.toString());
    }
}
