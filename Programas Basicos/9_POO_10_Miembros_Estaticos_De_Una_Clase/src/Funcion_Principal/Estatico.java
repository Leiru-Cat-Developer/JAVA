//MIEMBROS ESTATICOS DE UNA CLASE
package Funcion_Principal;
public class Estatico {
    //ATRIBUTOS
    private static String Frase = "PRIMERA FRASE";
    //METODOS
    public static int Sumar(int N1, int N2){
        int  Suma = N1 + N2;
        return Suma;
    }
    public static void main(String [] args){
        //OBJETOS
        Estatico OB1 = new Estatico();
        Estatico OB2 = new Estatico();
        OB2.Frase = "SEGUNDA FRASE";        //CAMBIO DE VALOR DE LA FRASE
        //CREANDO OBJETOS
        System.out.println(OB1.Frase);
        System.out.println(OB2.Frase);
        System.out.println(Estatico.Frase);
        System.out.println("La suma es: "+Sumar(5,10));
    }
    /*
        PARA VOLVER A UNA CLASE ESTATICA SE DEBE PONER LA PALABRA RESERVADA "static" EN TODOS LOS
        ATRIBUTOS QUE QUEREMOS QUE SEAN ESTATICOS, ESTO SIGNIFICA QUE YA NO SE PUEDEN CAMBIAR LOS
        VALORES EN LOS OBJETOS POR QUE AHORA SOLO LE PERTENECE A LA CLASE, ASÍ EL ULTIMO CAMBIO
        SERA EL MISMO PARA TODOS LOS OBJETOS
        ESTOS SON LLAMADOS --ATRIBUTOS ESTATICOS--, AHORA YA NO NECESITAMOS CREEAR OBJETOS PARA
        MOSTRAR ALGUNOS ATRIBUTOS QUE SON ESTATICOS
    
        LO MISMO CON LOS METODOS, CUANDO SON ESTATICOS, SE PUEDEN LLAMAR DIRECTAMENTE CON LA CLASE
        Y PASANDOLE LOS VALORES QUE SON NECESARIOS PARA ACOMPLETAR LA TAREA
    */
}