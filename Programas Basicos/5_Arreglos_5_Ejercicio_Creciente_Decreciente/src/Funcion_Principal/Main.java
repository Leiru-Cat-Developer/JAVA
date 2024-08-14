package Funcion_Principal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
            EL USUARIO DEBE DIGITAR UN ARREGLO TOTALMENTE ALEATORIO Y EL PROGRAMA DEBE DECIR SI:
            
            -> EL ARREGLO ES CRECIENTE
            -> EL ARREGLO ES DECRECIENTE
            -> EL ARREGLO ESTÁ DESORDENADO
            -> LOS ELEMENTOS DEL ARREGLO SON TODOS IGUALES
        */
        Scanner Lector_De_Datos = new Scanner(System.in);
        int Vector[] = new int[10];
        boolean Creciente = false, Decreciente = false;
        System.out.println("\t\t"+"DIGITE LOS ELEMENTOS DEL ARREGLO"+"\n");
        for(int i = 0; i < 10; i++){
            System.out.print("DIGITE EL NÚMERO "+(i+1)+" : ");    Vector[i] = Lector_De_Datos.nextInt();
        }
        /*COMENZAMOS A REVISAR LOS POSIBLES CASOS QUE PUEDEN SUCEDER EN EL ARREGLO*/
        for(int i = 0; i < 9; i++){
            if(Vector[i] < Vector[i+1]){/*CRECIENTE            ->          1 2 3 4 5 6 7 8 9 10*/
                Creciente = true;
            }
            if(Vector[i] > Vector[i+1]){/*DECRECIENTE          ->          10 9 8 7 6 5 4 3 2 1*/
                Decreciente = true;
            }
        }
        if((Creciente == true)&&(Decreciente == false)){
            System.out.println("\nLA SERIE ESTA EN FORMA CRECIENTE ...");
        }else if((Creciente == false)&&(Decreciente == true)){
            System.out.println("\nLA SERIE ESTA EN FORMA DECRECIENTE ...");
        }else if((Creciente == true)&&(Decreciente == true)){
            System.out.println("\nLA SERIE ESTA EN FORMA DESORDENADA ...");
        }else if((Creciente == false)&&(Decreciente == false)){
            System.out.println("\nTODOS LOS NÚMEROS SON IGUALES ...");
        }
    }
}