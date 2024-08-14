package Funcion_Principal;
public abstract class Poligono {
    //ATRIBUTOS
    protected int numeroDeLados;
    //MÉTODOS
    public Poligono(int numeroDeLados) {
        //CONSTRUCTOR
        this.numeroDeLados = numeroDeLados;
    }
    public int getNumeroDeLados() {
        //GETTER PARA NÚMERO DE LADOS
        return numeroDeLados;
    }
    @Override
    public String toString() {
        //'TO STRING' ES UN METODO QUE MUESTRA LOS DATOS DE TODA LA CLASE, SE PUEDE GENERAR AUTOMATICAMENTE
        return "Número De Lados: "+numeroDeLados;
    }
    public abstract double area();  //EL METODO AREA ES ABSTRACTO Y POR LO TANTO TODA LA CLASE SE VUELVE ABSTRACTA
}   