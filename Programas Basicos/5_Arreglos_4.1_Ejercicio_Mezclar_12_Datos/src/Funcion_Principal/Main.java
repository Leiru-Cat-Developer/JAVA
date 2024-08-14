package Funcion_Principal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
            PEDIR DOS ARREGLOS DE 12 ELEMENTOS Y MEZCLARLOS EN UN TERCER ARREGLO DE MANERA QUE SEAN
            TRES ELEMENTOS DEL PRIMER ARREGLO, TRES DEL SEGUNDO Y ASI SUCESIVAMENTE
        */
        Scanner Lector_De_Datos = new Scanner(System.in);
        int Primer_Arreglo[], Segundo_Arreglo[], Tercer_Arreglo[];
        Primer_Arreglo = new int[12];
        Segundo_Arreglo = new int[12];
        Tercer_Arreglo = new int[24];/*NECESITA UN MAYOR ESPACIO PARA ALMACENAR LOS DOS ARREGLOS*/
        System.out.println("\t\t"+"DIGITE EL PRIMER ARREGLO"+"\n");
        for(int i = 0; i < 12; i++){
            System.out.print("DIGITE EL NÚMERO "+(i+1)+" : ");  Primer_Arreglo[i] = Lector_De_Datos.nextInt();
        }
        System.out.println("\n\t\t"+"DIGITE EL SEGUNDO ARREGLO"+"\n");
        for(int i = 0; i < 12; i++){
            System.out.print("DIGITE EL NÚMERO "+(i+1)+" : ");  Segundo_Arreglo[i] = Lector_De_Datos.nextInt();
        }
        /*MEZCLAMOS LOS DOS ARREGLOS EN EL TERCER ARREGLO*/
        int j = 0, Contador_Primer_Arreglo = 0, Contador_Segundo_Arreglo = 0; 
        for(int i = 0; i < 4; i++){
            /*PRIMERO AÑADIMOS LOS PRIMEROS TRES*/
            for(int k = 0; k < 3; k++){
                Tercer_Arreglo[j] = Primer_Arreglo[Contador_Primer_Arreglo];
                Contador_Primer_Arreglo++;
                j++;
            }
            /*DESPUES AÑADIMOS LOS SIGUIENTES TRES*/
            for(int k = 0; k < 3; k++){
                Tercer_Arreglo[j] = Segundo_Arreglo[Contador_Segundo_Arreglo];
                Contador_Segundo_Arreglo++;
                j++;
            }
        }
        /*MOSTRAMOS LOS RESULTADOS EN PANTALLA*/
        System.out.println("\n\t\t"+"MOSTRAMOS LOS ELEMENTOS DEL TERCER ARREGLO"+"\n");
        for(int i = 0; i < 24; i++){
            System.out.print(Tercer_Arreglo[i]+" ");
        }
        System.out.println("");/*SOLO PARA QUE NO SE JUNTE EL PROGRAMA*/
    }    
}