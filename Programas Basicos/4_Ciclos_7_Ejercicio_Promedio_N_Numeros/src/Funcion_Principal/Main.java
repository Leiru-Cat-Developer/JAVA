package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            HACER UN PROGRAMA QUE PIDA NUMEROS HASTA QUE SE LE INGRESE UN NÚMERO
            NEGATIVOS Y HACER LA MEDIA
        */
        int Numeros_Pedidos = 0, Contador_Media = 0, Acumulador_Numeros = 0;
        float Resultado = 0;/*LA COLOCAMOS MEJOR DE FORMA FLOTANTE PARA SER MÁS EXACTOS*/
        while(Numeros_Pedidos >= 0){
            Numeros_Pedidos = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NÚMERO"));
            if(Numeros_Pedidos >= 0){
                Acumulador_Numeros += Numeros_Pedidos;
                Contador_Media++;
            }
        }
        if(Contador_Media != 0){
            Resultado = (float) Acumulador_Numeros / Contador_Media;
            JOptionPane.showMessageDialog(null,"LA MEDIA ARIRMETICA ES: "+Resultado); 
        }else{
            JOptionPane.showMessageDialog(null,"NO EXISTE DIVISION ENTRE CERO");
        }
        
    }    
}