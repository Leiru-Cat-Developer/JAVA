package Funcion_Principal;
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        /*
            CONSTRUIR UN PROGRAMA QUE PERMITA DIRIGIR EL MOVIMIENTO DE UN OBJETO DENTRO DE UN TABLERO Y ACTUALICE
            SU POCISION DENTRO DEL MISMO. LOS MOVIMIENTOS POSIBLES SON ARRIBA, ABAJO, IZQUIERDA Y DERECHA. TRAS
            CADA MOVIMIENTO EL PROGRAMA MOSTRARÁ LA NUEVA DIRECCIÓN ELEGIDA Y LAS COORDENADAS DE SITUACIÓN DEL
            OBJETO DENTRO DEL TABLERO
        */
        Scanner Lector_De_Datos = new Scanner(System.in);
        Objeto OB1;
        int X = 0, Y = 0, Opcion = 0, Incremento = 0;
        System.out.print("DIGITE LAS COORDENADAS INICIALES [X,Y]: ");
        X = Lector_De_Datos.nextInt();
        Y = Lector_De_Datos.nextInt();
        OB1 = new Objeto(X,Y);                                      //POCISION INICIAL DEL OBJETO
        do{
            System.out.println("\n\t\t"+"ELIJA SU OPCIÓN"+"\n");
            System.out.println("1. MOVER DERECHA"+
                             "\n2. MOVER IZQUIERDA"+
                             "\n3. MOVER ARRIBA"+
                             "\n4. MOVER ABAJO"+
                             "\n5. SALIR");
            System.out.print("-> ");Opcion = Lector_De_Datos.nextInt();
            if(Opcion != 5){
                System.out.print("\n"+"DIGITE LA CANTIDAD DE ESPACIOS A MOVERSE: "); Incremento = Lector_De_Datos.nextInt();
            }
            switch(Opcion){
                case 1:     OB1.Mover_Derecha(Incremento);
                    break;
                case 2:     OB1.Mover_Izquierda(Incremento);
                    break;
                case 3:     OB1.Mover_Arriba(Incremento);
                    break;
                case 4:     OB1.Mover_Abajo(Incremento);
                    break;
                case 5: break;
                default:    System.out.println("ERROR, INGRESE DE NUEVO LA OPCIÓN");
                    break;
            }
            System.out.println("\n"+"POCISION ACTUAL ["+OB1.getX()+"]["+OB1.getY()+"]");
        }while(Opcion != 5);
    }
}