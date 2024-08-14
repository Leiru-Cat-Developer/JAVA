package Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class SQL_Usuario {
    public boolean registrar(Usuario usuario){
        Clase_Conexion con = new Clase_Conexion();
        PreparedStatement ps = null;
        try {
            Connection conexion = con.getConnection();
            ps = conexion.prepareStatement("insert into usuario(nombreUsuario,contraseña,nombre,correo,idTipoDeUsuario) values(?,?,?,?,?)");
            ps.setString(1, usuario.getNombreUsuario());
            ps.setString(2, usuario.getContraseña());
            ps.setString(3, usuario.getNombre());
            ps.setString(4, usuario.getCorreo());
            ps.setInt(5, usuario.getIdTipoDeUsuario());
            ps.executeUpdate();
            conexion.close();
            return true;
        } catch (Exception ex) {
            System.err.println("ERROR AL REGISTRAR "+ex);
            return false;
        }
    }
    public int verificarUsuario(String usuario){
        Clase_Conexion con = new Clase_Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Connection conexion = con.getConnection();
            ps = conexion.prepareStatement("select count(id) from usuario where nombreusuario=?");
            ps.setString(1, usuario);
            rs = ps.executeQuery();
            if(rs.next()){
                return rs.getInt(1);
            }
            return 1;
        } catch (Exception ex) {
            System.err.println("ERROR AL VERIFICAR USUARIO "+ex);
            return 1;
        }
    }
    public boolean comprobarFormatoEmail(String correo){
        /*
            EL SIGUIENTE CÓDIGO [49-52] SE PUEDE VERIFICAR BUSCANDO EN GOOGLE "PATRON PARA VERIFICAR EMAIL EN JAVA"
        */
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                                          + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(correo);
        return mather.find();
    }
    public boolean iniciarSesion(Usuario usuario){
        Clase_Conexion con = new Clase_Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Connection conexion = con.getConnection();
            ps = conexion.prepareStatement("select u.id,u.nombreUsuario,u.contraseña,u.nombre,u.idTipoDeUsuario,t.nombre from usuario as u inner join tipo_usuario as t on u.idTipoDeUsuario = t.id where nombreusuario=?");
            ps.setString(1, usuario.getNombreUsuario());
            rs = ps.executeQuery();
            if(rs.next()){
                if(usuario.getContraseña().equals(rs.getString("contraseña"))){
                    ps = conexion.prepareStatement("update usuario set ultima_sesion=? where id=?");
                    ps.setString(1, usuario.getUltima_sesion());
                    ps.setInt(2, rs.getInt("id"));
                    ps.executeUpdate();
                    
                    usuario.setId(rs.getInt("u.id"));
                    usuario.setNombre(rs.getString("u.nombre"));
                    usuario.setIdTipoDeUsuario(rs.getInt("u.idTipoDeUsuario"));
                    usuario.setNombreRolDeUsuario(rs.getString("t.nombre"));
                    
                    return true;
                }else{
                    return false;
                }
            }
            return false;
        } catch (Exception ex) {
            System.err.println("ERROR AL INICIAR SESION "+ex);
            return false;
        }
    }
}