package proyectocorelink.programa1;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * programa1
 * @author Gabriel Acaro Sánchez
 */
public class programa1 {
    public static void main(String[] args) {
        String linea;
        int contador = 0;

        try (
            BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Users\\gabri\\Downloads\\proyectoCorelink\\datos_empleados.txt"));
                
            PrintWriter pw = new PrintWriter(
                    new FileWriter("C:\\WorkSpace_Netbeans\\PROG-1DAM\\TEMAS GABRIEL\\T11\\ProyectoCorelink\\src\\proyectocorelink\\programa1\\datos_empleados.txt"))
        ) {

            while ((linea = br.readLine()) != null) {
                if (linea.contains("Zona Cero")) {
                    pw.println(linea);
                    contador++;
                }
            }

            System.out.println("Número de empleados en Zona Cero: " + contador);

        } catch (IOException e) {
            System.out.println("Error de entrada/salida");
            System.out.println(e.getMessage());
        }
    }
}
