package Funcion_Principal;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            METODO DE ORDENAMIENTO LLAMADO METODO BURBUJA POR QUE TIENE LA MISMA FUNCION QUE LAS BURBUJAS
            EN UN VASO DE GASEOSA QUE SUBE EL GAS POR SER MÁS LIGERO, ASÍ QUE ESTE METODO ORDENA LOS DATOS
            DE FORMA QUE LOS DATOS MENORES O MAYORES DEPENDIENDO DEL USUARIO, LOS ORDENARA DE  ESA MANERA
        */
        Scanner Lectura_De_Datos = new Scanner(System.in);
        int Arreglo[];                  //ARREGLO DECLARADO DONDE GUARDAMOS LOS NÚMEROS DIGITADOS POR EL USUARIO
        int Número_De_Elementos = 0;    //NÚMERO QUE NOS DARA CUANTAS POCISIONES ES QUE GUARDAREMOS EN EL ARREGLO
        int Auxiliar = 0;               //VARIABLE QUE NOS PERMITE HACER EL CAMBIO DE VARIABLES
        Número_De_Elementos = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA LONGITUD DEL ARREGLO"));
        Arreglo = new int[Número_De_Elementos]; //ASIGNAMOS EL NÚMERO DE ELEMENTOS
        System.out.println("\t\t"+"LLENANDO ARREGLO"+"\n");
        for(int i = 0; i < Número_De_Elementos; i++){
            System.out.print("DIGITE EL NÚMERO "+(i+1)+" : ");    Arreglo[i] = Lectura_De_Datos.nextInt();
        }
        /*
            METODO BURBUJA
        
            EL NÚMERO DE ELEMENTOS ES RESTADO CON 1 POR QUE EL ULTIMO NÚMERO NO NECESITA SER VERIFICADO CON NADIE
        */
        for(int i = 0; i < (Número_De_Elementos - 1); i++){
            for(int j = 0; j < (Número_De_Elementos - 1); j++){
                if(Arreglo[j] > Arreglo[j+1]){/*NÚMERO ACTUAL > NÚMERO SIGUIENTE*/
                    Auxiliar = Arreglo[j];
                    Arreglo[j] = Arreglo[j+1];
                    Arreglo[j+1] = Auxiliar;
                }
            }
        }
        /*MOSTRANDO EL ARREGLO DE FORMA CRECIENTE*/
        System.out.println("\n\t\t"+"ARREGLO ORDENADO CRECIENTEMENTE"+"\n");
        for(int i = 0; i < Número_De_Elementos; i++){
            System.out.print(Arreglo[i]+"   ");
        }
        System.out.println("\n\n\t\t"+"ARREGLO ORDENADO DECRECIENTEMENTE"+"\n");
        for(int i = (Número_De_Elementos-1); i >= 0; i--){
            System.out.print(Arreglo[i]+"   ");
        }
        System.out.println("");
    }    
}