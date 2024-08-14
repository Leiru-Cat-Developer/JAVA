package Funcion_Principal;
public class Cuadrado extends FiguraCerrada{
    //ATRIBUTOS
    private double area;
    //METODOS
    public Cuadrado(double area, int numeroDeLados, double tamaño) {
        //CONSTRUCTOR
        super(numeroDeLados, tamaño);
        this.area = area;
    }
    public void dibujarFigura(){
        System.out.println("DIBUJAMOS UN CUADRADO");
    }
}