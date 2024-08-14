package Controlador;
import Modelo.Class_Modelo;
import Vista.JFrame_Vista;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Class_Controlador implements ActionListener{
    private JFrame_Vista vista;
    private Class_Modelo modelo;
    public Class_Controlador(JFrame_Vista vista, Class_Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        vista.botonSumar.addActionListener(this);
    }
    public void iniciar(){
        vista.setTitle("MVC para Sumar");
        vista.setLocationRelativeTo(null);
        vista.setSize(350, 350);
        vista.setMinimumSize(new Dimension(360, 360));
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        modelo.setNumero1(Integer.parseInt(vista.textFieldNumero1.getText()));
        modelo.setNumero2(Integer.parseInt(vista.textFieldNumero2.getText()));
        modelo.sumar();
        vista.textFieldResultado.setText(String.valueOf(modelo.getResultado()));
    }
}