package Funcion_Principal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
            INICIALIZAR UN ARREGLO CON 10 ELEMENTOS, DESPUES SE DEBEN PEDIR 8 NÚMEROS,
            POR ULTIMO SE DEBEN PEDIR 1 NÚMERO Y UNA POCISION Y SE DEBE INSERTAR EL NÚMERO
            EN LA POCISION DESPLAZANDO LOS DEMÁS
        */
        Scanner Lector_De_Datos = new Scanner(System.in);
        int Primero_Arreglo[], Numero_Aleatorio = 0, Pocision_Numero_Aleatorio = 0;
        Primero_Arreglo = new int[10];
        for(int i = 0; i < 8; i++){
            System.out.print("DIGITE EL NÚMERO "+(i+1)+" : ");    Primero_Arreglo[i] = Lector_De_Datos.nextInt();
        }
        System.out.print("\n"+"DIGITA UN NÚMERO ALEATORIO : ");             Numero_Aleatorio = Lector_De_Datos.nextInt();
        System.out.print("DIGITA LA POCISION DEL NÚMERO ALEATORIO: "); Pocision_Numero_Aleatorio = Lector_De_Datos.nextInt();
        for(int i = 8; i >= Pocision_Numero_Aleatorio; i--){
            Primero_Arreglo[i+1] = Primero_Arreglo[i];
        }
        System.out.println("");
        Primero_Arreglo[Pocision_Numero_Aleatorio] = Numero_Aleatorio;
        for(int i:Primero_Arreglo){
            System.out.print(i+" ");
        }
        System.out.println("");
    }    
}