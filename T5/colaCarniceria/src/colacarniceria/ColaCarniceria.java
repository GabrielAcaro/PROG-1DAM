package colacarniceria;
import java.util.InputMismatchException;
import java.util.Scanner; // Importamos la clase Scanner

/**
 * ColaCarniceria
 * @author Gabriel Acaro Sánchez
 */

public class ColaCarniceria {
    public static final char INICIO_RANGO_TICKET = 'A'; // Declaracion de la constante INICIO_RANGO_TICKET
    public static final char FINAL_RANGO_TICKET = 'C'; // Declaracion de la constante FINAL_RANGO_TICKET
    
    public static int numeroCompra = 1; // Declaracion de la variable numeroCompra
    public static int numeroPedido = 1; // Declaracion de la variable numero Pedido
    
    // Inicio del metodo que muestra el menu
    
    public static void mostrarMenu() {
        
        // Impresion del menu
        
        System.out.println("\nBienvenido a la Carniceria Alegria");
        
        System.out.println("Introduzca la opcion que requiera: ");
        
        System.out.println("\n1: Comprar");
        
        System.out.println("2: Recoger pedido");
        
        System.out.println("3: Salir");
    }
    
    // Metodo que pide al usuario que elija una opcion y la devuelve
    
    public static int pedirOpcion() {
        Scanner entry = new Scanner(System.in); // Creamos el objeto Scanner
        int opcion = entry.nextInt(); // Leemos la opcion del usuario
        
        return opcion; // Devolvemos la opcion introducida
    }
    
    // Inicio del metodo que genera una letra aleatoria entre A y C
    
    public static char generarLetraAleatoria(char inicio, char fin) {
        int codigo = (int)(Math.random() * ((fin - inicio) + 1)) + inicio; // Calculamos el codigo ASCII de la letra
        char letraAleatoria = (char) codigo; // Convertimos el codigo en caracter
        return letraAleatoria; // Devolvemos la letra generada
    }
    
    // Inicio del metodo que incrementa el numero de compra
    
    public static void incrementarNumeroCompra() {
        numeroCompra++; // Incrementa en uno el valor de numeroCompra
    }
    
    // Inicio del metodo que incrementa el numero de pedido
    
    public static void incrementarNumeroPedido() {
        numeroPedido++; // Incrementa en uno el valor de numeroPedido
    }
    
    public static void generarNumeroEsperaCompra(char mostrador) {
        System.out.println("Su ticket es C" + numeroCompra + " - Mostrador " + mostrador); // Mostramos el ticket de compra
        incrementarNumeroCompra(); // Llamamos al metodo que incrementa el numero de compra
    }
    
    public static void generarNumeroEsperaPedido(char mostrador) {
        System.out.println("Su ticket es P" + numeroPedido + " - Mostrador " + mostrador); // Mostramos el ticket de pedido
        incrementarNumeroPedido(); // Llamamos al metodo que incrementa el numero de pedido
    }
    
    // Comienzo del metodo main
    
    public static void main(String[] args) {
        int opcion=0;
        char mostrador=0;
        
        do {
            mostrarMenu(); // Mostramos el menu al usuario
            try {
            opcion = pedirOpcion(); // Leemos la opcion del usuario
            } catch (InputMismatchException e) {
            System.out.println("Introduzca solo un numero entre 1 y 3");
        }
            mostrador = generarLetraAleatoria(INICIO_RANGO_TICKET, FINAL_RANGO_TICKET); // Generamos letra de mostrador aleatoria
            
            switch (opcion) {
                case 1 -> generarNumeroEsperaCompra(mostrador);
                case 2 -> generarNumeroEsperaPedido(mostrador);
                case 3 -> System.out.println("Ha salido Correctamente, gracias por su compra.");
                default -> System.err.println("Introduzca un numero entre el 1 y el 3");
            } 
        } while (opcion != 3);
      
    }

}
