package Funciones_Principales;
public class Pasajero {
    //ATRIBUTOS
    private String nombre;
    private String numeroDePasaporte;
    private String nacionalidad;
    //METODOS
    public Pasajero(String nombre, String numeroDePasaporte, String nacionalidad) {
        //CONSTRUCTOR
        this.nombre = nombre;
        this.numeroDePasaporte = numeroDePasaporte;
        this.nacionalidad = nacionalidad;
    }
    public String getNombre() {
        //GETTER PARA NOMBRE
        return nombre;
    }
    public String getNumeroDePasaporte() {
        //GETTER PARA NUMERO DE PASAPORTE
        return numeroDePasaporte;
    }
    public String getNacionalidad() {
        //GETTER PARA NACIONALIDAD
        return nacionalidad;
    }
}