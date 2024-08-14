package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            HACER UN PROGRAMA QUE PIDA 10 NÚMEROS, Y QUE NOS MUESTRE LA MEDIA DE LOS NÚMEROS
            POSITIVOS, LOS NEGATIVOS Y CUANTOS NÚMEROS CEROS HAY
        */
        int Numeros_Pedidos = 0, Suma_Positivos = 0, Conteo_Positivos = 0, Suma_Negativos = 0, Conteo_Negativos = 0, Ceros = 0;
        float Media_Positivos = 0, Media_Negativos = 0;
        for(int i = 1; i <= 10; i++){
            Numeros_Pedidos = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NÚMERO "+(i)));
            if(Numeros_Pedidos == 0){
                
                Ceros++;
                
            }else if(Numeros_Pedidos > 0){
                
                Suma_Positivos += Numeros_Pedidos;
                Conteo_Positivos++;
                
            }else if(Numeros_Pedidos < 0){
                
                Suma_Negativos += Numeros_Pedidos;
                Conteo_Negativos++;
                
            }
        }
        /*FUERA DEL CICLO HACEMOS LAS OPERACIONES*/
        if(Conteo_Positivos == 0){                                  /*POSITIVOS*/
            
            JOptionPane.showMessageDialog(null,"NO SE PUEDE SACAR EL PROMEDIO DE LOS POSITIVOS");
            
        }else{
            
            Media_Positivos = (float) Suma_Positivos / Conteo_Positivos;
            JOptionPane.showMessageDialog(null,"EL PROMEDIO DE POSITIVOS ES: "+Media_Positivos);
            
        }
        if(Conteo_Negativos == 0){                                  /*NEGATIVOS*/
            
            JOptionPane.showMessageDialog(null,"NO SE PUEDE SACAR EL PROMEDIO DE LOS NEGATIVOS");
            
        }else{
            
            Media_Negativos = (float) Suma_Negativos / Conteo_Negativos;
            JOptionPane.showMessageDialog(null,"EL PROMEDIO DE NEGATIVOS ES: "+Media_Negativos);
            
        }
        JOptionPane.showMessageDialog(null,"LA CANTIDAD DE CEROS DIGITADA ES: "+Ceros);         /*CANTIDAD DE CEROS*/
    }    
}