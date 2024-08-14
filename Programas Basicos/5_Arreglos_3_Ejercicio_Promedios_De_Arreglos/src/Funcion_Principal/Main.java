package Funcion_Principal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
            DIGITAR 5 NÚMEROS POR ARREGLOS Y SACAR SU PROMEDIO DE LOS POSITIVOS Y NEGATIVOS, Y CONTAR
            CUANTOS NÚMEROS SON CEROS
        */
        Scanner Lector_De_Datos = new Scanner(System.in);
        float Numeros_Digitados[] = new float[5];
        float Sumatoria_De_Numeros_Positivos = 0, Sumatoria_De_Numeros_Negativos = 0, Media_Positivos = 0, Media_Negativos = 0;
        int Contador_De_Numeros_Positivos = 0, Contador_De_Numeros_Negativos = 0, Contador_De_Ceros = 0;
        System.out.println("\t\t"+"GUARDANDO LOS NÚMEROS EN EL ARREGLO"+"\n");
        for(int i = 0; i < 5; i++){
            System.out.print("DIGITE EL NÚMERO "+(i+1)+" : ");  Numeros_Digitados[i] = Lector_De_Datos.nextFloat();
            if(Numeros_Digitados[i] == 0){
                Contador_De_Ceros++;
            }else if(Numeros_Digitados[i] > 0){
                Sumatoria_De_Numeros_Positivos += Numeros_Digitados[i];
                Contador_De_Numeros_Positivos++;
            }else{
                Sumatoria_De_Numeros_Negativos += Numeros_Digitados[i];
                Contador_De_Numeros_Negativos++;
            }
        }
        if(Contador_De_Numeros_Positivos == 0){
            System.out.print("\n\n"+"NO SE PUEDE SACAR LA MEDIA DE LOS NÚMEROS POSITIVOS ...");
        }else{
            Media_Positivos = Sumatoria_De_Numeros_Positivos / Contador_De_Numeros_Positivos;
            System.out.println("\n"+"MEDIA DE NÚMEROS POSITIVOS: "+Media_Positivos);
        }
        if(Contador_De_Numeros_Negativos == 0){
            System.out.println("NO SE PUDE SACAR LA MEDIA DE LOS NÚMEROS NEGATIVOS ...");
        }else{
            Media_Negativos = Sumatoria_De_Numeros_Negativos / Contador_De_Numeros_Negativos; 
            System.out.println("MEDIA DE NÚMEROS NEGATIVOS: "+Media_Negativos);
        }
        System.out.println("LA CANTIDAD DE CEROS DIGITADOS SON: "+Contador_De_Ceros);
    }   
}