package Main;
import Controlador.Class_Controlador;
import Modelo.Class_Modelo;
import Vista.JFrame_Vista;
public class MVC {
    public static void main(String[] args) {
        JFrame_Vista vista1 = new JFrame_Vista();
        Class_Modelo modelo1 = new Class_Modelo();   
        Class_Controlador controlador1 = new Class_Controlador(vista1, modelo1);
        controlador1.iniciar();
        vista1.setVisible(true);
    }
}