package Funciones_Principales;
public class Persona {
    private String nombre;
    private String celular;
    private String correo;
    public Persona(String nombre, String celular, String correo) {
        this.nombre = nombre;
        this.celular = celular;
        this.correo = correo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCelular() {
        return celular;
    }
    public String getCorreo() {
        return correo;
    }
}