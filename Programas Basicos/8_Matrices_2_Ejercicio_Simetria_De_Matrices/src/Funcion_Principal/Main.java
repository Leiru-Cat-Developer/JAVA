package Funcion_Principal;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            CREAR Y CARGAR UNA MATRIZ DE --M * N-- Y COMPROBAR SI ES SIMETRICA O NO
        
            **PARA ESTO DEBEMOS COMPARAR LA MATRIZ ORIGINAL CON LA MATRIZ TRANSPUESTA [CAMBIAR FILAS POR COLUMNAS]**
        */
        Scanner Lector_De_Datos = new Scanner(System.in);
        int Matriz[][];
        int Número_De_Filas_MATRIZ = 0, Número_De_Columnas_MATRIZ = 0;
        boolean Matriz_Simetrica = true;
        /*VERIFICAMOS QUE EL NÚMERO DE FILAS NO SEA MENOR O IGUAL A CERO DE LA MATRIZ UNO*/
        System.out.println("PIDIENDO NÚMERO DE FILAS DE LA MATRIZ");
        while(Número_De_Filas_MATRIZ <= 0){
            Número_De_Filas_MATRIZ = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NÚMERO DE FILAS DE LA MATRIZ"));
            if(Número_De_Filas_MATRIZ <= 0){
                JOptionPane.showMessageDialog(null,"EL NÚMERO DE FILAS ES INCORRECTO, DIGITELO DE NUEVO ...");
            }
        }
        /*VERIFICAMOS QUE EL NÚMERO DE COLUMNAS NO SEA MENOR O IGUAL A CERO DE LA MATRIZ UNO*/
        System.out.println("PIDIENDO NÚMERO DE COLUMNAS DE LA MATRIZ");
        while(Número_De_Columnas_MATRIZ <= 0){
            Número_De_Columnas_MATRIZ = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NÚMERO DE COLUMNAS DE LA MATRIZ"));
            if(Número_De_Columnas_MATRIZ <= 0){
                JOptionPane.showMessageDialog(null,"EL NÚMERO DE COLUMNAS ES INCORRECTO, DIGITELO DE NUEVO ...");
            }
        }
        /*RELLENAMOS LA MATRIZ*/
        Matriz = new int[Número_De_Filas_MATRIZ][Número_De_Columnas_MATRIZ];
        System.out.println("\n\t"+"RELLENANDO LA MATRIZ");
        for(int i = 0; i < Número_De_Filas_MATRIZ; i++){
            System.out.println("\n\t\t"+"FILA "+(i)+"\n");          //NOS INDICA EN QUE FILA ES LA QUE ESTÁMOS RELLENANDO
            for(int j = 0; j < Número_De_Columnas_MATRIZ; j++){
                System.out.print("DIGITE EL VALOR DE LA POCISION ["+(i)+"] ["+(j)+"] : ");    Matriz[i][j] = Lector_De_Datos.nextInt();
            }
        }
        /*COMPROBAMOS LA SIMETRIA DE LA MATRIZ*/
        if(Número_De_Filas_MATRIZ == Número_De_Columnas_MATRIZ){
            int i = 0;
            int j = 0;
            while((i < Número_De_Filas_MATRIZ)&&(Matriz_Simetrica == true)){
                while((j < i)&&(Matriz_Simetrica == true)){
                    if(Matriz[i][j] != Matriz[j][i]){
                        Matriz_Simetrica = false;
                    }
                    j++;
                }
                i++;
            }
            if(Matriz_Simetrica == true){
                JOptionPane.showMessageDialog(null,"LA MATRIZ ES PERFECTAMENTE SIMETRICA");
            }else{
                JOptionPane.showMessageDialog(null,"LA MATRIZ NO ES SIMETRICA");
            }
        }else{
            JOptionPane.showMessageDialog(null,"LA MATRIZ NO ES SIMETRICA");
        }
    }    
}