package Funcion_Principal;
public class Objeto {
    //ATRIBUTOS
    private int x = 0;
    private int y = 0;
    //METODOS
    public Objeto(int x, int y) {
        this.x = x;
        this.y = y;
        //CONSTRUCTOR
    }
    public void Mover_Derecha(int Incremento){
        x += Incremento;
        //PLANO DE LAS ABSCISAS POSITIVAS [DERECHA]
    }
    public void Mover_Izquierda(int Incremento){
        x -= Incremento;
        //PLANO DE LAS ABSCISAS NEGATIVAS [IZQUIERDA]
    }
    public void Mover_Arriba(int Incremento){
        y += Incremento;
        //PLANO DE LAS ORDENADAS POSITIVAS [ARRIBA]
    }
    public void Mover_Abajo(int Incremento){
        y -= Incremento;
       //PLANO DE LAS ORDENADAS NEGATIVAS [ABAJO]
    }
    public int getX(){
        return x;
        //GETTER X
    }
    public int getY(){
        return y;
        //GETTER Y
    }
}