package GUI_Package;
public class Persona {
    //ATRIBUTOS
    private String nombre;
    private int edad;
    private String nacionalidad;
    //METODOS
    public Persona(String nombre, int edad, String nacionalidad) {
        //CONSTRUCTOR
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }
    //CLASE PERSONALISABLE [POR QUE NOSOTROS MISMOS LA HEMOS HECHO]
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    @Override
    public String toString() {
        //REESCRIBIRMOS EL METODO PARA QUE AL RETORNAR EN LAS LISTAS DESPLEGABLES NO MANDE LA DIRECCION EN OTRO LENGUAJE
        return nombre;
    }
}