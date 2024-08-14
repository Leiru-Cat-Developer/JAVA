package Modelo;
import java.sql.Date;                                                           //TIPO "SQL"
public class Clase_Persona {
    private int idPersona;
    private String clavePersona;
    private String nombrePersona;
    private String domicilioPersona;
    private String celularPersona;
    private String correoElectronicoPersona;
    private Date fechaNacimientoPersona;
    private String generoPersona;
    public int getIdPersona() {
        return idPersona;
    }
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    public String getClavePersona() {
        return clavePersona;
    }
    public void setClavePersona(String clavePersona) {
        this.clavePersona = clavePersona;
    }
    public String getNombrePersona() {
        return nombrePersona;
    }
    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }
    public String getDomicilioPersona() {
        return domicilioPersona;
    }
    public void setDomicilioPersona(String domicilioPersona) {
        this.domicilioPersona = domicilioPersona;
    }
    public String getCelularPersona() {
        return celularPersona;
    }
    public void setCelularPersona(String celularPersona) {
        this.celularPersona = celularPersona;
    }
    public String getCorreoElectronicoPersona() {
        return correoElectronicoPersona;
    }
    public void setCorreoElectronicoPersona(String correoElectronicoPersona) {
        this.correoElectronicoPersona = correoElectronicoPersona;
    }
    public Date getFechaNacimientoPersona() {
        return fechaNacimientoPersona;
    }
    public void setFechaNacimientoPersona(Date fechaNacimientoPersona) {
        this.fechaNacimientoPersona = fechaNacimientoPersona;
    }
    public String getGeneroPersona() {
        return generoPersona;
    }
    public void setGeneroPersona(String generoPersona) {
        this.generoPersona = generoPersona;
    }
}