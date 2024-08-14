package Funciones_Principales;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
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
        //eventoMovimientoDeRaton1();
        eventoScrollDeRaton1();
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
    private void colocarBotones() {
        boton1 = new JButton("¡ PRESIONAR !");
        boton1.setBounds(30, 300, 200, 50);
        boton1.setFont(new Font("Arial", 2, 20));
        panelPrincipal.add(boton1);
        //eventoOyenteDeRaton1();
    }
    private void eventoOyenteDeRaton1() {
        //AGREGANDO OYENTE DE RATON
            MouseListener oyenteDeRatonPrincipal = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //PRESIONAR Y SOLTAR DENTRO DEL BOTÓN
                if(e.isAltDown()) {
                    //VERIFICA SI LA TECLA 'ALT' ESTÁ PRESIONADA
                    areaDeTexto1.append("ALT"+"\n");
                }else if(e.isControlDown()) {
                    //VERIFICA SI LA TECLA 'CTRL' ESTÁ PRESIONADA
                    areaDeTexto1.append("CTRL"+"\n");
                }else if(e.isShiftDown()) {
                    //VERIFICA SI LA TECLA 'SIFT' ESTÁ PRESIONADA
                    areaDeTexto1.append("SIFT"+"\n");
                }else if(e.isMetaDown()) {
                    //VERIFICA SI ESTAMOS DANDO CLICK DERECHO
                    areaDeTexto1.append("CLICK DERECHO"+"\n");
                }else {
                    //areaDeTexto1.append("CLICK IZQUIERDO"+"\n");              //DEFAULT
                }
                if(e.getClickCount() == 2) {
                    //CUENTA LA CANTIDAD DE CLICKS
                    areaDeTexto1.append("DOBLE CLICK"+"\n");
                }
            }
            @Override
            public void mousePressed(MouseEvent e) {
                //PRESIONAR EL BOTON SIN NECESIDAD DE SOLTAR DENTRO DEL BOTÓN
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                //PRESIONAR Y SOLTAR FUERA DEL BOTÓN
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                //DETECTA EL MOUSE CERCA DEL BOTÓN SIN NECESIDAD DE PRESIONARLO
            }
            @Override
            public void mouseExited(MouseEvent e) {
                //DETECTA EL MOUSE CUANDO SE SALGA DEL BOTON SIN NECESIDAD DE PRESIONAR
            }
        };
        boton1.addMouseListener(oyenteDeRatonPrincipal);
    }
    private void eventoMovimientoDeRaton1(){
        MouseMotionListener oyenteDeMovimientoDeRatonPrincipal = new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                //DETECTA CUANDO EL MAOUSE ESTÁ DENTRO DEL CONTENERDOR SELECCIONANDO ALGO
                areaDeTexto1.append("MOUSE DRAGGED"+"\n");
            }
            @Override
            public void mouseMoved(MouseEvent e) {
                //DETECTA CUANDO EL MAOUSE ESTÁ DENTRO DEL CONTENERDOR SIN SELECCIONAR NADA
                areaDeTexto1.append("MOUSE MOVED"+"\n");
            }
        };
        panelPrincipal.addMouseMotionListener(oyenteDeMovimientoDeRatonPrincipal);
    }
    private void eventoScrollDeRaton1(){
        MouseWheelListener oyenteDeScrollDeRatonPrincipal = new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                //areaDeTexto1.append("MOUSE WHEEL MOVED"+"\n");                //DEFAULT
                if(e.getPreciseWheelRotation() == -1){
                    areaDeTexto1.append("MOUSE WHEEL UP"+"\n");                 //VALOR NEGATIVO CUALQUIERA [ARRIBA]
                }
                if(e.getPreciseWheelRotation() == 1){                           //VALOR POSITIVO CUALQUIERA [ABAJO]
                    areaDeTexto1.append("MOUSE WHEEL DOWN"+"\n");
                }
            }
        };
        panelPrincipal.addMouseWheelListener(oyenteDeScrollDeRatonPrincipal);
    }
}