package Funcion_Principal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
            LEER 10 ENTEROS ORDENADOS CRECIENTEMENTE. LEER N Y BUSCARLO EN LA TABLA.
            SE DEBE MOSTRAR LA POCISION EN QUE SE ENCUENTRA. SI NO ESTÁ, INDICARLO
            CON UN MENSAJE
        */
        Scanner Lector_De_Datos = new Scanner(System.in);
        int Arreglo[] = new int[10];
        int Número_A_Buscar = 0, Pocision_Del_Numero_A_Buscar = 0;
        boolean Si_Es_Creciente = true;
        boolean Se_Ha_Encontrado_El_Número = false;
        /*RELLENAMOS EL ARREGLO*/
        System.out.println("\t\t"+"LLENANDO EL ARREGLO"+"\n");
        do{
            for(int i = 0; i < 10; i++){
                System.out.print("DIGITE LA POCISION "+(i)+" : ");    Arreglo[i] = Lector_De_Datos.nextInt();
            }
            /*COMPROBAMOS SI EL ARREGLO ESTÁ ORDENADO CORRECTAMENTE*/
            for(int i = 0; i < 9; i++){
                if(Arreglo[i] < Arreglo[i+1]){
                    Si_Es_Creciente = true;
                }
                if(Arreglo[i] > Arreglo[i+1]){
                    Si_Es_Creciente = false;
                    break;
                }
            }
            if(Si_Es_Creciente == false){
                System.out.println("\n"+"EL ARREGLO NO ES CRECIENTE, DIGITELO DE NUEVO ..."+"\n");
            }
        }while(Si_Es_Creciente == false);
        System.out.print("\n"+"DIGITE EL NÚMERO QUE DESEA BUSCAR: ");   Número_A_Buscar = Lector_De_Datos.nextInt();
        /*BUSCAMOS EL ELEMENTO EN EL ARREGLO*/
        for(int i = 0; i < 10; i++){
            if(Arreglo[i] == Número_A_Buscar){
                Pocision_Del_Numero_A_Buscar = i;
                Se_Ha_Encontrado_El_Número = true;
                break;
            }
        }
        /*MOSTRAMOS LOS DOS POSIBLES RESULTADOS*/
        if(Se_Ha_Encontrado_El_Número == true){
            System.out.println("\n"+"EL NÚMERO SE ENCUENTRA EN LA POCISION "+Pocision_Del_Numero_A_Buscar);
        }else{
            System.out.println("\n"+"EL NÚMERO QUE INTENTA BUSCAR NO ESTÁ EN EL ARREGLO ...");
        }
        System.out.println("");
    }    
}