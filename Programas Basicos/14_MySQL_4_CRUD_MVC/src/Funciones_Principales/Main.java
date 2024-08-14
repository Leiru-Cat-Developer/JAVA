package Funciones_Principales;
import Controlador.Clase_Controlador_Persona;
import Modelo.Clase_Consultas;
import Modelo.Clase_Persona;
import Vista.JFrame_Vista;
public class Main {
    public static void main(String[] args) {
        JFrame_Vista vista1 = new JFrame_Vista();
        Clase_Persona persona1 = new Clase_Persona();
        Clase_Consultas consulta1 = new Clase_Consultas();
        Clase_Controlador_Persona controladorPersona1 = new Clase_Controlador_Persona(vista1, persona1, consulta1);
        controladorPersona1.iniciarAplicacion();
        vista1.setVisible(true);
    }
}
