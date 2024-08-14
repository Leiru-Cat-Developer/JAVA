package Funcion_Principal;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        /*
            ESTRUCTURA DE LA SENTENCIA SWITCH
        
            SWITCH (DATO){
            
            CASE 1: OPERACION 1;
                    BREAK;          -> FUNCIONA PARA SALIR CUANDO ENCUENTRE EL CASO CORRECTO
        
            CASE 2: OPERACION 2;
                    BREAK;          -> SI NO SE COLOCA SEGUIRA HACIENDO VARIAS SENTENCIAS
        
            CASE N: OPERACION N;
                    BREAK;          -> ESTA SENTENCIA SON COMO MUCHOS IF ANIDADOS
        
            DEFAULT: CASO CONTRARIO;
                     BREAK;
            }
        */
        int Dato = 0;
        Dato = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NÚMERO ENTRE 1 - 5"));
        /*APLICAMOS NUESTRO CONDICIONAL SWITCH*/
        switch (Dato){
            case 1: JOptionPane.showMessageDialog(null,"EL NÚMERO ES 1");
                        break;
            case 2: JOptionPane.showMessageDialog(null,"EL NÚMERO ES 2");
                        break;
            case 3: JOptionPane.showMessageDialog(null,"EL NÚMERO ES 3");
                        break;
            case 4: JOptionPane.showMessageDialog(null,"EL NÚMERO ES 4");
                        break;
            case 5: JOptionPane.showMessageDialog(null,"EL NÚMERO ES 5");
                        break;
            default: JOptionPane.showMessageDialog(null,"EL NÚMERO ESTÁ FUERA DEL RANGO 1 - 5");
                        break;
            /*EL DEFAULT ES EL CASO CONTRARIO DE TODOS LOS CASOS QUE PUEDEN LLEGAR A SUCEDER*/
        }
    }    
}