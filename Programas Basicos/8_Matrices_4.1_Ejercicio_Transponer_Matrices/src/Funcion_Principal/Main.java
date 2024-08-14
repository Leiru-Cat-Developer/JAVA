package Funcion_Principal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
            UTILIZANDO DOS MATRICES DE TAMAÑO 5 * 9 Y 9 * 5, CARGAR LA PRIMERA Y TRANSPONERLA EN LA SEGUNDA
        */
        Scanner Lector_De_Datos = new Scanner(System.in);
        int Matriz[][] = new int[5][9], Matriz_Transpuesta[][] = new int[9][5];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 9; j++){
                Matriz[i][j] = (int)(Math.random()*100);
                /*SI LO QUEREMOS TAMBIEN PODEMOS LLENARLA DE FORMA MANUAL O PIDIENDOSELA AL USUARIO*/
            }
        }
        /*TRANSPONEMOS LA MATRIZ ORIGINAL*/
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 5; j++){
                Matriz_Transpuesta[i][j] = Matriz[j][i];
            }
        }
        /*IMPRIMIMOS LOS DATOS EN PANTALA*/
        System.out.println("\t\t"+"MATRIZ ORIGINAL ALEATORIA"+"\n");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 9; j++){
                System.out.print(Matriz[i][j]+"   ");
            }
            System.out.println("\n");
        }
        System.out.println("\t\t"+"MATRIZ GUARDADA TRANSPUESTA"+"\n");
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(Matriz_Transpuesta[i][j]+"   ");
            }
            System.out.println("\n");
        }
    }    
}