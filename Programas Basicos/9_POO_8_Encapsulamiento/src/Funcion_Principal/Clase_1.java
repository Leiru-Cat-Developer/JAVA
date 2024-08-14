//ENCAPSULAMIENTO
package Funcion_Principal;
public class Clase_1 {
    private int Edad = 0;
    private String Nombre = "";
    //METODOS ACCESORES [SETTERS y GETTERS]
    public void Set_Edad(int Edad){
        this.Edad = Edad;
        //PIDE EL DATO AL USUARIO [OBTENER]
    }
    public int Get_Edad(){
        return Edad;
        //RETORNA EL VALOR DEL USUARIO [DAR]
    }
    //SEGUNDOS METODOS ACCESORES [SETTERS y GETTERS]
    public String getNombre() {
        return Nombre;
        //PIDE EL DATO AL USUARIO [OBTENER]
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
        //RETORNA EL VALOR DEL USUARIO [DAR]
    }
    
}
/*
    SE ENCARGA DE ESCONDER LOS ATRIBUTOS DE UNA CLASE PARA QUE SOLO PUEDAN USADOS
    PARA LA MISMA CLASE Y ASÍ EVITARNOS ERRORES EN PROGRAMAS MÁS EXTENSOS
    ADEMAS DE ESTO LOS GET Y SET DEBEN TENER EN MINUSCULA EL GET Y SET COMO EL
    GENERADO AUTOMATICAMENTE
*/