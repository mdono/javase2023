
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Manuel {
    
    private String url, usuario, contrasena;
    private Connection miConexion;
    private Statement stmt;
    private ResultSet rs;
    
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
    
    public String ejecutarConsulta(String consulta) {
        try {
            stmt = miConexion.createStatement();
            rs = stmt.executeQuery(consulta);
            
            while (rs.next()) {                
                System.out.println(rs.getObject(1));
                System.out.println(rs.getObject(2));
                System.out.println(rs.getObject(3));
                System.out.println(rs.getObject(4));
                System.out.println(rs.getObject(5));
                System.out.println("");
            }
            
            return String.format("%s", "Consulta exitosa, imprimiendo...");
        } catch (SQLException ex) {
            System.err.println("Err: " + ex.getMessage());
        }
        
        return null;
    }
    
    public void cerrarConexion() {
        try {
            stmt.close();
            miConexion.close();
            rs = null;
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
        
        String query = "SELECT * FROM alumno";
        
        if (instancia.conecta()) {
            if (instancia.ejecutarConsulta(query) != null) {
                instancia.cerrarConexion();
            }
        } else {
            System.out.println("Sin datos!!!");
        }
    }
}
