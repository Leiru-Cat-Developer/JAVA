package Funcion_Principal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
            LEER 2 SERIES DE 10 ENTEROS QUE ESTARAN ORDENADOS CRECIENTEMENTE. COPIAR (FUSIONAR) LAS 2 TABLAS,
            DE FORNA QUE SIGAN ORDENADOS.
        */
        Scanner Lector_De_Datos = new Scanner(System.in);
        /*DECLARACION DE LOS TRES ARREGLOS QUE USAREMOS A LO LARGO DEL PROGRAMA*/
        int Arreglo_Uno[] = new int[10];
        int Arreglo_Dos[] = new int[10];
        int Fusion_De_Arreglos[] = new int[20];
        boolean Si_Es_Creciente = false;
        /*PEDIMOS EL ARREGLO NÚMERO UNO Y VERIFICAMOS QUE LOS DATOS ESTÉN ORDENADOS CRECIENTEMENTE*/
        System.out.println("\t\t"+"LLENANDO EL ARREGLO NÚMERO UNO"+"\n");
        do{
            for(int i = 0; i < 10; i++){
                System.out.print("INGRESE EL NÚMERO "+(i+1)+" : ");   Arreglo_Uno[i] = Lector_De_Datos.nextInt();
            }
            /*VERIFICAMOS SI EL ARREGLO ESTÁ ORDENADO DE FORMA CRECIENTE*/
            for(int i = 0; i < 9; i++){
                if(Arreglo_Uno[i] < Arreglo_Uno[i+1]){
                    Si_Es_Creciente = true;
                }
                if(Arreglo_Uno[i] > Arreglo_Uno[i+1]){
                    Si_Es_Creciente = false;
                    break;
                }
            }
            if(Si_Es_Creciente == false){
                System.out.println("\n"+"EL ARREGLO NO ES CRECIENTE, POR FAVOR DIGITELO DE NUEVO ..."+"\n");
            }
        }while(Si_Es_Creciente == false);
        /*PEDIMOS EL ARREGLO NÚMERO DOS Y VERIFICAMOS QUE LOS DATOS ESTÉN ORDENADOS CRECIENTEMENTE*/
        System.out.println("\n\t\t"+"LLENANDO EL ARREGLO NÚMERO DOS"+"\n");
        do{
            for(int i = 0; i < 10; i++){
                System.out.print("INGRESE EL NÚMERO "+(i+1)+" : ");   Arreglo_Dos[i] = Lector_De_Datos.nextInt();
            }
            /*VERIFICAMOS SI EL ARREGLO ESTÁ ORDENADO DE FORMA CRECIENTE*/
            for(int i = 0; i < 9; i++){
                if(Arreglo_Dos[i] < Arreglo_Dos[i+1]){
                    Si_Es_Creciente = true;
                }
                if(Arreglo_Dos[i] > Arreglo_Dos[i+1]){
                    Si_Es_Creciente = false;
                    break;
                }
            }
            if(Si_Es_Creciente == false){
                System.out.println("\n"+"EL ARREGLO NO ES CRECIENTE, POR FAVOR DIGITELO DE NUEVO ..."+"\n");
            }
        }while(Si_Es_Creciente == false);
        /*DECLARAMOS LOS ITERADORES QUE USAREMOS PARA CADA UNO DE LOS ARREGLOS*/
        int i = 0;      //ITERADOR PARA EL ARREGLO 1
        int j = 0;      //ITERADOR PARA EL ARREGLO 2
        int k = 0;      //ITERADOR PARA EL ARREGLO QUE FUSIONA LOS DOS ANTERIORES
        /*DEBEMOS VERIFICAR QUE ELEMENTO DE LOS DOS ELEMENTOS DE LOS ARREGLOS VA PRIMERO*/
        while(i < 10 && j < 10){
            if(Arreglo_Uno[i] < Arreglo_Dos[j]){
                Fusion_De_Arreglos[k] = Arreglo_Uno[i]; //COPIAMOS EL ELEMENTO DEL ARREGLO 1
                i++; //AUMENTAMOS UNA POCISION EN EL ARREGLO 1
            }else{
                Fusion_De_Arreglos[k] = Arreglo_Dos[j]; //COPIAMOS EL ELEMENTO DEL ARREGLO 2
                j++; //AUMENTAMOS UNA POCISION EN EL ARREGLO 2
            }
            k++;
        }
        /*CUANDO SALIMOS DEL BUCLE, SIGNIFICA QUE UNO DE LOS DOS ARREGLOS SE HA COPIADO CORRECTAMENTE*/
        /*AHORA DEBEMOS TERMINAR DE COPIAR EL SIGUIENTE ARREGLO QUE AUN NO SE HA LLENADO*/
        if(i == 10){
            /*AQUÍ FALTA LLENAR EL ARREGLO 2*/
            while(j < 10){
                Fusion_De_Arreglos[k] = Arreglo_Dos[j]; //COPIAMOS EL ELEMENTO DEL ARREGLO 2 EN LA FUSION DE ARREGLOS
                j++;
                k++;
            }
        }else{
            /*AQUÍ FALTA LLENAR EL ARREGLO 1*/
            while(i < 10){
                Fusion_De_Arreglos[k] = Arreglo_Uno[i]; //COPIAMOS EL ELEMENTO DEL ARREGLO 1 EN LA FUSION DE ARREGLOS
                i++;
                k++;
            }
        }
        /*MOSTRAMOS EL ARREGLO*/
        System.out.println("\t\t"+"ARREGLO FUSIONADO"+"\n");
        for(k = 0; k < 20; k++){
            System.out.print(Fusion_De_Arreglos[k]);
            if(k != 19){ //CONDICIONAL ESTETICO PARA QUE NO MUESTRE UN SIGNO DE ORDENAMIENTO EXTRA
                System.out.print(" - ");
            }
        }
        System.out.println("");
    }    
}