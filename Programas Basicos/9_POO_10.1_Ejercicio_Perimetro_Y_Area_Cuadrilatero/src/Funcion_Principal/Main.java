package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String [] args){
        /*
            CONSTRUIR UN PROGRAMA QUE CALCULE EL AREA Y EL PERIMETRO DE UN CUADRILATERO DADA LA LONGITUD
            DE SUS LADOS. LOS VALORES DE LA LONGITUD DEBERAN INTRODUCIRSE POR LINEA DE ORDENES. SI ES UN
            CUADRADO, SOLO SE PROPORCIONARA LA LONGITUD DE UNO DE SUS LADOS AL CONSTRUCTOR
        */
        Cuadrilatero C1;
        float Lado_1 = 0, Lado_2 = 0;
        Lado_1 = Float.parseFloat(JOptionPane.showInputDialog("DIGITE EL VALOR DEL LADO 1"));
        Lado_2 = Float.parseFloat(JOptionPane.showInputDialog("DIGITE EL VALOR DEL LADO 2"));
        if((Lado_1 == Lado_2)){
            C1 = new Cuadrilatero(Lado_1);
            //SI ES UN CUADRADO SOLO MANDAMOS UN VALOR AL OBJETO CREADO
        }else{
            C1 = new Cuadrilatero(Lado_1, Lado_2);
            //SI ES UN RECTANGULO LE MANDAMOS DOS VALORES AL OBJETO CREADO
        }
        //MOSTRAMOS LOS RESULTADOS EN PANTALLA
        System.out.println("EL PERIMETRO ES: "+C1.getPerimetro());
        System.out.println("EL AREA ES: "+C1.getArea());
    }
}