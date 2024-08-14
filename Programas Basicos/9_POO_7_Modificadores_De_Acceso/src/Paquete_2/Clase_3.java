package Paquete_2;
//ASÍ ES COMO SE MANDA A LLAMAR UNA CLASE PARA PODER ACCESAR A LOS DATOS DE ESA CLASE
import Paquete_1.Clase_1; 
public class Clase_3 {
    public static void main(String [] args){
        //CREACION DE UN OBJETO DE LA CLASE 1
        Clase_1 C1 = new Clase_1();
        C1.Atributo_1 = 20;
        /*
            CUANDO CREAMOS UN OBJETO SIN MODIFICADOR DE ACCESO ENTONCES NO TENEMOS ACCESO A EL DESDE
            OTRA CLASE QUE ES AJENA AL PAQUETE DE LAS OTRAS CLASES
        */
    }
}