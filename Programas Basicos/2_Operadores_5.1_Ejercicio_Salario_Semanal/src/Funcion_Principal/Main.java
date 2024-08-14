package Funcion_Principal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
            HACER UN PROGRAMA QUE CALCULE E IMPRIMA EL SALARIO SEMANAL DE UN EMPLEADO A PARTIR
            DE SUS HORAS SEMANALES TRABAJADAS Y DE SU SALARIO POR HORA
        */
        Scanner Lectura_Datos = new Scanner(System.in);/*DECLARAMOS NUESTRO LECTOR DE DATOS*/
        /*DECLARAMOS NUESTRAS VARIABLES*/
        int Horas_Trabajadas = 0;
        float Salario_Por_Hora = 0;
        float Salario_Semanal = 0;
        /*PEDIMOS LOS DATOS NECESARIOS PARA RESOLVER EL PROBLEMA*/
        System.out.print("DIGITE LAS HORAS SEMANALES TRABAJADAS DEL EMPLEADO: ");   Horas_Trabajadas = Lectura_Datos.nextInt();
        System.out.print("DIGITE EL SALARIO POR HORA DEL EMPLEADO:  $");    Salario_Por_Hora = Lectura_Datos.nextFloat();
        /*HACEMOS EL CALCULO PARA OBTENER EL RESULTADO DEL PROBLEMA*/
        Salario_Semanal = Horas_Trabajadas * Salario_Por_Hora;
        System.out.println("EL SALARIO SEMANAL DEL EMPLEADO ES:  $"+Salario_Semanal);/*IMPRIMIMOS EL RESULTADO*/
    }    
}