package Funcion_Principal;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            ORDENAMIENTO QUE REQUIERE DE O(N^2) OPERACIONES PARA ORDENAR UNA LISTA DE N NÚMEROS.
            
            1. BUSCA EL MINIMO ELEMENTO DE LA LISTA
            2. INTERCAMBIAR CON EL PRIMER ELEMENTO
            3. BUSCAR EL MINIMO DEL RESTO DE LA LISTA
            4. INTERCAMBIAR CON EL SEGUNDO
            5. Y ASÍ SUCESIVAMENTE
        */
        Scanner Lector_De_Datos = new Scanner(System.in);
        int Número_De_Elementos = 0;
        int Minimo = 0, Auxiliar = 0;
        Número_De_Elementos = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NÚMERO DE ELEMENTOS DEL ARREGLO"));
        int Arreglo[] = new int[Número_De_Elementos];
        System.out.println("\t\t"+"LLENANDO EL ARREGLO"+"\n");
        for(int i = 0; i < Número_De_Elementos; i++){
            System.out.print("DIGITE EL NÚMERO "+(i+1)+" : ");    Arreglo[i] = Lector_De_Datos.nextInt();
        }
        /*METODO DE ORDENAMIENTO POR SELECCION*/
        for(int i = 0; i < Número_De_Elementos; i++){
            Minimo = i;
            for(int j = (i+1); j < Número_De_Elementos; j++){
                if(Arreglo[j] < Arreglo[Minimo]){
                    Minimo = j;
                    
                }
            }
            Auxiliar = Arreglo[i];
            Arreglo[i] = Arreglo[Minimo];
            Arreglo[Minimo] = Auxiliar;
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