package Funcion_Principal;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            CREAR Y CARGAR UNA MATRIZ DE N * M, MOSTRAR LA SUMA DE CADA FILA Y CADA COLUMNA
        */
        Scanner Lector_De_Datos = new Scanner(System.in);
        int Filas = 0, Columnas = 0, Suma_Filas = 0, Suma_Columnas = 0;
        while(Filas <= 0){
            Filas = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NÚMERO DE FILAS"));
            if(Filas <= 0){
                JOptionPane.showMessageDialog(null,"...ERROR, DIGITE DE NUEVO EL NÚMERO DE FILAS...");
            }
        }
        while(Columnas <= 0){
            Columnas = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NÚMERO DE COLUMNAS"));
            if(Columnas <= 0){
                JOptionPane.showMessageDialog(null,"...ERROR, DIGITE DE NUEVO EL NÚMERO DE COLUMNAS...");
            }
        }
        /*DECLARAMOS Y RELLENAMOS LA MATRIZ*/
        int Matriz[][] = new int[Filas][Columnas];
        System.out.println("\t\t"+"RELLENANDO LA MATRIZ"+"\n");
        for(int i = 0; i < Filas; i++){
            for(int j = 0; j < Columnas; j++){
                System.out.print("DIGITE EL VALOR DE LA POCISION ["+i+"] ["+j+"] : ");  Matriz[i][j] = Lector_De_Datos.nextInt();
            }
        }
        System.out.println("\n\t\t"+"MATRIZ DIGITADA"+"\n");
        for(int i = 0; i < Filas; i++){
            for(int j = 0; j < Columnas; j++){
                System.out.print(Matriz[i][j]+"   ");
            }
            System.out.println("\n");
        }
        /*PRIMERO SUMAMOS LAS FILAS*/
        for(int i = 0; i < Filas; i++){
            Suma_Filas = 0;
            for(int j = 0; j < Columnas; j++){
                Suma_Filas += Matriz[i][j];
            }
            System.out.println("LA SUMA DE LA FILA ["+i+"] ES: "+Suma_Filas);
        }
        System.out.println("");
        /*POR ULTIMO SUMAMOS LAS COLUMNAS*/
        for(int j = 0; j < Columnas; j++){
            Suma_Columnas = 0;
            for(int i = 0; i < Filas; i++){
                Suma_Columnas += Matriz[i][j];
            }
            System.out.println("LA SUMA DE LA COLUMNA ["+j+"] ES: "+Suma_Columnas);
        }
    }    
}