package Funcion_Principal;
public class Main {
    public static void main(String [] args){
        PERSONA P1 = new PERSONA("URIEL",20);
        P1.Correr();
        
        PERSONA P2 = new PERSONA("5555555555");
        P2.Correr(100);
        /*
            JAVA LOS RECONOCE POR LOS PARAMETROS QUE ESTÁ PIDIENDO CADA OBJETO, Y ASÍ 
            PODEMOS HACER QUE LOS OBJETOS HAGAN DISTINTAS COSAS Y QUE FUNCIONEN CON DIFERENCIA
            DE PARAMETROS
        */
    }
}