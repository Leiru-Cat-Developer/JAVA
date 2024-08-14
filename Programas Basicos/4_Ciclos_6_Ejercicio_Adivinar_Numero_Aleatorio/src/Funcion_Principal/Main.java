package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            HACER UN PROGRAMA QUE GENERE UN NÚMERO ALEATORIO PARA ADIVINARLO ENTRE 0 - 100,
            NOS DIGA SI NUESTRO NÚMERO ES MAYOR O MENOR PARA ADIVINARLO MÁS RAPIDO
            Y UNA VEZ QUE LO ADIVINEMOS NOS DIGA EN CUANTOS INTENTOS LO LOGRAMOS
        */
        int Numero_Aleatorio = (int)(Math.random()*100),Intentos = 0, Lectura_Numero = 0;
        /*
            EL NUMERO ALEATORIO SE GENERA EN DECIMALES, POR ESO HAY QUE MULTIPLICAR POR 100
            Y CONVERTIRLO A ENTERO PARA TRANSFORMARLO A SOLO NÚMEROS ENTEROS
        */
        do{ 
            Lectura_Numero = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NÚMERO PARA ADIVINAR"));
            
            if(Lectura_Numero > Numero_Aleatorio){
                
                JOptionPane.showMessageDialog(null,"EL NÚMERO ES MENOR");
                
            }else if(Lectura_Numero < Numero_Aleatorio){
                
                JOptionPane.showMessageDialog(null,"EL NÚMERO ES MAYOR");
                
            }
            Intentos++;
        }while(Lectura_Numero != Numero_Aleatorio);
        JOptionPane.showMessageDialog(null,"FELICIDADES ADIVINASTE EN "+Intentos+" INTENTOS");
    }    
}