package Funcion_Principal;
public class Main {
    public static void main(String[] args) {
        /*
            LA DIFERENCIA DE ESTE CICLO CON LOS DEMÁS ES QUE PRIMERO ENTRA AL CICLO
            EJECUTA UNA SOLA VEZ LA ACCION Y DESPUES VERIFICA SI LA CONDICION ES CORRECTA
            SU ESTRUCTURA ES LA SIGUIENTE:
        
            DO{
                
                PROCESO
            
            }WHILE (CONDICION BOOLEANA)
        */
        int Iterador = 11;
        /*COLOCAMOS LA ESTRUCTURA DEL CICLO*/
        do{
            
            System.out.println(Iterador);
            Iterador++;
            
        }while(Iterador <= 11);
        /*CON ESTO COMPROBAMOS QUE PRIMERO EJECUTA Y DESPUÉS VERIFICA LA CONDICION*/
    }    
}