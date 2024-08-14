package Funcion_Principal;
public class Cuadrilatero {
    //ATRIBUTOS
    private float Lado_1 = 0;
    private float Lado_2 = 0;
    //METODOS
    public Cuadrilatero(float Lado_1, float Lado_2){
        this.Lado_1 = Lado_1;
        this.Lado_2 = Lado_2;
        //METODO CONSTRUCTOR PARA RECTANGULO
    }
    public Cuadrilatero(float Lado_1){
        this.Lado_1 = this.Lado_2 = Lado_1;
        //METODO CONSTRUCTOR PARA CUADRADO
    }
    public float getPerimetro(){
        float Perimetro = 2 * (Lado_1 + Lado_2);
        return Perimetro;
        //GETTER PARA PERIMETRO
    }
    public float getArea(){
        float Area = (Lado_1 * Lado_2);
        return Area;
        //GETTER PARA AREA
    }
}