package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            HACER UN PROGRAMA QUE DADA UNA CANTIDAD DE KG, NOS DEVUELVA SU VALOR CONVERTIDO
            EN LAS UNIDADES DE MEDIDA QUE NOSOTROS DESEEMOS [INGRESARLAS EN UN MENU]
        */
        int Opcion = 0;
        float KG_Iniciales = 0, Resultado_Conversión = 0;
        /*PEDIMOS EL VALOR DE LOS KG AL USUARIO POR MEDIO DE UN JOPTION PANE*/
        KG_Iniciales = Float.parseFloat(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE KG QUE DESEA CONVERTIR"));
        /*HACEMOS LAS OPERACIONES CON LAS FORMULAS CORRESPONDIENTES Y LOS CONDICIONALES*/
        if(KG_Iniciales <= 0){
            
            JOptionPane.showMessageDialog(null,"LA OPERACION NO SE PUEDE CUMPLIR CON ESTOS DATOS");
            
        }else{
            
            Opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA UNIDAD A LA QUE DESEA CONVERTIR"
                    +"\n\nOPCION 1: TONELADAS"
                    +"\nOPCION 2: LIBRAS"
                    +"\nOPCION 3: GRAMOS"
                    +"\nOPCION 4: SALIR"));
            /*SEGUN LAS OPCIONES QUE EL USUARIO DIGITE ES LO QUE VAMOS A HACER EN EL PROGRAMA*/
            switch (Opcion){
                case 1:     Resultado_Conversión = KG_Iniciales * 0.001f;
                            JOptionPane.showMessageDialog(null,"LA CONVERSION DE "+KG_Iniciales+" KG A TONELADAS ES: "+Resultado_Conversión);
                    break;
                case 2:     Resultado_Conversión = KG_Iniciales * 2.2046f;
                            JOptionPane.showMessageDialog(null,"LA CONVERSION DE "+KG_Iniciales+" KG A LIBRAS ES: "+Resultado_Conversión);
                    break;
                case 3:     Resultado_Conversión = KG_Iniciales * 1000f;
                            JOptionPane.showMessageDialog(null,"LA CONVERSION DE "+KG_Iniciales+" KG A GRAMOS ES: "+Resultado_Conversión);
                    break;
                case 4:     JOptionPane.showMessageDialog(null,"MUCHAS GRACIAS POR USARME, HASTA LUEGO");
                    break;  
                default:    JOptionPane.showMessageDialog(null,"LA OPCION QUE USTED DIGITO NO EXISTE");
                    break;
            }
        }
    }    
}