package ejercicio15;

/**
 *Ejercicio 15 moodle
 * @author gabri
 */
public class Ejercicio15 {
public static void main(String[] args) {
    int tiempo = 10000;
    int horas = tiempo / 3600;
    int resto = tiempo % 3600;
    int minutos = resto / 60;
    int segundos = resto % 60;
    
        System.out.println("10.000 segundos hacen un total de: " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");
    }
}
    /* CODIGO ORIGINAL ERRONEO 
    int horas = tiempo / 3600;
    tiempo = 10000 - ( 3600 * 2 );
    int minutos = tiempo / 60;
    tiempo = tiempo - 2760;
    int segundos = tiempo; */