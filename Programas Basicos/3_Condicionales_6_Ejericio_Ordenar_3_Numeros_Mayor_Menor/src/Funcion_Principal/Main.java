package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
       /*
            DADOS TRES NÚMEROS, ORDENARLOS DE MAYOR A MENOR
        */
       int Numero_Uno = 0, Numero_Dos = 0, Numero_Tres = 0;
       /*PEDIMOS LOS TRES DATOS AL USUARIO POR MEDIO DEL JOPTION PANE*/
       Numero_Uno = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL PRIMER NÚMERO"));
       Numero_Dos = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL SEGUNDO NÚMERO"));
       Numero_Tres = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL TERCER NÚMERO"));
       /*
            APLICAMOS LOS CONDIONALES CORRESPONDIENTES CON LOS SIGUENTES POSIBLES CASOS
            
            CASO 1:     NUMERO 1    NUMERO 2    NUMERO 3
            CASO 2:     NUMERO 2    NUMERO 1    NUMERO 3
            CASO 3:     NUMERO 3    NUMERO 1    NUMERO 2
            CASO 4:     NUMERO 3    NUMERO 2    NUMERO 1
            CASO 5:     NUMERO 2    NUMERO 3    NUMERO 1
            CASO 6:     NUMERO 1    NUMERO 3    NUMERO 2
       
            CASO 7:     TODOS LOS NÚMEROS SON IGUALES
       */
       if((Numero_Uno > Numero_Dos)&&(Numero_Dos > Numero_Tres)){
           
           //CASO 1:     NUMERO 1    NUMERO 2    NUMERO
           JOptionPane.showMessageDialog(null, "LOS NÚMEROS ORDENADOS SON: "+Numero_Uno+" "+Numero_Dos+" "+Numero_Tres);
           
       }else if((Numero_Dos > Numero_Uno)&&(Numero_Uno > Numero_Tres)){
           
           //CASO 2:     NUMERO 2    NUMERO 1    NUMERO 3
           JOptionPane.showMessageDialog(null, "LOS NÚMEROS ORDENADOS SON: "+Numero_Dos+" "+Numero_Uno+" "+Numero_Tres);
           
       }else if((Numero_Tres > Numero_Uno)&&(Numero_Uno > Numero_Dos)){
           
           //CASO 3:     NUMERO 3    NUMERO 1    NUMERO 2
           JOptionPane.showMessageDialog(null, "LOS NÚMEROS ORDENADOS SON: "+Numero_Tres+" "+Numero_Uno+" "+Numero_Dos);
           
       }else if((Numero_Tres > Numero_Dos)&&(Numero_Dos > Numero_Uno)){
           
           //CASO 4:     NUMERO 3    NUMERO 2    NUMERO 1
           JOptionPane.showMessageDialog(null, "LOS NÚMEROS ORDENADOS SON: "+Numero_Tres+" "+Numero_Dos+" "+Numero_Uno);
           
       }else if((Numero_Dos > Numero_Tres)&&(Numero_Tres > Numero_Uno)){
           
           //CASO 5:     NUMERO 2    NUMERO 3    NUMERO 1
           JOptionPane.showMessageDialog(null, "LOS NÚMEROS ORDENADOS SON: "+Numero_Dos+" "+Numero_Tres+" "+Numero_Uno);
           
       }else if((Numero_Uno > Numero_Tres)&&(Numero_Tres > Numero_Dos)){
           
           //CASO 6:     NUMERO 1    NUMERO 3    NUMERO 2
           JOptionPane.showMessageDialog(null, "LOS NÚMEROS ORDENADOS SON: "+Numero_Uno+" "+Numero_Tres+" "+Numero_Dos);
           
       }else{
           
           //CASO 7: TODOS LOS NÚMEROS SON IGUALES
           JOptionPane.showMessageDialog(null, "TODOS LOS NÚMEROS SON IGUALES: "+Numero_Uno+" "+Numero_Tres+" "+Numero_Dos);
           
       }
    }    
}