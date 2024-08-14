package JFrame;
public class Persona {
    //ATRIBUTOS
    private String nombre, apellidos, email, celular, direccion;
    //METODO
    public Persona(String nombre, String apellidos, String email, String celular, String direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.celular = celular;
        this.direccion = direccion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    @Override
    public String toString(){
        return this.nombre+" "+this.apellidos;
    }
}