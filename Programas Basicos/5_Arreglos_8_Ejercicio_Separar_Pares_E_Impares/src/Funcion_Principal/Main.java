package Funcion_Principal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
            LEER 10 ELEMENTOS EN UNA TABLA. GUARDAR EN OTRA TABLA LOS ELEMENTOS PARES DE LA PRIMERA,
            Y A CONTINUACION LOS ELEMENTOS IMPARES
        */
        Scanner Lector_De_Datos = new Scanner(System.in);
        int Arreglo[] = new int[10];
        int Conteo_Pares = 0, Conteo_Impares = 0;
        System.out.println("\t\t"+"LLENANDO EL ARREGLO"+"\n");
        for(int i = 0; i < 10; i++){
            System.out.print("DIGITE EL NÚMERO "+(i+1)+" : ");    Arreglo[i] = Lector_De_Datos.nextInt();
            if((Arreglo[i]%2) == 0){/*CONTANDO LOS NÚMEROS PARES*/
                Conteo_Pares++;
            }else{/*CONTANDO LOS NÚMEROS IMPARES*/
                Conteo_Impares++;
            }
        }
        int Arreglo_Par[] = new int[Conteo_Pares];
        int Arreglo_Impar[] = new int[Conteo_Impares];
        /*REUTILIZAMOS LOS CONTADORES CON ITERADORES*/
        Conteo_Pares = 0;
        Conteo_Impares = 0;
        for(int i = 0; i < 10; i++){
            if((Arreglo[i]%2) == 0){
                Arreglo_Par[Conteo_Pares] = Arreglo[i];
                Conteo_Pares++;
            }else{
                Arreglo_Impar[Conteo_Impares] = Arreglo[i];
                Conteo_Impares++;
            }
        }
        System.out.println("\n"+"ARREGLO DE LOS NÚMEROS PARES"+"\n");
        for(int i = 0; i < Conteo_Pares; i++){
            System.out.println("Número "+(i+1)+" : "+Arreglo_Par[i]);
        }
        System.out.println("\n"+"ARREGLO DE LOS NÚMEROS IMPARES"+"\n");
        for(int i = 0; i < Conteo_Impares; i++){
            System.out.println("Número "+(i+1)+" : "+Arreglo_Impar[i]);
        }
        System.out.println("");
    }    
}