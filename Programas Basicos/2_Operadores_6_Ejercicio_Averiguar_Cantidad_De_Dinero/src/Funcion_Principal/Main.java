package Funcion_Principal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
            HACER UN PROGRAMA QUE DETERMINE CUANTO DINERO TIENEN TRES PERSONAS SI:
        
            PERSONA 1:  TIENEN N DOLARES
            PERSONA 2:  TIENE LA MITAD DE LA PERSONA 1
            PERSONA 3:  TIENE LA MITAD DE LA PERSONA 1 + PERSONA 2
        
            CALCULAR LA CANTIDAD TOTAL DE LA SUMA DE LAS PERSONAS
        */
        Scanner Lector_Datos = new Scanner(System.in);
        float Persona_1 = 0, Persona_2 = 0, Persona_3 = 0, Total_Dinero = 0;/*DECLARAMOS LAS VARIABLES*/
        System.out.print("DIGITE LA CANTIDAD DE DINERO DE LA PERSONA 1: $");  Persona_1 = Lector_Datos.nextFloat();
        /*DESPUES DE PEDIR EL UNICO DATO DEL EJERCICIO REALIZAMOS LAS OPERACIONES*/ 
        Persona_2 = Persona_1 / 2;
        Persona_3 = (Persona_1 + Persona_2)/2;
        Total_Dinero = Persona_1 + Persona_2 + Persona_3;
        /*IMPRIMIMOS EL RESULTADO EN PANTALLA*/
        System.out.println("LA CANTIDAD DE DINERO TOTAL DE LAS TRES PERSONAS ES: $"+Total_Dinero);
    }    
}