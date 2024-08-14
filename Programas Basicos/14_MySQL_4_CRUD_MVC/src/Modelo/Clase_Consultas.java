package Modelo;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Clase_Consultas extends Clase_Conexion{
    PreparedStatement pst;
    ResultSet rst;
    public boolean insertarPersona(Clase_Persona persona){
        Connection conexion = getConnection();
        try {
            pst = conexion.prepareStatement("insert into persona (clave, nombre, domicilio, celular, correoElectronico, fechaNacimiento, genero) values (?,?,?,?,?,?,?)");
            pst.setString(1, persona.getClavePersona());
            pst.setString(2, persona.getNombrePersona());
            pst.setString(3, persona.getDomicilioPersona());
            pst.setString(4, persona.getCelularPersona());
            pst.setString(5, persona.getCorreoElectronicoPersona());
            pst.setDate(6, persona.getFechaNacimientoPersona());
            pst.setString(7, persona.getGeneroPersona());
            int resultadoInsertar = pst.executeUpdate();
            if(resultadoInsertar > 0){
                return true;
            }else{
                return false;
            }
        } catch (Exception ex) {
            System.err.println("ERROR 1... DESDE CLASE_CONSULTAS");             return false;
        } finally{
            try {
                conexion.close();
            } catch (Exception e) {
                System.err.println("ERROR 2... DESDE CLASE_CONSULTAS");
            }
        }
    }
    public boolean buscarPersona(Clase_Persona persona){
        Connection conexion = getConnection();
        try {
            pst = conexion.prepareStatement("select * from persona where clave=?");
            pst.setString(1, persona.getClavePersona());
            rst = pst.executeQuery();
            if(rst.next()){
                persona.setIdPersona(rst.getInt("idPersona"));
                persona.setClavePersona(rst.getString("clave"));
                persona.setNombrePersona(rst.getString("nombre"));
                persona.setDomicilioPersona(rst.getString("domicilio"));
                persona.setCelularPersona(rst.getString("celular"));
                persona.setCorreoElectronicoPersona(rst.getString("correoElectronico"));
                persona.setFechaNacimientoPersona(rst.getDate("fechaNacimiento"));
                persona.setGeneroPersona(rst.getString("genero"));
                return true;
            }else{
                return false;
            }
        } catch (Exception ex) {
            System.err.println("ERROR 1... DESDE CLASE_CONSULTAS");             return false;
        } finally{
            try {
                conexion.close();
            } catch (Exception e) {
                System.err.println("ERROR 2... DESDE CLASE_CONSULTAS");
            }
        }
    }
    public boolean modificarPersona(Clase_Persona persona){
        Connection conexion = getConnection();
        try {
            pst = conexion.prepareStatement("update persona set clave=?, nombre=?, domicilio=?, celular=?, correoElectronico=?, fechaNacimiento=?, genero=? where idPersona=?");
            pst.setString(1, persona.getClavePersona());
            pst.setString(2, persona.getNombrePersona());
            pst.setString(3, persona.getDomicilioPersona());
            pst.setString(4, persona.getCelularPersona());
            pst.setString(5, persona.getCorreoElectronicoPersona());
            pst.setDate(6, persona.getFechaNacimientoPersona());
            pst.setString(7, persona.getGeneroPersona());
            pst.setInt(8, persona.getIdPersona());
            int resultadoModificar = pst.executeUpdate();
            if(resultadoModificar > 0){
                return true;
            }else{
                return false;
            }
        } catch (Exception ex) {
            System.err.println("ERROR 1... DESDE CLASE_CONSULTAS");             return false;
        } finally{
            try {
                conexion.close();
            } catch (Exception e) {
                System.err.println("ERROR 2... DESDE CLASE_CONSULTAS");
            }
        }
    }
    public boolean eliminarPersona(Clase_Persona persona){
        Connection conexion = getConnection();
        try {
            pst = conexion.prepareStatement("delete from persona where idPersona=?");
            pst.setInt(1, persona.getIdPersona());
            int resultadoEliminar = pst.executeUpdate();
            if(resultadoEliminar > 0){
                return true;
            }else{
                return false;
            }
        } catch (Exception ex) {
            System.err.println("ERROR 1... DESDE CLASE_CONSULTAS");             return false;
        } finally{
            try {
                conexion.close();
            } catch (Exception e) {
                System.err.println("ERROR 2... DESDE CLASE_CONSULTAS");
            }
        }
    }
}