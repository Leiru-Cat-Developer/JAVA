package Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
public class Clase_Estado {
    private int idEstado;
    private String nombreEstado;
    public int getIdEstado() {
        return idEstado;
    }
    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }
    public String getNombreEstado() {
        return nombreEstado;
    }
    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }
    public String toString() {
        return this.nombreEstado;
    }
    public Vector<Clase_Estado> mostrarEstados(Integer idPais){
        PreparedStatement pst = null;
        ResultSet rst = null;
        Vector<Clase_Estado> vectorEstados = new Vector<Clase_Estado>();
        Clase_Estado clase_estado = null;
        //CONEXION + AGREGAR CONTENIDO DE BD A COMBO BOX
        try {
            Clase_Conexion con = new Clase_Conexion();
            Connection conexion = con.getConnection();
            pst = conexion.prepareStatement("select * from estados where idPais="+idPais);
            rst = pst.executeQuery();
            clase_estado = new Clase_Estado();
            clase_estado.setIdEstado(0);
            clase_estado.setNombreEstado("Seleccione Estado");
            vectorEstados.add(clase_estado);
            while(rst.next()){
                clase_estado = new Clase_Estado();
                clase_estado.setIdEstado(rst.getInt("idEstado"));
                clase_estado.setNombreEstado(rst.getString("nombreEstado"));
                vectorEstados.add(clase_estado);
            }
            conexion.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR DE CONEXION... DESDE VECTOR ESTADO");
        }
        return vectorEstados;
    }
}