package Funcion_Principal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
            PEDIR DOS ARREGLOS Y DESPUES MEZCLARLOS EN UN TERCER ARREGLO DE LA SIGUIENTE MANERA:
        
            1 A - 1 B - 2 A - 2 B - ASÍ SUCESIVAMENTE
        */
        Scanner Lector_De_Datos = new Scanner(System.in);
        int Primero_Arreglo[], Segundo_Arreglo[], Tercer_Arreglo[];
        Primero_Arreglo = new int[10];
        Segundo_Arreglo = new int[10];
        Tercer_Arreglo = new int[20];/*NECESITA UN MAYOR ESPACIO PARA PODER ALMACENAR LOS DOS ARREGLOS*/
        System.out.println("\t\t"+"DIGITE EL PRIMER ARREGLO"+"\n");
        for(int i = 0; i < 10; i++){
            System.out.print("DIGITE EL NÚMERO "+(i+1)+" : ");    Primero_Arreglo[i] = Lector_De_Datos.nextInt();
        }
        System.out.println("\n\t\t"+"DIGITE EL SEGUNDO ARREGLO"+"\n");
        for(int i = 0; i < 10; i++){
            System.out.print("DIGITE EL NÚMERO "+(i+1)+" : ");    Segundo_Arreglo[i] = Lector_De_Datos.nextInt();
        }
        /*COMENZAMOS A COMBINAR LOS DOS ARREGLOS*/
        int j = 0;
        for(int i = 0; i < 10; i++){/*ITERADOR I PARA EL TERCER ARREGLO*/
                Tercer_Arreglo[j] = Primero_Arreglo[i];
                j++;
                Tercer_Arreglo[j] = Segundo_Arreglo[i];
                j++;
        }
        /*MOSTRAMOS EL ARREGLO EN PANTALLA*/
        System.out.println("\n\t\t"+"MOSTRAMOS LOS ELEMENTOS DEL TERCER ARREGLO"+"\n");
        for(int i = 0; i < 20; i++){
            System.out.print(Tercer_Arreglo[i]+" ");
        }
        System.out.println("");/*SOLO PARA QUE NO SE JUNTE EL PROGRAMA*/
    }    
}