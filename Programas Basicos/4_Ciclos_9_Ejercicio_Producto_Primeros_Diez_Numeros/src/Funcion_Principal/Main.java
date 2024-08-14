package Funcion_Principal;
public class Main {
    public static void main(String[] args) {
        /*
            HACER UN PROGRAMA QUE MULTIPLIQUE LOS PRIMEDOS 10 NÚMEROS IMPARES
        */
        long Resultado = 1;/*SE IGUALA A 1, PUES AL MULTIPLICAR EL PRIMER NÚMERO SE DEBE ALMACENAR != DE CERO*/
        for(int Iterador = 1; Iterador<=20; Iterador+=2){
            
            Resultado *= Iterador;
            
        }
        System.out.println("EL PRODUCTO DE LOS PRIMEROS 10 NÚMEROS ES: "+Resultado);
    }    
}