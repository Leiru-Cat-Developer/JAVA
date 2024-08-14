package Funcion_Principal;
public class Doctor extends Persona{
    //ATRIBUTOS
    private String titulacion;
    private int añosDeExperiencia;
    //METODOS
    public Doctor(String titulacion, int añosDeExperiencia, String nombre, String apellido, int edad) {
        //CONSTRUCTOR
        super(nombre, apellido, edad);
        this.titulacion = titulacion;
        this.añosDeExperiencia = añosDeExperiencia;
    }
    public String getTitulacion() {
        //GETTER PARA TITULACIÓN
        return titulacion;
    }
    public int getAñosDeExperiencia() {
        //GETTER PARA AÑOS DE EXPERIENCIA
        return añosDeExperiencia;
    }
    @Override
    public String toString() {
        //MOSTRAR DATOS
        return "Doctor{" + "titulacion=" + titulacion + ", a\u00f1osDeExperiencia=" + añosDeExperiencia + '}';
    }
    @Override
    public void partidoDeFutbol(){
        System.out.println("ESPERA A QUE ALGUIEN SE LESIONE ...");
    }
    @Override
    public void entrenamiento(){
        System.out.println("ESPERA A QUE ALGUIEN SE LESIONE ...");
    }
    public void curarLesion(){
        System.out.println("LO CURA ...");
    }
}