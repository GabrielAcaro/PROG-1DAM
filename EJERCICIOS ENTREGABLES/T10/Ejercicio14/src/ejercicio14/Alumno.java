package ejercicio14;

/**
 * Alumno
 * @author Gabriel Acaro Sánchez
 */
public class Alumno {
    
    // Atributos privados
    
    private String nombreAlumno;
    private Asignatura[] asignaturas;
    
    // Constructores

    public Alumno(String nombreAlumno, Asignatura[] asignaturas) {
        this.nombreAlumno = nombreAlumno;
        this.asignaturas = asignaturas;
    }
    
    // Getters y setters 

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public Asignatura[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Asignatura[] asignaturas) {
        this.asignaturas = asignaturas;
    }
    
    // Otros metodos

    // Comienzo del metodo para rellenar la lista de alumnos

    public static void rellenarAlumno(java.util.ArrayList<Alumno> listaAlumnos){
        float notaLengua = 0, notaMates = 0, notaFisica = 0;
        String nombreAlumno = "";
        
        System.out.println("Introduzca el nombre del alumno:");
        nombreAlumno = Ejercicio14.scanner(); // Pedimos el nombre del alumno
    
        System.out.println("Introduzca la nota de Lengua:");
        notaLengua = Float.parseFloat(Ejercicio14.scanner()); // Utilizamos parsefloat para poder reutilizar el scanner
    
        System.out.println("Introduzca la nota de Mates:");
        notaMates = Float.parseFloat(Ejercicio14.scanner()); // Utilizamos parsefloat para poder reutilizar el scanner
    
        System.out.println("Introduzca la nota de Fisica:");
        notaFisica = Float.parseFloat(Ejercicio14.scanner()); // Utilizamos parsefloat para poder reutilizar el scanner
    
        Asignatura[] asignaturas = new Asignatura[3]; // Como solo crearemos 3 asignaturas damos tamaño 3
        
        // Inicializamos y damos valor a los objetos del array
        
        asignaturas[0] = new Asignatura("Lengua", notaLengua);
        asignaturas[1] = new Asignatura("Mates", notaMates);
        asignaturas[2] = new Asignatura("Fisica", notaFisica);
    
        listaAlumnos.add(new Alumno(nombreAlumno, asignaturas)); // Añadimos a la lista de alumnos la informacion del alumno
    }

    // Comienzo del metodo para mostrar los alumnos

    public static void mostrarAlumnos(java.util.ArrayList<Alumno> listaAlumnos){
        for(int i = 0; i < listaAlumnos.size(); i++){
            System.out.println(listaAlumnos.get(i).toString()); 
        }
    }   
    
    // ToString

    @Override
    public String toString() {
        String resultado = nombreAlumno + ":\nAsignaturas:";
        for (int i = 0; i < asignaturas.length; i++) {
            resultado += asignaturas.toString() + "\n";
        }
        return resultado;
    }
}
