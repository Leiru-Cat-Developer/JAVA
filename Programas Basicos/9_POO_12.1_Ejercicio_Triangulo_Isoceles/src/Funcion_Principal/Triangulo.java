package Funcion_Principal;
public class Triangulo {
    //ATRIBUTOS
    private double Base;
    private double Lado;
    //METODOS
    public Triangulo(double Base, double Lado) {
        this.Base = Base;
        this.Lado = Lado;
    }
    public double Perimetro() {
        double Perimetro = (2*Lado)+Base;
        return Perimetro;
    }
    public double Area(){
        double Area = (Base * Math.sqrt(Math.pow(Lado,2) - (Math.pow(Base,2)/4)))/2;
        return Area;
    }
}