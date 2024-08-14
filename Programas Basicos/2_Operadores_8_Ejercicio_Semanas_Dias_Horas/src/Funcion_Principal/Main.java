package Funcion_Principal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
            HACER UN PROGRAMA QUE DADO UN NUMERO TOTAL DE HORAS, DEVUELVA LA CANTIDAD
            DE SEMANAS, DIAS, HORAS SOBRANTES
        */
        Scanner Lector_Datos = new Scanner(System.in);
        int Numeros_De_Horas = 0, Horas_Totales = 0, Dias_Totales = 0, Semanas_Totales = 0;/*DECLARAMOS LAS VARIABLES*/
        System.out.print("DIGITE EL NÚMERO DE HORAS: ");    Numeros_De_Horas = Lector_Datos.nextInt();/*PERDIMOS EL DATO*/
        /*REALIZAMOS LAS OPERACIONES CORRESPONDIENTES*/
        Semanas_Totales = Numeros_De_Horas / 168;/*         TOTAL DE HORAS / HORAS QUE TIENE UNA SEMANA         */
        Dias_Totales = (Numeros_De_Horas % 168) / 24;/*     RESIDUO DE SEMANAS / HORAS QUE TIEN1 UN DÍA         */
        Horas_Totales = Numeros_De_Horas % 24;/*            TOTAL DE HORAS / HORAS QUE TIENE UN DÍA             */
        /*MOSTRAMOS LOS EQUIVALENTES EN PANTALLA*/
        System.out.println("TOTAL DE SEMANAS: "+Semanas_Totales);
        System.out.println("TOTAL DE DÍAS: "+Dias_Totales);
        System.out.println("TOTAL DE HORAS: "+Horas_Totales);
    }    
}