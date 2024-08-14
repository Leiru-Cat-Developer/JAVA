package Funciones_Principales;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
public class Ventana extends JFrame {
    //ATRIBUTOS
    private JPanel panelPrincipal;
    private JButton boton1;
    private JLabel etiqueta1;
    //METODOS
    public Ventana() {
        this.setSize(600, 600);
        this.setTitle("Ejercicio 1 - Contador De Clicks");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        //INICIO DEL PROGRAMA
        inicializarComponentes();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void inicializarComponentes() {
        colocarPaneles();
        colocarBotones();
        colocarEtiquetas();
    }
    private void colocarPaneles() {
        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(null);
        this.getContentPane().add(panelPrincipal);
    }
    private void colocarBotones() {
        boton1 = new JButton("! PRESIONA ¡");
        boton1.setFont(new Font("Arial", 2, 20));
        boton1.setBounds(50, 250, 500, 50);
        panelPrincipal.add(boton1);
        oyenteContadorDeClicks();
    }
    private void colocarEtiquetas() {
        etiqueta1 = new JLabel(" --- ", SwingConstants.CENTER);
        etiqueta1.setForeground(Color.BLACK);
        etiqueta1.setFont(new Font("Arial", 2, 20));
        etiqueta1.setBounds(50, 50, 500, 50);
        panelPrincipal.add(etiqueta1);
    }
    private void oyenteContadorDeClicks() {
        MouseListener oyenteDeRatonPrincipal = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //CONTADOR DE CLICKS
                etiqueta1.setText("NÚMERO DE CLICK's:    "+e.getClickCount());
            }
            @Override
            public void mousePressed(MouseEvent e) {
                //NO INICIALIZAR
                System.out.print("MOUSE PRESSED"+"\n");
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                //NO INICIALIZAR
                System.out.print("MOUSE RELEASED"+"\n");
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                //NO INICIALIZAR
                System.out.print("MOUSE ENTERED"+"\n");
            }
            @Override
            public void mouseExited(MouseEvent e) {
                System.out.print("MOUSE EXITED"+"\n");
                //NO INICIALIZAR
            }
        };
        boton1.addMouseListener(oyenteDeRatonPrincipal);
    }
}