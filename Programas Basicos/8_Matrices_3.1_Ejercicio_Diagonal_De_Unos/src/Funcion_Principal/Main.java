package Funcion_Principal;
public class Main {
    public static void main(String[] args) {
        /*
            CREAR UNA MATRIZ DE TAMAÑO 7 * 7, RELLENARLA DE FORMA QUE LOS ELEMENTOS DE LA DIAGONAL SEAN 1
            Y EL RESTO SEAN 0
        */
        int Matriz[][] = new int[7][7];
        /*RELLENAMOS LA MATRIZ*/
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 7; j++){
                /*CONDICIONAL DE OPERADOR TERNARIO*/
                Matriz[i][j] = (i == j) ? 1 : 0;
            }
        }
        /*MOSTRAMOS DATOS EN PANTALLA*/
        System.out.println("\t\t"+"DIAGONAL DE MATRIZ"+"'\n");
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 7; j++){
                System.out.print(Matriz[i][j]+"   ");
            }
            System.out.println("\n");
        }
    }    
}