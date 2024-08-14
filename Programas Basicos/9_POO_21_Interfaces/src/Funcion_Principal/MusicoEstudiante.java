package Funcion_Principal;
public class MusicoEstudiante implements Musico, Estudiante{
    //METODOS
    @Override
    public void hablar(){
        System.out.println("ESTOY HABLANDO ESPAÑOL ...");
    }
    @Override
    public void tocarMusica(){
        System.out.println("ESTOY TOCANDO MÚSICA ...");
    }
    @Override
    public void estudiar(){
        System.out.println("ESTOY ESTUDIANTO MATEMÁTICAS ...");
    }
}