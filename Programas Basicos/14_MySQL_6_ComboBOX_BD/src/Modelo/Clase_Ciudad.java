package Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
public class Clase_Ciudad {
    private int idCiudad;
    private String nombreCiudad;
    public int getIdCiudad() {
        return idCiudad;
    }
    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }
    public String getNombreCiudad() {
        return nombreCiudad;
    }
    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }
    public String toString() {
        return this.nombreCiudad;
    }
    public Vector<Clase_Ciudad> mostrarCiudades(Integer idEstado){
        PreparedStatement pst = null;
        ResultSet rst = null;
        Vector<Clase_Ciudad> vectorCiudades = new Vector<Clase_Ciudad>();
        Clase_Ciudad clase_ciudad = null;
        //CONEXION + AGREGAR CONTENIDO DE BD A COMBO BOX
        try {
            Clase_Conexion con = new Clase_Conexion();
            Connection conexion = con.getConnection();
            pst = conexion.prepareStatement("select * from ciudades where idEstado="+idEstado);
            rst = pst.executeQuery();
            clase_ciudad = new Clase_Ciudad();
            clase_ciudad.setIdCiudad(0);
            clase_ciudad.setNombreCiudad("Seleccione Ciudad");
            vectorCiudades.add(clase_ciudad);
            while(rst.next()){
                clase_ciudad = new Clase_Ciudad();
                clase_ciudad.setIdCiudad(rst.getInt("idCiudad"));
                clase_ciudad.setNombreCiudad(rst.getString("nombreCiudad"));
                vectorCiudades.add(clase_ciudad);
            }
            conexion.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR DE CONEXION... DESDE VECTOR CIUDADES");
        }
        return vectorCiudades;
    }
}