package ejercicio15;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio15
 * @author Gabriel Acaro Sánchez
 */

public class Ejercicio15 {
    
    // Metodo que muestra al usuario las opciones del programa
    
    public static void mostrarOpciones() {
        
        System.out.println("\nSeleccione una de estas opciones pulsando en el numero indicado: ");
            System.out.println("\nRellenar array con las ventas de coches: 1)");
            System.out.println("\nMostrar las ventas de coches: 2)");
            System.out.println("\nMostrar las ventas de coches al reves: 3)");
            System.out.println("\nMostrar la suma total de ventas del anio: 4)");
            System.out.println("\nMostrar las ventas totales de los meses pares: 5)");
            System.out.println("\nMostrar el nombre del mes con mas ventas: 6)");
            System.out.println("\nSalir del programa: 0\n");
    }
    
    // Metodo que rellena un vector con numero aleatorios entre 10 y 100
    
    public static int[] rellenarVentasCoches() {
        int vectorVentaCoches[] = new int[12];
        
        for (int i = 0; i < vectorVentaCoches.length; i++) { // En este for se recorre las posiciones del vector y se le añaden los numeros aleatorios
            vectorVentaCoches[i] = (int)((Math.random() * (100 - 10 + 1)) + 10); // Uso una formula para que funcione el random "(int) (Math.random() * (maxNum - minNum + 1)) + minNum"
        }
        
        return vectorVentaCoches; // Devuelvo el valor del vector
    }
    
    // Metodo que muestra las posiciones del vector por default
    
    public static void mostrarVentasCoches(int[] vectorVentaCoches) {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", // Este String sirve para asignarle a cada posicion del vector un mes
                            "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        for (int i = 0; i < vectorVentaCoches.length; i++) {
            System.out.println(meses[i] + ": " + vectorVentaCoches[i]);
        }
        System.out.println("\n-----------------------------------------------------");
    }
    
    // Metodo que muestra las posiciones del vector al revés
    
    public static void mostrarVentasCochesReves(int[] vectorVentaCoches) {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", // Este String sirve para asignarle a cada posicion del vector un mes
                            "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        for (int i = vectorVentaCoches.length - 1; i >= 0; i--) { // Aqui la diferencia respecto al default es que recorro el vector desde el final
            System.out.println(meses[i] + ": " + vectorVentaCoches[i]);
        }
        System.out.println("\n-----------------------------------------------------");
    }
    
    // Metodo que muestra la suma de todas las posiciones del vector
    
    public static void sumaTotalVentasAnual(int[] vectorVentaCoches) {
        int sumaVentas = 0;
        
        for (int i = 0; i < vectorVentaCoches.length; i++) {
            sumaVentas += vectorVentaCoches[i]; // En cada iteracion se va sumando el valor de cada posicion del vector
        }
        
        System.out.println("Total de ventas anual: " + sumaVentas);
        System.out.println("\n-----------------------------------------------------");
    }
    
    // Metodo que muestra la suma de las posiciones pares del vector
    
    public static void sumaMesesPar(int[] vectorVentaCoches) {
        int sumaVentas = 0;
        
        // Aqui lo que hago es lo mismo que en el metodo anterior, con la diferencia de que se va sumando de dos en dos por lo que siempre es par
        
        for (int i = 0; i < vectorVentaCoches.length; i++) {
            sumaVentas += vectorVentaCoches[i];
            i++; // Esto salta la posicion impar en cada iteracion por lo que no se suma
        }
        
        System.out.println("Total de ventas en meses pares: " + sumaVentas);
        System.out.println("\n-----------------------------------------------------");
    }
    
    // Metodo que comprueba la posicion del vector mas grande
    
    public static void comprobarMayorVenta(int[] vectorVentaCoches) {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", // Este String sirve para asignarle a cada posicion del vector un mes
                            "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        int comprobante = 0;
        int comprobanteMes = 0;
        
        // Aqui lo que hago es comprobar que posicion del vector tiene el valor mas grande
        // Si la posicion que estamos comparando tiene un valor mas grande que la almacenada, el mes al que pertenece el valor pasa a ser el que tiene la venta mas grande
        // Asi hasta que se termine de recorrer el vector
        
        for (int i = 0; i < vectorVentaCoches.length; i++) {
            if (vectorVentaCoches[i] > comprobante) {
                comprobante = vectorVentaCoches[i];
                comprobanteMes = i;
            }
        }
        System.out.println("El mes con mas vestas es: " + meses[comprobanteMes]); // Aqui muestro la posicion del string que equivale a la posicion del vector con la mayor venta
        System.out.println("\n-----------------------------------------------------");
    }
    
    // Comienzo del metodo main
    
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int userOption = 0;
        int[] vectorVentaCoches = new int[12];
        
        // Bucle do while para hacer un menu de opciones
        
        do {
            mostrarOpciones();
            try { // Con este try catch controlo que no se cierre el programa si se introduce una letra
                userOption = entry.nextInt();
            
                switch (userOption) { // Cada case del switch es una opcion del programa, en cada uno de los cases se llama a un metodo menos en el de cerrar el programa
                    
                        case 0 -> {
                            System.out.println("-----------------------------------------------------");
                            System.out.println("\nSaliendo del programa... \n");
                            System.out.println("Ha salido correctamente.\n");
                        }
                    
                        case 1 -> {
                            System.out.println("-----------------------------------------------------");
                            System.out.println("\nRellenando ventas de coches... \n");
                            System.out.println("\nVentas de coches rellenadas.\n");
                            System.out.println("-----------------------------------------------------");
                            vectorVentaCoches = rellenarVentasCoches();
                        }
                    
                        case 2 -> {
                            System.out.println("-----------------------------------------------------");
                            System.out.println("\nMostrando las ventas de coches... \n");
                            mostrarVentasCoches(vectorVentaCoches);
                        }
                    
                        case 3 -> {
                            System.out.println("-----------------------------------------------------");
                            System.out.println("\nMostrando las ventas de coches al reves... \n");
                            mostrarVentasCochesReves(vectorVentaCoches);
                        }
                    
                        case 4 -> {
                            System.out.println("-----------------------------------------------------");
                            System.out.println("\nMostrando la suma de todas ventas del anio... \n");
                            sumaTotalVentasAnual(vectorVentaCoches);
                        }
                    
                        case 5 -> {
                            System.out.println("-----------------------------------------------------");
                            System.out.println("\nMostrando el total de ventas de los meses pares... \n");
                            sumaMesesPar(vectorVentaCoches);
                        }
                    
                        case 6 -> {
                            System.out.println("-----------------------------------------------------");
                            System.out.println("\nMostrando el mes con mas ventas... \n");
                            comprobarMayorVenta(vectorVentaCoches);
                        }
                    
                        default -> {
                            System.err.println("\nIntroduzca un numero entre el 0 y el 6!\n"); // Con este default controlo que el usuario tenga feedback si introduce un numero erroneo
                        }
                }
            } catch (InputMismatchException e) {
                System.err.println("\nIntroduzca un numero entre el 0 y el 6!\n");
                entry.nextLine(); // Limpio el bufer del scanner
                userOption = -1; // Asigno un valor distinto de 0 a esta variable para que no se acabe el bucle / programa
            }
        } while(userOption != 0); // Se acaba el programa si el usuario introduce 0
    }
}
