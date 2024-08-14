package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            DADAS LAS EDADES Y ALTURAS DE 5 ALUMNOS, MOSTRAR LA EDAD Y LA ESTATURA MEDIA,
            TAMBIEN CALCULAR Y MOSTRAR LA CANTIDAD DE ALUMNOS MAYORES A 18 AÑOS Y LOS ALUMNOS
            QUE MIDEN MÁS DE 1.75
        */
        int Edad_Alumno = 0, Alumnos_Mayores_De_18_Años = 0, Alumnos_Con_Estatura_Mayor_1_75 = 0;
        float Altura_Alumno = 0, Suma_Edad = 0, Suma_Estatura = 0, Media_Edad = 0, Media_Altura = 0;
        for(int i = 0; i < 5; i++){
            
            Edad_Alumno = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA EDAD DEL ALUMNO"));
            Altura_Alumno = Float.parseFloat(JOptionPane.showInputDialog("DIGITE LA ALTURA DEL ALUMNO"));
            Suma_Edad += Edad_Alumno;           //SUMA ITERATIVA DE LAS EDADES
            Suma_Estatura += Altura_Alumno;     //SUMA ITERATIVA DE LAS ESTATURAS
            if(Edad_Alumno > 18){
                
                Alumnos_Mayores_De_18_Años++;
                
            }
            if(Altura_Alumno > 1.75){
                
                Alumnos_Con_Estatura_Mayor_1_75++;
                
            }
        }
        /*HACEMOS LOS CALCULOS DE LAS MEDIAS QUE NOS ESTAN PIDIENDO*/
        Media_Edad = Suma_Edad/5;
        Media_Altura = Suma_Estatura/5;
        JOptionPane.showMessageDialog(null,"LA MEDIA DE LAS EDADES ES: "+Media_Edad);
        JOptionPane.showMessageDialog(null,"LA MEDIA DE LAS ALTURAS ES: "+Media_Altura);
        JOptionPane.showMessageDialog(null,"ALUMNOS MAYORES DE 18 AÑOS: "+Alumnos_Mayores_De_18_Años);
        JOptionPane.showMessageDialog(null,"ALUMNOS MAYORES DE ALTURA 1.75: "+Alumnos_Con_Estatura_Mayor_1_75);
    }    
}