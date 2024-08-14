package Funcion_Principal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
            HACER UN PROGRAMA QUE LEEA DIEZ NÚMEROS, DESPUES DESPLAZARLO N VECES DIGITADOS
            POR EL USUARIO
        */
        Scanner Lector_De_Datos = new Scanner(System.in);
        int Vector[] = new int[10];
        int Repeticiones = 0, Ultimo_Elemento = 0;
        System.out.println("\t\t"+"DIGITE LOS ELEMENTOS DEL ARREGLO"+"\n");
        for(int i = 0; i < 10; i++){
            System.out.print("DIGITE EL NÚMERO "+(i+1)+" : ");    Vector[i] = Lector_De_Datos.nextInt();
        }
        System.out.print("\n"+"DIGITE CUANTAS VECES DESEA RECORRER EL ARREGLO: "); Repeticiones = Lector_De_Datos.nextInt();
        /*REPETIMOS UN CICLO PARA REALIZAR EL MOVIMIENTO DE LOS ELEMENTOS LAS 'N' VECES*/
        for(int i = 0; i < Repeticiones; i++){
            Ultimo_Elemento = Vector[9];
            for(int j = 8; j >= 0; j--){
                Vector[j+1] = Vector[j];
            }
            Vector[0] = Ultimo_Elemento;
        }
        /*POR ULTIMO MOSTRAMOS LOS ELEMENTOS EN PANTALLA*/
        System.out.println("\n\t\t"+"NÚMEROS RECORRIDOS "+Repeticiones+" VECES"+"\n");
        for(int i = 0; i < 10; i++){
            System.out.println("POCISION "+(i+1)+" : "+Vector[i]);
        }
    }    
}