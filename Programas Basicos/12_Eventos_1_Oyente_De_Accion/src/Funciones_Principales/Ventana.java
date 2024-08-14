package Funciones_Principales;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
public class Ventana extends JFrame {
    //ATRIBUTOS
    private JPanel panelPrincipal;
    private JTextField cajaDeTexto1;
    //METODOS
    public Ventana() {
        //CONSTRUCTOR
        this.setSize(600, 600);
        this.setTitle("Oyente De Acción");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        //INICIO DE PROGRAMA
        iniciarComponentes();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void iniciarComponentes() {
        colocarPaneles();
        colocarEtiquetas();
        colocarCajasDeTexto();
        colocarBotones();
    }
    private void colocarPaneles() {
        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(null);
        this.getContentPane().add(panelPrincipal);
    }
    private void colocarEtiquetas() {
        JLabel texto1 = new JLabel("¡ INGRESE SU NOMBRE !",SwingConstants.CENTER);
        texto1.setBounds(40, 20, 500, 50);
        //PERSONALIZACIÓN DEL TEXTO
        texto1.setForeground(Color.BLACK);
        texto1.setFont(new Font("Arial", 2, 20));
        //AGREGANDO OBJETOS AL PANEL PRINCIPAL
        panelPrincipal.add(texto1);
    }
    private void colocarCajasDeTexto() {
        cajaDeTexto1 = new JTextField(SwingConstants.CENTER);
        cajaDeTexto1.setBounds(165, 70, 250, 20);
        //AGREGANDO OBJETOS AL PANEL PRINCIPAL
        panelPrincipal.add(cajaDeTexto1);
    }
    private void colocarBotones() {
        JButton boton1 = new JButton("¡ PRESIONA AQUÍ !");
        boton1.setFont(new Font("Arial", 2, 20));
        boton1.setBounds(165, 200, 250, 50);
        panelPrincipal.add(boton1);
        //AGREGANDO ETIQUETA PARA MOSTRARLA CON EL OYENTE
        JLabel etiquetaDelOyente1 = new JLabel();
        etiquetaDelOyente1.setBounds(165, 400, 250, 50);
        etiquetaDelOyente1.setFont(new Font("Arial", 2, 20));
        panelPrincipal.add(etiquetaDelOyente1);
        //AGREGANDO OYENTE DE ACCIÓN
        ActionListener oyenteDeAccion1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //EVENTO QUE SUCEDERA EN CASO DE PRESIONAR EL BOTÓN
                etiquetaDelOyente1.setText("-> HOLA "+cajaDeTexto1.getText());
                //ES CONVENIENTE CONVERTIR LAS VARIABLES, EN VARIABLES GLOBALES PARA QUE SEA MÁS FÁCIL IMPLEMENTAR
            }
        };
        //AGREGANDO OBJETOS CON OYENTE AL PANEL PRINCIPAL
        boton1.addActionListener(oyenteDeAccion1);
    }
}