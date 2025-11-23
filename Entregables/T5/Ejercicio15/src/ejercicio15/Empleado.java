package ejercicio15;

/**
 * Empleado
 * @author Gabriel Acaro Sánchez
 */
public class Empleado {
    
    // Atributos privados
    
    private String nombre;
    private int salario;
    private Direccion direccion;
    
    // Constructores

    public Empleado(){
        nombre = "";
        salario = 0;
        direccion = new Direccion();
    }
    public Empleado(String nombre, int salario, Direccion direccion) {
        this.nombre = nombre;
        this.salario = salario;
        this.direccion = direccion;
    }
    
    //Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    // Otros métodos

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario + "€");
        System.out.println("Direccion:\n");
        System.out.println("Calle: " + direccion.getCalle());
        System.out.println("Numero: " + direccion.getNumero());
        System.out.println("Puerta: " + direccion.getPiso());
        System.out.println("Ciudad: " + direccion.getCiudad());
    }
    
    // toString()

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", salario=" + salario + ", direccion=" + direccion + '}';
    }
}
