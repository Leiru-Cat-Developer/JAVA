package Funciones_Principales;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
public class Ventana extends JFrame {
    //ATRIBUTOS
    private JPanel panelPrincipal;                                              //JPANEL GLOBAL
    private JTextArea areaDeTexto1;                                             //JTEXTAREA GLOBAL    
    private JScrollPane barraDesplazable1;                                      //JSCROLLPANE GLOBAL
    private JButton boton1;                                                     //JBUTTON GLOBAL
    //METODOS
    public Ventana() {
        //CONSTRUCTOR
        this.setSize(600, 600);
        this.setTitle("Oyente De Ratón");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        //INICIO DE PROGRAMA
        iniciarComponentes();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void iniciarComponentes() {
        colocarPaneles();
        colocarAreasDeTexto();
        colocarBotones();
    }
    private void colocarPaneles() {
        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(null);
        this.getContentPane().add(panelPrincipal);
    }
    private void colocarAreasDeTexto() {
        areaDeTexto1 = new JTextArea();
        areaDeTexto1.setBounds(30, 30, 200, 200);
        areaDeTexto1.setEditable(true);
        panelPrincipal.add(areaDeTexto1);
        //AÑADIMOS BARRAS DESPLAZABLES VERTICALES Y HORIZONTALES
        barraDesplazable1 = new JScrollPane(areaDeTexto1,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barraDesplazable1.setBounds(30, 30, 200, 200);
        panelPrincipal.add(barraDesplazable1);
    }
    private void colocarBotones() {
        boton1 = new JButton("¡ PRESIONAR !");
        boton1.setBounds(30, 300, 200, 50);
        boton1.setFont(new Font("Arial", 2, 20));
        panelPrincipal.add(boton1);
        eventoOyenteDeRaton1();
    }
    private void eventoOyenteDeRaton1() {
        //AGREGANDO OYENTE DE RATON
            MouseListener oyenteDeRatonPrincipal = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //PRESIONAR Y SOLTAR DENTRO DEL BOTÓN
                areaDeTexto1.append("MOUSE CLICKED"+"\n");
            }
            @Override
            public void mousePressed(MouseEvent e) {
                //PRESIONAR EL BOTON SIN NECESIDAD DE SOLTAR DENTRO DEL BOTÓN
                areaDeTexto1.append("MOUSE PRESSED"+"\n");
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                //PRESIONAR Y SOLTAR FUERA DEL BOTÓN
                areaDeTexto1.append("MOUSE RELEASED"+"\n");
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                //DETECTA EL MOUSE CERCA DEL BOTÓN SIN NECESIDAD DE PRESIONARLO
                areaDeTexto1.append("MOUSE ENTERED"+"\n");
            }
            @Override
            public void mouseExited(MouseEvent e) {
                //DETECTA EL MOUSE CUANDO SE SALGA DEL BOTON SIN NECESIDAD DE PRESIONAR
                areaDeTexto1.append("MOUSE EXITED"+"\n");
            }
        };
        boton1.addMouseListener(oyenteDeRatonPrincipal);
    }
}