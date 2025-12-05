package test;
import clases.Coche;
import java.util.Scanner;

/**
 * Test
 * @author Gabriel Acaro Sánchez
 */
public class Test {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int seleccionarCoche = 0, micoche = 0, cochepadre = 0;
        
        Coche miCoche = new Coche();
        Coche cochePadre = new Coche();
        
        miCoche.setMarca("Honda");
        miCoche.setModelo("Civic");
        miCoche.setColor("Azul");
        
        cochePadre.setMarca("Audi");
        cochePadre.setModelo("A4");
        cochePadre.setColor("Gris");
        
            System.out.println("Bienvenido al garage, seleccione su coche: ");
            System.out.println("\nPara seleccionar el coche 1 (Su coche) pulse: 1 ");
            System.out.println("Para seleccionar el coche 2 (Coche de su padre) pulse: 2 ");
        
        seleccionarCoche = entry.nextInt();
        
        switch (seleccionarCoche) {
            case 1 -> {
                do {
                    System.out.println("Pulse estos numeros para realizar acciones con el coche: ");
                
                    System.out.println("\n1: Arrancar el Coche");
                    System.out.println("2: Apagar el Coche");
                    System.out.println("3: Acelerar el Coche");
                    System.out.println("4: Frenar el Coche");
                    System.out.println("5: Informacion sobre el coche");

                    micoche = entry.nextInt();
                    switch (micoche) {
                        case 1 -> {
                            miCoche.arrancarCoche();
                            
                        }
                        case 2 -> {
                            miCoche.apagarCoche();
                        }
                        case 3 -> {
                            miCoche.acelerarCoche();
                        }
                        case 4 -> {
                            miCoche.frenarCoche();
                        }
                        case 5 -> {
                            miCoche.obtenerEstado();
                        } 
                    
                        default -> System.err.println("Introduzca entre el numero 1 y el 5! ");
                    }
                } while (micoche != 2 || miCoche.getVelocidad() != 0);
            }
            
            case 2 -> {
                do {
                    System.out.println("Pulse estos numeros para realizar acciones con el coche: ");
                
                    System.out.println("\n1: Arrancar el Coche");
                    System.out.println("2: Apagar el Coche");
                    System.out.println("3: Acelerar el Coche");
                    System.out.println("4: Frenar el Coche");
                    System.out.println("5: Informacion sobre el coche");

                    cochepadre = entry.nextInt();
                    
                    switch (cochepadre) {
                        case 1 -> {
                            cochePadre.arrancarCoche();
                        }
                        case 2 -> {
                            cochePadre.apagarCoche();
                        }
                        case 3 -> {
                            cochePadre.acelerarCoche();
                        }
                        case 4 -> {
                            cochePadre.frenarCoche();
                        }
                        case 5 -> {
                            cochePadre.obtenerEstado();
                        } 
                    
                    default -> System.err.println("Introduzca entre el numero 1 y el 5! ");
                }
                } while (cochepadre != 2 && miCoche.getVelocidad() != 0);
            }
            default -> System.err.println("Introduzca el 1 o el 2");
        }
    }

}
