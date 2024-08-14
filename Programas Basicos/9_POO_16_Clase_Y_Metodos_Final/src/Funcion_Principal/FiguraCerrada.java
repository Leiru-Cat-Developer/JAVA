package Funcion_Principal;
public class FiguraCerrada extends Figura{
    //ATRIBUTOS
    private int numeroDeLados;
    //METODOS
    public FiguraCerrada(int numeroDeLados, double tamaño) {
        //CONSTRUCTOR
        super(tamaño);
        this.numeroDeLados = numeroDeLados;
    }
    public void dibujarFigura(){
        System.out.println("DIBUJO DE UNA FIGURA CERRADA");
    }
    /*
        FINAL PARA CLASES:
    
        "final public class FiguraCerrada extends Figura"
    
        FINAL PARA METODOS
    
        "public final void dibujarFigura()"
    
        CLARAMENTE UNO SE AGREGA AL INICIO Y OTRO SE AGREGA DESPUÉS
    */
}