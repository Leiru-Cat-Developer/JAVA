package Modelo;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class Clase_Conexion {
    public static final String URL = "jdbc:mysql://localhost:3306/datospaises?autoReconnet=true&useSSL=false";
    public static final String USUARIO = "root";
    public static final String CONTRASEÑA = "123456789";
    public Connection getConnection(){
        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR... CONEXION INCORRECTA");
        }
        return conexion;
    }
}