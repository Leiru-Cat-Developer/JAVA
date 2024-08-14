package Funcion_Principal;
public class Futbolista extends Persona{
    //ATRIBUTOS
    private int dorsal;
    private String pocision;
    //METODOS
    public Futbolista(int dorsal, String pocision, String nombre, String apellido, int edad) {
        //CONSTRUCTOR
        super(nombre, apellido, edad);
        this.dorsal = dorsal;
        this.pocision = pocision;
    }
    public int getDorsal() {
        //GETTER PARA DORSAL
        return dorsal;
    }
    public String getPocision() {
        //GETTER PARA POCISION
        return pocision;
    }
    @Override
    public String toString() {
        //MOSTRAR DATOS
        return "Futbolista{" + "dorsal=" + dorsal + ", pocision=" + pocision + '}';
    }
    @Override
    public void partidoDeFutbol(){
        System.out.println("JUEGA EL PARTIDO DE FUTBOL ...");
    }
    @Override
    public void entrenamiento(){
        System.out.println("ENTRENA ...");
    }
    public void entrevista(){
        System.out.println("CONCEDE UNA ENTREVISTA ...");
    }
}