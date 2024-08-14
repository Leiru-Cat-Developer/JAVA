package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            DADAS 6 NOTAS, ESCRIBIR LA CANTIDAD DE ALUMNOS APROBADOS, CONDICIONADOS (=6)
            Y SUSPENSOS
        */
        float Nota_Alumno = 0;
        int Cantidad_Aprobados =0, Cantidad_Condicionados = 0, Cantidad_Suspensos = 0;
        for(int i = 0; i < 6; i++){
            do{
                Nota_Alumno = Float.parseFloat(JOptionPane.showInputDialog("DIGITE LA NOTA DEL ALUMNO "+(i+1)));
            }while((Nota_Alumno < 0) || (Nota_Alumno > 10));
            if(Nota_Alumno == 6){
                Cantidad_Condicionados++;
            }else if(Nota_Alumno > 6){
                Cantidad_Aprobados++;
            }else{
                Cantidad_Suspensos++;
            }
        }
        System.out.println("CANTIDAD DE APROBADOS: "+Cantidad_Aprobados);
        System.out.println("CANTIDAD DE CONDICIONADOS: "+Cantidad_Condicionados);
        System.out.println("CANTIDAD DE SUSPENSOS: "+Cantidad_Suspensos);
    }    
}