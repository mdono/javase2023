
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectate {

    private Connection conn = null;
    
    public Conectate() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");            
            conn = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1/mysql",//url
                    "root",//usuario
                    "Guatemala"//contraseña
            );
            
            if (conn != null) {
                System.out.println("Conectado exitosamente");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("Err: " + ex.getMessage());
        }
    }
    
    public boolean desconectar() throws Exception {
        conn.close();
        return true;
    }

    public Connection getConexion() {
        return conn;
    }

    public void setConexion(Connection conn) {
        this.conn = conn;
    }
}