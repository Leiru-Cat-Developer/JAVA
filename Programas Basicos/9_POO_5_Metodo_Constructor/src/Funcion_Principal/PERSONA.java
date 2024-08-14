package Funcion_Principal;
public class PERSONA {
    //Atributos
    String Nombre = "";
    int Edad = 0;
    //Metodos
    public PERSONA(String _Nombre,int _Edad){
        //METODO CONSTRUCTOR
        Nombre = _Nombre;
        Edad = _Edad;
        /*
            -> EL METODO CONSTRUCTOR TIENE EL MISMO NOMBRE QUE LA CLASE
            -> EL METODO CONSTRUCTOR TIENE QUE SER PUBLICO
            -> EL METODO CONSTRUCTOR NO DEVUELVE NINGUN VALOR ASÍ QUE NO SE LE ASIGNA NINGUNO
            -> EL METODO CONSTRUCTOR ASIGNA LOS MISMOS ATRIBUTOS CON "_" PARA NO CONFUNDIRLOS
            -> EL METODO CONSTRUCTOR IGUALA LAS VARIABLES DE LOS ATRIBUTOS A LAS VARIABLES DEL CONSTRUCTOR
        
            EL CONSTRUCTOR TAMBIEN SE PUEDE IGUALAR A VARIABLES SIN "_" PERO TENEMOS QUE IGUALARLAS DE LA SIGUIENTE MANERA:
        
            this.Nombre = Nombre;
            this.Edad = Edad;
        
            ESTO LE INDICA AL PROGRAMA CUAL ES EL ATRIBUTO Y CUALES SON LAS VARIABLES DEL CONSTRUCTOR
        */
    }
    public void Mostrar_Datos(){
        System.out.println("EL NOMBRE ES: "+Nombre);
        System.out.println("LA EDAD ES: "+Edad);
    }
}