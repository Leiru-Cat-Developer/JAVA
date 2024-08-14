package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            HACER UN PROGRAMA QUE SIMULE UN CAJERO CON UN SALDO INICIAL DE $1000
            CON LAS SIGUIENTES OPCIONES DISPONIBLES:
        
            1. INGRESAR DINERO
            2. RETIRAR DINERO
            3. SALIR
        */
        final float Saldo_Inicial = 1000;/*RECORDANDO COMO SE DECLARAN LAS CONSTANTES*/
        int Opcion = 0;
        float Ingreso = 0, Saldo_Actual = 0, Retiro = 0;
        /*PEDIMOS LOS DATOS AL USUARIO POR MEDIO DE UN JOPTION PANE, TODO EL MENU EN UN SOLO MENSAJE*/
        Opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA OPCION QUE DESEA DEL CAJERO"
                +"\n\nOPCION 1: INGRESAR DINERO"
                +"\nOPCION 2: RETIRAR DINERO"
                +"\nOPCION 3: SALIR"));
        /*UNA VEZ REVISADA LA OPCION QUE EL USUARIO NECESITA, HACEMOS LA PETICION DEL USUARIO*/
        switch (Opcion){
            case 1:     Ingreso = Float.parseFloat(JOptionPane.showInputDialog("DIGITE LA CANTIDAD QUE DESEA INGRESAR"));
                        Saldo_Actual = Saldo_Inicial + Ingreso;
                        JOptionPane.showMessageDialog(null,"INGRESO EXITOSO, SALDO ACTUAL: "+Saldo_Actual);
                break;
            case 2:     Retiro = Float.parseFloat(JOptionPane.showInputDialog("DIGITE LA CANTIDAD QUE SDESEA RETIRAR"));
                        if(Retiro > Saldo_Inicial){
                            
                            JOptionPane.showMessageDialog(null, "NO CUENTA CON EL SALDO SUFICIENTE PARA ESTE RETIRO");
                            
                        }else{
                            
                            Saldo_Actual = Saldo_Inicial - Retiro;
                            JOptionPane.showMessageDialog(null,"RETIRO EXITOSO, SALDO ACTUAL: "+Saldo_Actual);
                            
                        }
                break;
            case 3:     JOptionPane.showMessageDialog(null,"MUCHAS GRACIAS POR USARME, HASTA LUEGO");
                break;
            default:    JOptionPane.showMessageDialog(null,"LA OPCION QUE DIGITO NO EXISTE");
                break;
        }
    }    
}