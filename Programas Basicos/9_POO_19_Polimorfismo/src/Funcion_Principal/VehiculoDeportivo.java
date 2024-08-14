package Funcion_Principal;
public class VehiculoDeportivo extends Vehiculo {
    //ATRIBUTOS
    private int cilindrada;
    //METODOS
    public VehiculoDeportivo(int cilindrada, String matricula, String marca, String modelo) {
        //CONSTRUCTOR
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }
    public int getCilindrada() {
        //GETTER PARA CILINDRADA
        return cilindrada;
    }
    @Override
    public String mostrarDatos(){
        return "\n"+"MATRICULA: "+matricula+", MARCA: "+marca+", MODELO: "+modelo+", CILINDRADA: "+cilindrada;
    }
}