package Funcion_Principal;
import java.util.Scanner;
public class Main {
    public static int Atleta_Mas_Rapido(Atleta AT[]){
        /*
            VER EJERCICIO 11.1 PARA ENTENDER POR QUE SUCEDE ESTO
        */
        float Tiempo = 0;
        int Iterador = 0;
        Tiempo = AT[0].getTiempo();
        for(int i = 1; i < AT.length; i++){
            if((AT[i].getTiempo() < Tiempo)){
                Tiempo = AT[i].getTiempo();
                Iterador = i;
            }
        }
        return Iterador;
    }
    public static void main(String [] args){
        /*
            CONSTRUIR UN PROGAMA PARA UNA COMPETENCIA DE ATLETISMO, EL PROGRAMA DEBE GESTIONAR UNA SERIE DE
            ATLETAS CARACTERIZADOS POR SU NÚMERO DE ATLETA, NOMBRE Y TIEMPO DE CARRERA, AL FINAL EL PROGRAMA
            DEBE MOSTRAR LOS DATOS DEL ATLETA GANADOR DE LA CARRERA
        */
        Scanner Lector_De_Datos = new Scanner(System.in);
        int Numero_De_Corredores = 0, ID = 0, Iterador_Atleta_Mas_Rapido = 0;
        float Tiempo = 0;
        String Nombre;
        while(Numero_De_Corredores <= 0){
            System.out.print("DIGITE EL NÚMERO DE CORREDORES: ");   Numero_De_Corredores = Lector_De_Datos.nextInt();
            if(Numero_De_Corredores <= 0){
                System.out.println("\n"+"EL NÚMERO DE CORREDORES ES ILÓGICO, INTENTELO DE NUEVO ..."+"\n");
            }
        }
        //INICIALIZAMOS EL ARREGLO DE LOS OBJETOS Y COMENZAMOS A PEDIRLOS
        Atleta AT[] = new Atleta[Numero_De_Corredores];
        for(int i = 0; i < AT.length; i++){
            System.out.println("\n\t\t"+"DATOS DEL CORREDOR "+(i+1)+"\n");
            System.out.print("DIGITE EL ID: ");                                 ID = Lector_De_Datos.nextInt();
            Lector_De_Datos.nextLine();                                         //LIMPIEZA DE MEMORIA
            System.out.print("DIGITE EL NOMBRE: ");                             Nombre = Lector_De_Datos.nextLine();
            System.out.print("DIGITE EL TIEMPO: ");                             Tiempo = Lector_De_Datos.nextFloat();
            //PASAMOS LOS PARAMETROS AL OBJETO
            AT[i] = new Atleta(ID, Tiempo, Nombre);
        }
        //MOSTRAMOS LOS DATOS EN PANTALLA
        Iterador_Atleta_Mas_Rapido = Atleta_Mas_Rapido(AT);
        System.out.println(AT[Iterador_Atleta_Mas_Rapido].Mostrar_Datos_Del_Ganador());
    }
}