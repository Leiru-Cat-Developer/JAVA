package Funcion_Principal;
public class VehiculoTurismo extends Vehiculo {
    //ATRIBUTOS
    private int numeroDePuertas;
    //METODOS
    public VehiculoTurismo(int numeroDePuertas, String matricula, String marca, String modelo) {
        //CONSTRUCTOR
        super(matricula, marca, modelo);
        this.numeroDePuertas = numeroDePuertas;
    }
    public int getNumeroDePuertas() {
        //GETTER PARA NUMERO DE PUERTAS
        return numeroDePuertas;
    }
    @Override
    public String mostrarDatos(){
        return "\n"+"MATRICULA: "+matricula+", MARCA: "+marca+", MODELO: "+modelo+", NUMERO DE PUERTAS: "+numeroDePuertas;
    }
}