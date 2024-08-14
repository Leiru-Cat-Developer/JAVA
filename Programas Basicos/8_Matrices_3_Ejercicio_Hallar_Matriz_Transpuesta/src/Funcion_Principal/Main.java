package Funcion_Principal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
            CREAR Y CARGAR UNA MATRIZ DE TAMAÑO 3 * 3, TRANSPONERLA Y MOSTRARLA
        */
        Scanner Lector_De_Datos = new Scanner(System.in);
        int Matriz[][] = new int[3][3];
        System.out.println("\t\t"+"LLENANDO LOS DATOS DE LA MATRIZ"+"\n");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("DIGITE EL NÚMERO DE LA POCISION ["+i+"] ["+j+"] : "); Matriz[i][j] = Lector_De_Datos.nextInt();
            }
        }
        System.out.println("\n\t\t"+"MATRIZ ORIGINAL"+"\n");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(Matriz[i][j]+"   ");
            }
            System.out.println("\n");
        }
        /*CICLO DE MATRIZ TRANSPUESTA*/
        int Auxiliar = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < i; j++){
                Auxiliar = Matriz[i][j];
                Matriz[i][j] = Matriz[j][i];
                Matriz[j][i] = Auxiliar;
            }
        }
        System.out.println("\t\t"+"MATRIZ TRANSPUESTA"+"\n");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(Matriz[i][j]+"   ");
            }
            System.out.println("\n");
        }
    }    
}