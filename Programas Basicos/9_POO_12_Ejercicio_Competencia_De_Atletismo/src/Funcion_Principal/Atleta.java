package Funcion_Principal;
public class Atleta {
    //ATRIBUTOS
    private int ID;
    private float Tiempo;
    private String Nombre;
    //METODOS
    public Atleta(int ID, float Tiempo, String Nombre){
        //CONSTRUCTOR
        this.ID = ID;
        this.Tiempo = Tiempo;
        this.Nombre = Nombre;
    }
    public float getTiempo(){
        //GETTER TIEMPO
        return Tiempo;
    }
    public String Mostrar_Datos_Del_Ganador(){
        System.out.println("\n\t\t"+"DATOS DEL GANADOR");
        return "\n"+"ID: "+ID+"\n"+"TIEMPO: "+Tiempo+"\n"+"NOMBRE: "+Nombre+"\n";
    }
}