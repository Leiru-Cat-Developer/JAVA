package Funcion_Principal;
public class Rectangulo extends Poligono{
    //ATRIBUTOS
    private double lado1;
    private double lado2;
    //METODOS
    public Rectangulo(double lado1, double lado2) {
        //CONSTRUCTOR
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public double getLado1() {
        //GETTER PARA LADO 1
        return lado1;
    }
    public double getLado2() {
        //GETTER PARA LADO 2
        return lado2;
    }
    @Override
    public String toString() {
        //'TO STRING' ES UN METODO QUE MUESTRA LOS DATOS DE TODA LA CLASE, SE PUEDE GENERAR AUTOMATICAMENTE
        return "RECTANGULO"+"\n\n"+super.toString()+"\n"+"VALOR LADO 1: "+ lado1 +"\n"+"VALOR LADO 2: "+lado2;
    }
    @Override
    public double area(){
        return lado1*lado2;
        //METODO PARA OBTENER LA AREÁ Y ELIMINAR LA ABSTRACCION DE LA CLASE POLIGONO
    }
}