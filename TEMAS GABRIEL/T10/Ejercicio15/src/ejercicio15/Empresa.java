package ejercicio15;
import java.util.ArrayList;

/**
 * Empresa
 * @author Gabriel Acaro Sánchez
 */
public class Empresa {
    
    // Atributos privados
    
    private String nombreEmpresa;
    private ArrayList<Empleados> listaEmpleados;
    
    // Constructores
    
    public Empresa() {
        nombreEmpresa = "";
        listaEmpleados = new ArrayList<>();
    }
    
    public Empresa(String nombreEmpresa, ArrayList<Empleados> listaEmpleados) {
        this.nombreEmpresa = nombreEmpresa;
        this.listaEmpleados = listaEmpleados;
    }
    
    // Getter y setter

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public ArrayList<Empleados> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleados> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }
    
    // Otros metodos
    
    // Comienzo del metodo de la primera opcion del programa
    
    public static void rellenarListaEmpresa(ArrayList<Empresa> listaEmpresa){
        // Inicializacion de variables
        
        String nombreEmpresa = "", nombreEmpleado = "", respuestaUser = "";
        int salario = 0, contadorEmpleados = 1;
        
        // Comienzo del primer do while
        do {
            System.out.println("Nombre de la empresa: ");
            nombreEmpresa = Ejercicio15.scanner(); // Pedimos el nombre de la empresa a incluir en la lista de empresas
            
            ArrayList<Empleados> listaEmpleados = new ArrayList<>(); // Creamos la lista de empleados de la empresa
            
            do { // Comienzo del segundo do while
                System.out.println("Introduzca el nombre del empleado " + contadorEmpleados + ":");
                nombreEmpleado = Ejercicio15.scanner(); // Pedimos el nombre del empleado
            
                System.out.println("Introduzca el salario del empleado:");
                salario = Integer.parseInt(Ejercicio15.scanner()); // Pedimos el salario del empleado
                
                listaEmpleados.add(new Empleados(nombreEmpleado, salario)); // Añadimos a la lista de empleados los datos solicitados
                
                System.out.println("Desea añadir mas empleados? (introduzca si o no):");
                respuestaUser = Ejercicio15.scanner(); // Pedimos al usuario si quiere introducir mas empleados
                
            } while (!"no".equalsIgnoreCase(respuestaUser)); // Si la respuesta es no finaliza el do while
            
            listaEmpresa.add(new Empresa(nombreEmpresa, listaEmpleados)); // Añadimos los datos de la empresa a la lista de empresas
            
            System.out.println("Desea añadir mas empresas? (introduzca si o no):");
            respuestaUser = Ejercicio15.scanner(); // Pedimos al usuario si quiere crear otra empresa
            
        } while (!"no".equalsIgnoreCase(respuestaUser)); // Si la respuesta es no finaliza el do while
    }
    
    // Comienzo del metodo de mostrar la lista de empresas
    
    public static void mostrarEmpresas(ArrayList<Empresa> listaEmpresa) {
        for (int i = 0; i < listaEmpresa.size(); i++) {
            System.out.println(listaEmpresa.get(i).toString());
        }
    }

    // ToString

    @Override
    public String toString() {
        String resultado = "Empresa: " + nombreEmpresa + "\nEmpleados de " + nombreEmpresa + ":\n";
        for (int i = 0; i < listaEmpleados.size(); i++) {
            resultado += listaEmpleados.get(i).toString() + "\n";
        }
        return resultado;
    }
}
