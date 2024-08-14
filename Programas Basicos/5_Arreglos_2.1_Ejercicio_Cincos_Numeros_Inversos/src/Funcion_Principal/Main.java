package Funcion_Principal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
            HACER UN ARREGLO QUE GUARDE 5 NÚMEROS Y LOS MUESTRE EN EL ORDEN INVERSO
        */
        Scanner Lectura_Datos = new Scanner(System.in);
        float Numeros[] = new float[5];/*DECLARAMOS NUESTRO VECTOR*/
        System.out.println("\t"+"INGRESO DE NÚMEROS"+"\n");
        for(int i = 0; i < 5; i++){
            
            System.out.print("INGRESE EL NÚMERO "+(i+1)+" : ");   Numeros[i] = Lectura_Datos.nextFloat();
            
        }
        /*IMPRIMIMOS LOS NÚMEROS EN ORDEN INVERSO*/
        System.out.print("\n");
        for(int i = 4; i >= 0; i--){
            
            System.out.println("NÚMERO "+(i+1)+" : "+Numeros[i]);
            
        }
    }    
}