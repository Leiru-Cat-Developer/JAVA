package Funcion_Principal;
public class Entrenador extends Persona{
    //ATRIBUTOS
    private String nombreDeLaEstrategia;
    //METODOS
    public Entrenador(String nombreDeLaEstrategia, String nombre, String apellido, int edad) {
        //CONSTRUCTOR
        super(nombre, apellido, edad);
        this.nombreDeLaEstrategia = nombreDeLaEstrategia;
    }
    public String getNombreDeLaEstrategia() {
        //GETTER PARA NOMBRE DE LA ESTRATEGIA
        return nombreDeLaEstrategia;
    }
    @Override
    public String toString() {
        //MOSTRAR DATOS
        return "Entrenador{" + "nombreDeLaEstrategia=" + nombreDeLaEstrategia + '}';
    }
    @Override
    public void partidoDeFutbol(){
        System.out.println("DIRIGE AL EQUIPO ...");
    }
    @Override
    public void entrenamiento(){
        System.out.println("ENTRENA AL EQUIPO ...");
    }
    public void planificarEntrenamiento(){
        System.out.println("PLANIFICA EL ENTREMANIENTO EN UN DÍA LLUVIOSO PARA ANIMAR AL EQUIPO ...");
    }
}