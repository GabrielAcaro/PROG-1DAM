package practicatema13;
import java.sql.*;

/**
 * PracticaTema13
 * @author Gabriel Acaro Sánchez
 */
public class PracticaTema13 {
    
    public static final String URL = "jdbc:postgresql://localhost:5433/alumnos";
    public static final String USUARIO = "postgres";
    public static final String PAS = "example";
    
    public static void main(String[] args) {
        
        try (
                Connection conexion = DriverManager.getConnection(URL, USUARIO, PAS);
                ){
            
            //CONEXIÓN A LA BBDD
            System.out.println("Creando conexión...");
            Statement statement = conexion.createStatement();
            System.out.println("Conexión establecida.");  
            
            //CONSULTAS
            
            // SELECT
            System.out.println("\nLeyendo datos de alumnos...");
            ResultSet rs = statement.executeQuery(
                    "SELECT id, nombre, apellido, email " +
                    "FROM alumnos " +
                    "WHERE activo = true " +
                    "ORDER BY apellido, nombre");

            System.out.println("Se ha accedido a los datos correctamente.");
            System.out.println("\nMostrando datos...");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " - " +
                        rs.getString("nombre") + " " +
                        rs.getString("apellido") + " - " +
                        rs.getString("email"));
            }

            // INSERT
            System.out.println("\nInsertando nuevo alumno...");

            String sqlInsert = "INSERT INTO alumnos "
                    + "(nombre, apellido, email, fecha_nacimiento, telefono, direccion, ciudad, codigo_postal) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement psInsert = conexion.prepareStatement(sqlInsert);
            psInsert.setString(1, "Lucía");
            psInsert.setString(2, "Morales");
            psInsert.setString(3, "lucia.morales@email.com");
            psInsert.setDate(4, Date.valueOf("2004-03-15"));
            psInsert.setString(5, "611223344");
            psInsert.setString(6, "Calle Nueva 12");
            psInsert.setString(7, "Madrid");
            psInsert.setString(8, "28010");

            int filasInsertadas = psInsert.executeUpdate();
            System.out.println("Filas insertadas: " + filasInsertadas);

            // UPDATE
            System.out.println("\nActualizando curso...");

            String sqlUpdate = "UPDATE cursos "
                    + "SET profesor = ?, aula = ? "
                    + "WHERE nombre = ?";

            PreparedStatement psUpdate = conexion.prepareStatement(sqlUpdate);
            psUpdate.setString(1, "Dr. Javier Romero");
            psUpdate.setString(2, "Z999");
            psUpdate.setString(3, "Programación Java");

            int filasActualizadas = psUpdate.executeUpdate();
            System.out.println("Filas actualizadas: " + filasActualizadas);

            // DELETE
            System.out.println("\nEliminando curso...");
            
            String sqlDelete = "DELETE FROM cursos WHERE nombre = ?";

            PreparedStatement psDelete = conexion.prepareStatement(sqlDelete);
            psDelete.setString(1, "Computación en la Nube");

            int filasEliminadas = psDelete.executeUpdate();
            System.out.println("Filas eliminadas: " + filasEliminadas);
        } catch (SQLException e) {
            System.out.println("Error de SQL");
            System.out.println(e.getMessage());
        }
    }
    
}
