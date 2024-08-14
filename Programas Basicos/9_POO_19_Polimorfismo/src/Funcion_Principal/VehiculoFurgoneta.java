package Funcion_Principal;
public class VehiculoFurgoneta extends Vehiculo {
    //ATRIBUTOS
    private int carga;
    //METODOS
    public VehiculoFurgoneta(int carga, String matricula, String marca, String modelo) {
        //CONSTRUCTOR
        super(matricula, marca, modelo);
        this.carga = carga;
    }
    public int getCarga() {
        //GETTER PARA CARGA
        return carga;
    }
    @Override
    public String mostrarDatos(){
        return "\n"+"MATRICULA: "+matricula+", MARCA: "+marca+", MODELO: "+modelo+", CARGA: "+carga;
    }
}