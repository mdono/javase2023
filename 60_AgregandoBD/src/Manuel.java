
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

    public boolean conecta() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        miConexion = DriverManager.getConnection(
                url,
                usuario,
                contrasena
        );

        return true;
    }

    public String ejecutaConsulta(String query) {
        try {
            stmt = miConexion.createStatement();
            ps = miConexion.prepareStatement(query);
            ps.setString(1, "Pedro");
            ps.setString(2, "87654321");
            ps.setString(3, "pedro@correo.com");
            ps.setString(4, "2023-08-03 17:57:00");

            //se ejecuta
            ps.execute();
            System.out.println("Almacenado correctamente");
        } catch (SQLException ex) {
            System.err.println("Err: " + ex.getMessage());
        }

        return null;
    }

    public void cerrarConexion() {
        try {
            stmt.close();
            miConexion.close();
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
        String query = "INSERT INTO "
                + "alumno(nombre, telefono, correo, timestamp) "
                + "VALUES(?,?,?,?)";

        try {
            if (instancia.conecta()) {
                if (instancia.ejecutaConsulta(query) != null) {
                    instancia.cerrarConexion();
                }
            } else {
                System.out.println("Sin conexion!!!");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("Err: " + ex.getMessage());
        }
    }
}