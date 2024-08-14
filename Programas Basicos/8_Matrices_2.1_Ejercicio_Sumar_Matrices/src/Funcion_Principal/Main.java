package Funcion_Principal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
            CREAR Y CARGAR DOS MATRICES DE TAMAÑO 3 * 3, SUMARLAS Y MOSTRAR SU SUMA
        */
        Scanner Lector_De_Datos = new Scanner(System.in);
        int Matriz_Uno[][] = new int[3][3], Matriz_Dos[][] = new int[3][3], Suma_De_Matrices[][] = new int[3][3];
        /*PEDIMOS LOS DATOS DE LA MATRIZ UNO*/
        System.out.println("\t\t"+"LLENANDO LA MATRIZ UNO"+"\n");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("DIGITE EL VALOR DE ["+i+"] ["+j+"] : ");    Matriz_Uno[i][j] = Lector_De_Datos.nextInt();
            }
        }
        /*PEDIMOS LOS DATOS DE LA MATRIZ DOS*/
        System.out.println("\n\t\t"+"LLENANDO LA MATRIZ DOS"+"\n");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("DIGITE EL VALOR DE ["+i+"] ["+j+"] : ");    Matriz_Dos[i][j] = Lector_De_Datos.nextInt();
            }
        }
        /*INICIA CICLO DE SUMA DE MATRICES*/
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                Suma_De_Matrices[i][j] = Matriz_Uno[i][j] + Matriz_Dos[i][j];
            }
        }
        /*TERMINA CICLO DE SUMA DE MATRICES Y EMPIEZA EL CICLO PARA MOSTRAR LOS RESULTADOS*/
        System.out.println("\n\t\t"+"SUMA DE MATRICES"+"\n");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(Suma_De_Matrices[i][j]+"   ");
            }
            System.out.println("\n");
        }
    }    
}