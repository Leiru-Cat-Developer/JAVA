package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            LA BUSQUEDA BINARIA DEBE ESTAR ORDENADA EN FORMA ASCENDENTE, Y DESPUÉS DE ESO AHORA
            PODEMOS USAR LA BUSQUEDA BINARIA, SE RECOMIENDA PARA HACER BUSQUEDAS MUY GRANDES,
            **ES RECOMENDABLE USAR EL ORDENAMIENTO BURBUJA, INSERSION, ET
        */
        int Arreglo[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int Dato = 0;
        int Inferior, Superior, Mitad, Iterador; //ESTÁS VARIABLES SE INCIALIZAN CUANDO COMIENZA EL ALGORITMO
        boolean Bandera = false;                 //INDICA SI YA SE HA ENCONTRADO EL ELEMENTO
        Dato = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL DATO QUE DESEA BUSCAR"));
        /*ALGORITMO DE LA BUSQUEDA BINARIA*/
        Inferior = 0;
        Superior = 15;  //SUPERIOR = NÚMERO DE ELEMENTOS DEL ARREGLO
        Iterador = 0;
        Mitad = (Inferior+Superior)/2;
        while((Inferior <= Superior)&&(Iterador < 15)){/*(INFERIOR <= SUPERIOR)&&(ITERADOR < NÚMERO DE ELEMENTOS DEL ARREGLO)*/
            if(Arreglo[Mitad] == Dato){
                Bandera = true;
                break;
            }
            if(Arreglo[Mitad] > Dato){
                Superior = Mitad;
                Mitad = (Inferior+Superior)/2;
            }
            if(Arreglo[Mitad] < Dato){
                Inferior = Mitad;
                Mitad = (Inferior+Superior)/2;
            }
            Iterador++;
        }
        /*INDICAMOS QUE SI SE HA ENCONTRADO EL VALOR*/
        if(Bandera == true){
            JOptionPane.showMessageDialog(null,"EL DATO "+Dato+" HA SIDO ENCONTRADO EN LA POCISION "+(Mitad));
        }
        /*INDICAMOS QUE NO SE HA ENCONTRADO EL VALOR*/
        if(Bandera == false){
            JOptionPane.showMessageDialog(null,"EL DATO "+Dato+" NO SE HA ENCONTRADO EN EL ARREGLO");
        }
    }    
}