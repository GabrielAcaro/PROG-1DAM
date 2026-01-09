package examen;

/**
 * Test
 * @author Gabriel Acaro Sánchez
 */
public class Test {
    public static void main(String[] args) {
        
        // Creamos los objetos requeridos
        
        CiclistaEscalador ce1 = new CiclistaEscalador(10, 5, "Juan", true, 21, 20);
        CiclistaSprinter cs1 = new CiclistaSprinter(10, "Paco", false, 0.9, 22);
        
        // Creamos las variables requeridas en las que almacenaremos con el polimorfismo los objetos creados anteriormente
        
        Ciclista c1 = ce1;
        Ciclista c2 = cs1;
        
        
        System.out.println("////CICLISTA ESCALADOR JUAN////");
        System.out.println("");
        
        System.out.println(c1.toString()); // Mostramos el objeto con toString
        System.out.println("");
        
        c1.comer();
        System.out.println("");
        c1.beber();
        System.out.println("");
        
        System.out.println(c1.toString()); // Mostramos el objeto con toString
        System.out.println("");
        
        System.out.println("////CICLISTA SPRINTER PACO////");
        System.out.println("");
        
        System.out.println(c2.toString()); // Mostramos el objeto con toString
        System.out.println("");
        
        c2.comer();
        System.out.println("");
        c2.beber();
        System.out.println("");
        
        System.out.println(c2.toString()); // Mostramos el objeto con toString
        System.out.println("");
        
        // Creamos las variables requeridas y con el polimorfismo y cast almacenamos las variables que almacenan los objetos creados anteriormente
        
        Pedaleable p1 = (Pedaleable) c1;
        Pedaleable p2 = (Pedaleable) c2;
        
        System.out.println("////CICLISTA ESCALADOR JUAN////");
        System.out.println("");
        
        System.out.println(p1.toString()); // Mostramos el objeto con toString
        System.out.println("");
        
        p1.atacar();
        System.out.println("");
        p1.recuperar(0);
        System.out.println("");
        p1.sprintar();
        System.out.println("");
        
        System.out.println("////CICLISTA SPRINTER PACO////");
        System.out.println("");
        
        System.out.println(p2.toString()); // Mostramos el objeto con toString
        System.out.println("");
        
        p2.atacar();
        System.out.println("");
        p2.recuperar(0);
        System.out.println("");
        p2.sprintar();
        System.out.println("");
    }
    
}
