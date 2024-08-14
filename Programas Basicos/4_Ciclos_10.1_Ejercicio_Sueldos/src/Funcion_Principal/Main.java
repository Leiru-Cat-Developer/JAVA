package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            HACER UN PROGRAMA QUE INGRESE 10 SUELDOS DE EMPLEADO, Y AL FINAL DEL PROGRAMA MOSTRAR
            LA SUMA DE LOS SUELDOS Y LA CANTIDAD DE SUELDOS MAYORES A $1000
        */
        float Sueldos_Pedidos = 0, Suma_Sueldos = 0;
        int Contador_Sueldos_Mayores_A_Mil = 0;
        for(int i = 0; i < 10; i++){
            Sueldos_Pedidos = Float.parseFloat(JOptionPane.showInputDialog("DIGITE EL SUELDO "+(i+1)+" $$$"));
            Suma_Sueldos += Sueldos_Pedidos;
            if(Sueldos_Pedidos > 1000){
                
                Contador_Sueldos_Mayores_A_Mil++;
                
            }
        }
        /*MOSTRAMOS LOS RESULTADOS EN PANTALLA*/
        JOptionPane.showMessageDialog(null,"LA SUMA DE SUELDOS TOTAL ES: $"+Suma_Sueldos);
        JOptionPane.showMessageDialog(null,"LOS SUELDOS MAYORES A $1000 SON: "+Contador_Sueldos_Mayores_A_Mil);
    }    
}