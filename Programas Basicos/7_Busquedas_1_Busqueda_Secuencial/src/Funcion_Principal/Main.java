package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            ARREGLO[] = {3,1,2,5,4};
            SI QUEREMOS BUSCAR UN DATO, POR EJEMPLO, EL VALOR 2, PODEMOS USAR LA BUSQUEDA SECUENCIAL
        */
        int Arreglo[] = {3,1,2,5,4};
        int Dato = 0;               //PODEMOS IGUALARLO O NO A CERO
        boolean Bandera = false;    //INDICA SI YA HEMOS ENCONTRADO EL VALOR O AÚN NO SE HA ENCONTRADO
        Dato = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NÚMERO QUE QUIERE BUSCAR"));
        /*ALGORITMO DE BUSQUEDA SECUENCIAL*/
        int i = 0;
        while((i < 5)&&(Bandera == false)){/*(ITERADOR < NÚMERO DE ELEMENTOS) < (BANDERA == FALSE)*/
            if(Arreglo[i] == Dato){
                Bandera = true;
            }
            i++;
        }
        /*INDICAMOS QUE NO SE HA ENCONTRADO EL VALOR*/
        if(Bandera == false){
            JOptionPane.showMessageDialog(null,"EL DATO "+Dato+" NO SE ENCUENTRA EN EL ARREGLO");
        }
        /*INDICAMOS QUE SI SE HA ENCONTRADO EL VALOR*/
        if(Bandera == true){
            JOptionPane.showMessageDialog(null,"EL DATO "+Dato+" HA SIDO ENCONTRADO EN LA POCISION "+(i-1));
            /*SE RESTA UN NÚMERO AL ITERADOR POR QUE AL TERMINAR EL CICLO SE SUMA UN NÚMERO EXTRA*/
        }
    }    
}