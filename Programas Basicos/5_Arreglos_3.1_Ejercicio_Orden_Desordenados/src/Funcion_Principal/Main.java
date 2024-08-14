package Funcion_Principal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
            LEER 10 NÚMEROS ENTEROS Y MOSTRARLOS EN EL SIGUIENTE ORDEN:
        
            PRIMERO - ULTIMO - SEGUNDO - PENULTIMO - TERCERO - ANTEPENULTIMO
        */
        Scanner Lector_De_Datos = new Scanner(System.in);
        int Numeros_Digitados[] = new int[10];
        int Primeros = 9, Ultimos = 0;
        System.out.println("\t\t"+"GUARDANDO LOS DATOS EN EL VECTOR"+"\n");
        for(int i = 0; i < 10; i++){
            System.out.print("DIGITE EL NÚMERO "+(i+1)+" : ");    Numeros_Digitados[i] = Lector_De_Datos.nextInt();
        }
        for(int i = 0; i < 5; i++){
            System.out.print(Numeros_Digitados[Ultimos]+" , ");
            System.out.println(Numeros_Digitados[Primeros]);
            Primeros -= 1;
            Ultimos += 1;
        }
    }    
}