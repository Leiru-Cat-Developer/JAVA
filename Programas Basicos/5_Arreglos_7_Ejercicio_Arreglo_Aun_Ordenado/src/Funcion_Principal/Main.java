package Funcion_Principal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
            HACER UN PROGRAMA QUE RECIBA 5 NÚMEROS ORDENADOS DE MANERA CRECIENTE EN EL ARREGLO, DEPUES
            PEDIRLE AL USUARIO UN NÚMERO PARA INSERTARLO Y COLOCARLO EN UN LUGAR EN EL QUE NO AFECTE EL
            ORDEN CRECIENTE DEL ARREGLO
        */
        Scanner Lector_De_Datos = new Scanner(System.in);
        int Arreglo[] = new int[10];
        int Número = 0, Nuevo_Sitio = 0, j = 0;
        boolean Si_Es_Creciente = true;
        System.out.println("\t\t"+"LLENANDO EL ARREGLO"+"\n");
        do{
            for(int i = 0; i < 5; i++){
                System.out.print("DIGITE EL NÚMERO "+(i+1)+" : ");    Arreglo[i] = Lector_De_Datos.nextInt();
            }
            /*DESPUES DEBEMOS COMPROBAR SI EL ARREGLO ESTÁ ORDENADO DE FORMA CRECIENTE*/
            for(int i = 0; i < 4; i++){
                if(Arreglo[i] < Arreglo[i+1]){/*    1 2 3 4 5     */
                    Si_Es_Creciente = true;
                }
                if(Arreglo[i] > Arreglo[i+1]){/*    5 4 3 2 1     */
                    Si_Es_Creciente = false;
                    break;
                }
            }
            if(Si_Es_Creciente == false){
                System.out.println("\n"+"EL ARREGLO NO ESTÁ BIEN DIGITADO, POR FAVOR HAGALO DE NUEVO ..."+"\n");
            }
        }while(Si_Es_Creciente == false);
        System.out.print("\n"+"DIGITE UN ELEMENTO A INSERTAR: ");   Número = Lector_De_Datos.nextInt();
        while((Arreglo[j] < Número) && (j < 5)){
            Nuevo_Sitio++;
            j++;
            /*HACEMOS ESTO PARA ASEGURAR LAS POCISIONES DEL ARREGLO*/
        }
        /*POR ULTIMO VAMOS A RECORRER LOS ELEMENTOS*/
        for(int i = 4; i >= Nuevo_Sitio; i--){
            Arreglo[i+1] = Arreglo[i];
        }
        Arreglo[Nuevo_Sitio] = Número;
        System.out.println("\n\t\t"+"EL NÚEVO ARREGLO ES:"+"\n");
        for(int i = 0; i < 6; i++){
            System.out.print(Arreglo[i]+"  ");
        }
        System.out.println("");
    }    
}