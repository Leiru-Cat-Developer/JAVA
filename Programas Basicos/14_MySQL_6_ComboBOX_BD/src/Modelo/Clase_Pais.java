package Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
public class Clase_Pais {
    private int idPais;
    private String nombrePais;
    public int getIdPais() {
        return idPais;
    }
    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }
    public String getNombrePais() {
        return nombrePais;
    }
    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }
    public String toString() {
        return this.nombrePais;
    }
    public Vector<Clase_Pais> mostrarPaises(){
        PreparedStatement pst = null;
        ResultSet rst = null;
        Vector<Clase_Pais> vectorPaises = new Vector<Clase_Pais>();
        Clase_Pais clase_pais = null;
        //CONEXION + AGREGAR CONTENIDO DE BD A COMBO BOX
        try {
            Clase_Conexion con = new Clase_Conexion();
            Connection conexion = con.getConnection();
            pst = conexion.prepareStatement("select * from paises");
            rst = pst.executeQuery();
            clase_pais = new Clase_Pais();
            clase_pais.setIdPais(0);
            clase_pais.setNombrePais("Seleccione Pais");
            vectorPaises.add(clase_pais);
            while(rst.next()){
                clase_pais = new Clase_Pais();
                clase_pais.setIdPais(rst.getInt("idPais"));
                clase_pais.setNombrePais(rst.getString("nombrePais"));
                vectorPaises.add(clase_pais);
            }
            conexion.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR DE CONEXION... DESDE VECTOR PAISES");
        }
        return vectorPaises;
    }
}