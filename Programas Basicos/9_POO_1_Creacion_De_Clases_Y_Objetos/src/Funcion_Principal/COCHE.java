package Funcion_Principal;
public class COCHE {
    //INICIALIZACIÓN DE ATRIBUTOS
    String Color = "";
    String Marca = "";
    int Kilometraje = 0;
    //INICIALIZACIÓN DEL METODO
    public static void main(String [] args){
        //CREACIÓN DEL OBJETO, CONTIENE LOS ATRIBUTOS VACIOS
        COCHE Coche_1 = new COCHE();
        //LLENAMOS LOS ATRIBUTOS DEL OBJETO NÚMERO 1
        Coche_1.Color = "BLANCO";
        Coche_1.Marca = "AUDI";
        Coche_1.Kilometraje = 0;
        //IMPRIMIMOS LOS DATOS EN PANTALLA
        System.out.println("EL COLOR DEL COCHE ES: "+Coche_1.Color);
        System.out.println("LA MARCA DEL COCHE ES: "+Coche_1.Marca);
        System.out.println("EL KILOMETRAJE ES: "+Coche_1.Kilometraje);
        //CREAMOS OTRO OBJETO CON EL MISMO METODO DE ARRIBA
        COCHE Coche_2 = new COCHE();
        Coche_2.Color = "NEGRO";
        Coche_2.Marca = "TOYOTA";
        Coche_2.Kilometraje = 80;
        System.out.println("\n"+"EL COLOR DEL COCHE ES: "+Coche_2.Color);
        System.out.println("LA MARCA DEL COCHE ES: "+Coche_2.Marca);
        System.out.println("EL KILOMETRAJE ES: "+Coche_2.Kilometraje);
    }
}