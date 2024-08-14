package Funcion_Principal;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            ORDENAMIENTO MUY USADO POR LOS HUMANOS, POR EJEMPLO AL ORDENAR UN MAZO DE CARTAS
        */
        Scanner Lector_De_Datos = new Scanner(System.in);
        int Arreglo[];
        int Número_De_Elementos = 0;
        int Pocision = 0, Auxiliar = 0;
        Número_De_Elementos = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NÚMERO DE ELEMENTOS"));
        Arreglo = new int[Número_De_Elementos];
        System.out.println("\t\t"+"LLENANDO EL ARREGLO"+"\n");
        for(int i = 0; i < Número_De_Elementos; i++){
            System.out.print("DIGITE EL NÚMERO "+(i+1)+" : ");    Arreglo[i] = Lector_De_Datos.nextInt();
        }
        /*METODO DE ORDENAMIENTO POR INSERCION*/
        for(int i = 0; i < Número_De_Elementos; i++){
            Pocision = i;
            Auxiliar = Arreglo[i];
            while((Pocision>0)&&(Arreglo[Pocision-1] > Auxiliar)){
                Arreglo[Pocision] = Arreglo[Pocision-1];
                Pocision--;
            }
            Arreglo[Pocision] = Auxiliar;
        }
        /*IMPRESION DE FORMA ASCENDENTE*/
        System.out.println("\n\t\t"+"ARREGLO DE FORMA CRECIENTE"+"\n");
        for(int i = 0; i < Número_De_Elementos; i++){
            System.out.print(Arreglo[i]+"   ");
        }
        /*IMPRESION DE FORMA DESCENDENTE*/
        System.out.println("\n\n\t\t"+"ARREGLO DE FORMA DECRECIENTE"+"\n");
        for(int i = (Número_De_Elementos-1); i >= 0; i--){
            System.out.print(Arreglo[i]+"   ");
        }
        System.out.println("");
    }    
}