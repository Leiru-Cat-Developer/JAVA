package Funcion_Principal;
public class Main {
    public static void main(String[] args) {
        /*
            EL CICLO WHILE SE REPITE DE A CUERDO A "MIENTRAS SE CUMPLA UNA OPCION"
            Y ESTA OPCION O CONDICION QUE SEA VERDADERA O FALSA DEPENDIENDO DE LO QUE 
            BUSQUES, SE GENERARARA UN CIERTO NÚMERO DE ACCIONES, HAY QUE RECORDAR
            QUE LA CONDICION SE DEBE CUMPLIR EN PRIMER LUGAR
        
            WHILE (CONDICION BOOLEANA){
            
                PROCESO
        
            }
        */
        int Iterador = 1;/*SE INICIALIZA EN 1 PARA QUE LA CONDICION SE CUMPLE*/
        /*HACEMOS EL BUCLE*/
        while (Iterador <= 5){
            
            /*ASCENDENTE*/
            System.out.println(Iterador);
            Iterador++;
            /*DEBEMOS DECLARAR EL ITERADOR PARA QUE AUMENTE EL VALOR Y EN ALGUN MOMENTO EL BUCLE TERMINE*/
            
        }
        /*
            COMUNMENTE EL ITERADOR SE ESCRIBE SOLO COMO "i" MINUSCULA
        
            ASIMISMO PODEMOS PEDIR DATOS EN LOS CICLOS CADA QUE SE REPITA, PARA ALMACENAR LO QUE QUERAMOS
            DE UNA MANERA DISTINTA PERO SIN TANTO CODIGO
        */
    }    
}