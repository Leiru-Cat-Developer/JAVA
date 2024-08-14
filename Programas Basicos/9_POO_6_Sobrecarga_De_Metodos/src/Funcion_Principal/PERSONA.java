package Funcion_Principal;
//CONSTRUCTOR DE FORMA AUTOMATICA = DAMOS CLICK DERECHO, INSERT CODE Y SELECCIONAMOS CONSTRUCTOR Y TODOS LOS ATRIBUTOS
public class PERSONA {
    //Atributos
    String Nombre = "";
    int Edad = 0;
    String DNI = "";
    //Metodos
    public PERSONA(String Nombre, int Edad){
        this.Nombre = Nombre;
        this.Edad = Edad;
        //CONSTRUCTOR PERSONA 1
    }
    public PERSONA(String DNI){
        this.DNI = DNI;
        //CONSTRUCTOR PERSONA 2
    }
    /*
        UNA SOBRECARGA DE CONSTRUCTORES ES CUANDO TENEMOS 2 O MÁS CONSTRUCTORES CON DIFERENTES PARAMETROS
    */
    public void Correr(){
        System.out.println("Soy "+Nombre+", tengo "+Edad+" años y estoy corriendo un maratón");
    }
    public void Correr(int KM){
        System.out.println("He corrido "+KM+" Kilometros");
    }
    /*
        UNA SOBRECARGA DE METODOS ES CUANDO TENEMOS 2 O MÁS METODOS CON PARAMETROS DIFERENTES
    */
}