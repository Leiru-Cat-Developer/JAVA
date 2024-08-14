package Funcion_Principal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
            HACER UN PROGRAMA QUE LEA DIEZ NÚMEROS Y UNA POCISION ENTRE 0 - 9, DEPUES HACER QUE
            EL PROGRAMA ELIMINE ESE NÚMERO SIN DEJAR HUECOS
        */
        Scanner Lector_De_Datos = new Scanner(System.in);
        int Arreglo[] = new int[10];
        int Pocision = 0;
        System.out.println("\t\t"+"LLENANDO EL ARREGLO"+"\n");
        for(int i = 0; i < 10; i++){
            System.out.print("DIGITE EL NÚMERO "+(i+1)+" : ");    Arreglo[i] = Lector_De_Datos.nextInt();
        }
        do{
            System.out.print("\n"+"DIGITE LA POSICION A ELIMINAR: ");   Pocision = Lector_De_Datos.nextInt();
            if((Pocision < 0)||(Pocision > 9)){
                System.out.println("\n"+"LA POCISION NO EXISTE, INGRESELA DE NUEVO ...");
            }
        }while((Pocision < 0)||(Pocision > 9));
        for(int i = Pocision; i < 10; i++){
            if(i == 9){
                Arreglo[i] = 0;
            }else{
                Arreglo[i] = Arreglo[i+1];
            }
        }
        System.out.println("\n\t\t"+"EL NÚEVO ARREGLO ES:"+"\n");
        for(int i = 0; i < 9; i++){
            System.out.print(Arreglo[i]+"  ");
        }
        System.out.println("");
    }
}