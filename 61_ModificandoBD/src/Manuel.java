
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Manuel {

    private String url, usuario, contrasena;
    private Connection miConexion;
    private Statement stmt;
    private PreparedStatement ps;

    public Manuel(String url, String usuario, String contrasena) {
        this.url = url;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public boolean conecta() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            miConexion = DriverManager.getConnection(
                    url,
                    usuario,
                    contrasena
            );
            
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("Err: " + ex.getMessage());
        }

        return false;
    }

    public void ejecutaConsulta(String query) throws SQLException {
        stmt = miConexion.createStatement();
        ps = miConexion.prepareStatement(query);
        ps.setString(1, "Lucas");
        ps.setInt(2, 2);

        ps.execute();
        System.out.println("Actualizado correctamente");

        //return null;
    }

    public void cerrarConexion() {
        try {
            stmt.close();
            miConexion.close();

            System.out.println("Conexion cerrada");
        } catch (SQLException ex) {
            System.err.println("Err: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        Manuel instancia = new Manuel(
                "jdbc:mysql://localhost/java",
                "root",
                "Guatemala"
        );

        String query = "UPDATE alumno SET nombre=? "
                + "WHERE correlativo=?";

        if (instancia.conecta()) {
            try {
                instancia.ejecutaConsulta(query);
                instancia.cerrarConexion();
            } catch (SQLException ex) {
                System.err.println("Err: " + ex.getMessage());
            }
        } else {
            System.out.println("No se conecto");
        }
    }
}