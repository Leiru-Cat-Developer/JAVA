package Funcion_Principal;
public class Triangulo extends Poligono{
    //ATRIBUTOS
    private double lado1;
    private double lado2;
    private double lado3;
    //METODOS
    public Triangulo(double lado1, double lado2, double lado3) {
        //CONSTRUCTOR
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    public double getLado1() {
        //GETTER PARA LADO 1
        return lado1;
    }
    public double getLado2() {
        //GETTER PARA LADO 2
        return lado2;
    }
    public double getLado3() {
        //GETTER PARA LADO 3
        return lado3;
    }
    @Override
    public String toString() {
        //'TO STRING' ES UN METODO QUE MUESTRA LOS DATOS DE TODA LA CLASE, SE PUEDE GENERAR AUTOMATICAMENTE
        return "TRIANGULO"+"\n\n"+super.toString()+"\n"+"VALOR LADO 1: "+lado1
                +"\n"+"VALOR LADO 2: "+lado2+"\n"+"VALOR LADO 3: "+lado3;
    }
    @Override
    public double area(){
        double p = (lado1+lado2+lado3)/2;
        return Math.sqrt((p*(p-lado1)*(p-lado2)*(p-lado3)));
        //METODO PARA OBTENER LA AREÁ Y ELIMINAR LA ABSTRACCION DE LA CLASE POLIGONO
    }
}