package Funcion_Principal;
public class Persona {
    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private int edad;
    //METODOS
    public Persona(String nombre, String apellido, int edad) {
        //CONSTRUCTOR
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public String getNombre() {
        //GETTER PARA NOMBRE
        return nombre;
    }
    public String getApellido() {
        //GETTER PARA APELLIDO
        return apellido;
    }
    public int getEdad() {
        //GETTER PARA EDAD
        return edad;
    }
}