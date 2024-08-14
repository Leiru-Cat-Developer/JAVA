package Funcion_Principal;
public class Vehiculo {
    //ATRIBUTOS
    protected String matricula;
    protected String marca;
    protected String modelo;
    //METODOS
    public Vehiculo(String matricula, String marca, String modelo) {
        //CONSTRUCTOR
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }
    public String getMatricula() {
        //GETTER PARA MATRICULA
        return matricula;
    }
    public String getMarca() {
        //GETTER PARA MARCA
        return marca;
    }
    public String getModelo() {
        //GETTER PARA MODELO
        return modelo;
    }
    public String mostrarDatos(){
        return "\n"+"MATRICULA: "+matricula+", MARCA: "+marca+", MODELO: "+modelo;
    }
}