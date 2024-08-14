package Funcion_Principal;
public abstract class Persona {
    //ATRIBUTOS
    protected String nombre;
    protected String apellido;
    protected int edad;
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
    @Override
    public String toString() {
        //MOSTRAR DATOS
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }
    public void viajar(){
        System.out.println("ESTA VIAJANDO");
    }
    public abstract void partidoDeFutbol();
    public abstract void entrenamiento();
}