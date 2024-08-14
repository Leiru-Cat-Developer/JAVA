package Funcion_Principal;
public class Main {
    public static void main(String[] args) {
        /*
            CREAR UNA MATRIZ LLAMADA "MARCO" DE TAMAÑO 5*5, TODOS SUS ELEMENTOS DEBEN SER 0 SALVO
            POR LOS BORDES LOS CUALES DEBEN SER 1 Y MOSTRARLA EN PANTALLA.
        
            1 1 1 1 1
            1 0 0 0 1
            1 0 0 0 1
            1 0 0 0 1
            1 0 0 0 1
        */
        int Marco[][] = new int[5][5];
        /*RELLENAMOS LA MATRIZ CON LA CONDICION DESEADA*/
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if((i == 0)||(i == 4)){
                    Marco[i][j] = 1;
                    //DELIMITA LAS COLUMNAS
                }else if((j == 0)||(j == 4)){
                    Marco[i][j] = 1;
                    //DELIMITA LAS FILAS
                }else{
                    Marco[i][j] = 0;
                    //NO ES NECESARIO PUES EL PROGRAMA LOS COLOCA COMO ESPACIOS VACIOS ...
                }
            }
        }
        /*IMPRIMIMOS LA MATRIZ EN PANTALLA*/
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(Marco[i][j]+"   ");
            }
            System.out.print("\n");
        }
    }    
}