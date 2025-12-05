package ejercicio7;
import java.util.Scanner;

/**
 * Ejercicio 7
 * @author Gabriel Acaro Sánchez
 */
public class Test {
    
    public static String pedirNombreDescarga(){
        Scanner entry = new Scanner(System.in);
        String nombre;
        
        System.out.println("Introduzca el nombre de su archivo: ");
        nombre = entry.nextLine();
        
        return nombre;
    }
    
    public static double pedirTamanioDescarga(){
        Scanner entry = new Scanner(System.in);
        double tamanio;
        
        System.out.println("Introduzca el tamanio de su archivo: ");
        tamanio = entry.nextDouble();
        
        return tamanio;
    }
    
    public static double pedirVelocidadDescarga(){
        double velocidad;
        Scanner entry = new Scanner(System.in);
        
        System.out.println("Introduzca la velocidad de su conexion: ");
        velocidad = entry.nextDouble();
        
        return velocidad;
    }
       
    public static void calcularTiempo(Descarga objeto){
        String nombre = objeto.getNombreDescarga();
        double tamanio = objeto.getTamanioDescarga();
        double velocidad = objeto.getVelocidadDescarga();
        double tiempo1, tiempo2;
        
        tiempo1 = (tamanio / velocidad) / 60;
        tiempo2 = (tamanio / velocidad);
        
        System.out.println(nombre + " tardara en descargarse " + tiempo1 + " minutos o " + tiempo2 + " segundos");
    }
    
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        String respuesta = "", nomDes = "";
        double tamDes = 0, velDes = 0;
        
        do {
            nomDes = pedirNombreDescarga();
            tamDes = pedirTamanioDescarga();
            velDes = pedirVelocidadDescarga();
            Descarga archivo1 = new Descarga(nomDes, tamDes, velDes);
            calcularTiempo(archivo1);
            System.out.println("Desea crear otro objeto?");
            respuesta = entry.nextLine();
        } while (respuesta.equalsIgnoreCase("si"));
        
        
        
        
    }

}
