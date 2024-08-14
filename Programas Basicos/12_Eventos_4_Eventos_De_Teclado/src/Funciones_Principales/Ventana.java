package Funciones_Principales;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
public class Ventana extends JFrame {
    //ATRIBUTOS
    private JPanel panelPrincipal;                                              //JPANEL GLOBAL
    private JTextArea areaDeTexto1;                                             //JTEXTAREA GLOBAL    
    private JScrollPane barraDesplazable1;                                      //JSCROLLPANE GLOBAL
    private JButton boton1;                                                     //JBUTTON GLOBAL
    JTextField cajaDeTexto1;                                                    //JTEXTFIELD GLOBAL
    //METODOS
    public Ventana() {
        //CONSTRUCTOR
        this.setSize(600, 600);
        this.setTitle("Eventos De Teclado");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        //INICIO DE PROGRAMA
        iniciarComponentes();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void iniciarComponentes() {
        colocarPaneles();
        colocarAreasDeTexto();
        colocarCajasDeTexto();
    }
    private void colocarPaneles() {
        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(null);
        this.getContentPane().add(panelPrincipal);
    }
    private void colocarAreasDeTexto() {
        areaDeTexto1 = new JTextArea();
        areaDeTexto1.setBounds(30, 30, 200, 200);
        areaDeTexto1.setEditable(false);
        panelPrincipal.add(areaDeTexto1);
        //AÑADIMOS BARRAS DESPLAZABLES VERTICALES Y HORIZONTALES
        barraDesplazable1 = new JScrollPane(areaDeTexto1,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barraDesplazable1.setBounds(30, 30, 200, 200);
        panelPrincipal.add(barraDesplazable1);
    }
    private void colocarCajasDeTexto(){
        cajaDeTexto1 = new JTextField();
        cajaDeTexto1.setBounds(30, 350, 200, 50);
        panelPrincipal.add(cajaDeTexto1);
        eventosDeTeclado();
    }
    private void eventosDeTeclado(){
        KeyListener oyenteDeTecladoPrincipal = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //CUANDO PRESIONAMOS SOLO CARACTERES UNICODE
                areaDeTexto1.append("KEY TYPED"+"\n");
            }
            @Override
            public void keyPressed(KeyEvent e) {
                //CUANDO PRESIONAMOS CUALQUIER TECLA
                areaDeTexto1.append("KEY PRESSED"+"\n");
            }
            @Override
            public void keyReleased(KeyEvent e) {
                //CUANDO PRESIONAMOS Y SOLTAMOS CUALQUIER TIPO DE TECLA
                //areaDeTexto1.append("KEY RELEASED"+"\n");                     //DEFAULT
                if(e.getKeyChar() == ' '){
                    //ACCIÓN PARA DETECTAR UN CARACTER ESPECIFICO
                    areaDeTexto1.append("ESPACIO"+"\n");
                }
            }
        };
        cajaDeTexto1.addKeyListener(oyenteDeTecladoPrincipal);
    }
}
