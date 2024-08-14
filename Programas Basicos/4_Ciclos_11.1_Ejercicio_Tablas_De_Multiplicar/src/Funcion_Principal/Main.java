package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            PEDIR UN NÚMERO ENTRE 0 - 10 Y MOSTRAR LA TABLA DE MULTIPLICAR DE DICHO NÚMERO HASTA EL 10
        */
        int Tabla_De_Multiplicar = 0;
        Tabla_De_Multiplicar = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NÚMERO [0 - 10]"));
        if((Tabla_De_Multiplicar < 0)||(Tabla_De_Multiplicar > 10)){
            
            JOptionPane.showMessageDialog(null,"NO SE PUEDE CUMPLIR ESTA ORDEN, DIGITE UN NÚMERO ENTRE [0 - 10]");
            
        }else{
            
            for(int i = 1; i <= 10; i++){
                
                System.out.println(i+" * "+Tabla_De_Multiplicar+" = "+(i*Tabla_De_Multiplicar));
                
            }
            
        }
    }    
}