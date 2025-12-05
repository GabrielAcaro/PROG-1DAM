package ejercicio7;

/**
 * Test
 * @author Gabriel Acaro Sánchez
 */
public class Test {

    public static void main(String[] args) {
        
        // Creamos el objeto Televisor
        
        System.out.println("----- TELEVISOR -----");
        Televisor tv = new Televisor(); // Creamos un objeto televisor
        
        tv.encender(); // Encendemos la tv
        System.out.println("");
        
        tv.mostrarInfo(); // Mostramos informacion inicial
        System.out.println("");
        
        tv.subirVolumen(); // Subimos 1
        tv.subirVolumen(); // Subimos 1
        tv.subirVolumen(); // Subimos 1
        
        System.out.println("\nVolumen actual despues de subir 3 veces: \n");
        
        tv.mostrarInfo(); // Mostramos info
        
        System.out.println("");
        
        tv.cambiarCanal(24); // Cambiamos canal
        
        System.out.println("");
        
        tv.bajarVolumen(); // Bajamos volumen
        
        System.out.println("");
        
        tv.apagar(); // Apagamos la tv
        
        System.out.println("");
        
        tv.mostrarInfo(); // Mostramos informacion final
        
        
        // Ahora creamos el objeto radio
        
        System.out.println("\n----- RADIO -----");
        
        Radio radio = new Radio(); // Creamos un objeto radio
        
        radio.encender(); // Encendemos la radio
        
        System.out.println("");
        
        radio.mostrarInfo(); // Mostramos info
        
        System.out.println("");
        
        radio.subirVolumen(); // Subimos volumen
        radio.subirVolumen(); // Subimos volumen
        
        System.out.println("");
        
        radio.cambiarCanal(95.5f); // Cambiamos emisora
        
        System.out.println("");
        
        radio.bajarVolumen(); // Bajamos volumen
        
        System.out.println("");
        
        radio.apagar(); // Apagamos la radio
        
        System.out.println("");
        
        radio.mostrarInfo(); // Mostramos informacion final
    }
}
