package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            PEDIR 5 CALIFICACIONES DE LOS ALUMNOS Y VERIFICAR SI HAY ALGUN SUSPENSO
        */
        int Calificaciones_Pedidas = 0;
        boolean Suspensos = false;
        for(int i = 0; i < 5; i++){
            Calificaciones_Pedidas = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CALIFICACION DEL ALUMNO "+(i+1)));
            if(Calificaciones_Pedidas < 6){
                Suspensos = true;
            }
        }
        if(Suspensos == true){
            JOptionPane.showMessageDialog(null,"HAY ALMENOS UN SUSPENSO EN LAS CALIFICACIONES");
        }else{
            JOptionPane.showMessageDialog(null,"NO HAY NINGUN SUSPENSON EN LAS CALIFICACIONES");
        }
    }    
}