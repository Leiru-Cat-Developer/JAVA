package Funcion_Principal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
            HACER UN PROGRAMA QUE RECIBA DIEZ NÚMEROS DE ENTRADA, Y DESPUES HACER QUE SE
            RECORRAN UNA POCISION, EL PRIMERO PASA A SER EL SEGUNDO, EL SEGUNDO EL TERCERO
            Y ASÍ SUCESIVAMENTE, POR ULTIMO EL ULTIMO PASARA A SER EL PRIMERO
        */
        Scanner Lector_De_Datos = new Scanner(System.in);
        int Arreglo[] = new int[10];
        int Ultimo_Elemento = 0;
        System.out.println("\t\t"+"LLENAR EL ARREGLO"+"\n");
        for(int i = 0; i < 10; i++){
            System.out.print("DIGITE UN NÚMERO "+(i+1)+" : ");    Arreglo[i] = Lector_De_Datos.nextInt();
        }
        Ultimo_Elemento = Arreglo[9];/*GUARDAMOS EL ULTIMO ELEMENTO PARA DESPUES PASARLO AL INICIO*/
        for(int i = 8; i >= 0; i--){
            Arreglo[i+1] = Arreglo[i];
        }
        Arreglo[0] = Ultimo_Elemento;/*GUARDAMOS EL ULTIMO ELEMENTO COMO EL PRIMERO*/
        System.out.println("\n\t\t"+"EL NUEVO ARREGLO"+"\n");
        for(int i = 0; i < 10; i++){
            System.out.println("POCISION "+(i+1)+" : "+Arreglo[i]);
        }
    }    
}