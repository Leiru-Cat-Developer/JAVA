package Funciones_Principales;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
public class Ventana extends JFrame {
    //ATRIBUTOS
    private JPanel panelPrincipal;
    private JLabel etiqueta1;
    private JButton botonRojo, botonVerde, botonAzul;
    private int botonPulsado = 0, contadorRojo = 0, contadorVerde = 0, contadorAzul = 0;
    //METODOS
    public Ventana() {
        //CONSTRUCTOR
        this.setSize(600, 400);
        this.setTitle("Ejercicio 3 - Colores RGB");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        //INICIO DE PROGRAMA
        iniciarComponentes();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void iniciarComponentes() {
        colocarPaneles();
        colocarEtiquetas();
        colocarBotones();
    }
    private void colocarPaneles() {
        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(null);
        this.getContentPane().add(panelPrincipal);
        eventoDeCambioDeColor();
    }
    private void colocarEtiquetas(){
        etiqueta1 = new JLabel("COLOR (ROJO , VERDE , AZUL)", SwingConstants.CENTER);
        etiqueta1.setFont(new Font("Arial", 0, 20));
        etiqueta1.setBounds(0, 30, 600, 50);
        panelPrincipal.add(etiqueta1);
    }
    private void colocarBotones() {
        /*
        
            BOTON PULSADO == 0 entonces es NADA
            BOTON PULSADO == 1 entonces es ROJO
            BOTON PULSADO == 2 entonces es VERDE
            BOTON PULSADO == 3 entonces es AZUL
            
        */
        
        //BOTON Rojo
        botonRojo = new JButton("ROJO");
        botonRojo.setForeground(Color.RED);
        botonRojo.setFont(new Font("Arial Rounded MT Bold", 0, 20));
        botonRojo.setBounds(50, 230, 130, 50);
        botonRojo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonPulsado = 1;
            }
        });
        //BOTON Verde
        botonVerde = new JButton("VERDE");
        botonVerde.setForeground(Color.GREEN);
        botonVerde.setFont(new Font("Arial Rounded MT Bold", 0, 20));
        botonVerde.setBounds(230, 230, 130, 50);
        botonVerde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonPulsado = 2;
            }
        });
        //BOTON Azul
        botonAzul = new JButton("AZUL");
        botonAzul.setForeground(Color.BLUE);
        botonAzul.setFont(new Font("Arial Rounded MT Bold", 0, 20));
        botonAzul.setBounds(410, 230, 130, 50);
        botonAzul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonPulsado = 3;
            }
        });
        
        panelPrincipal.add(botonRojo);
        panelPrincipal.add(botonVerde);
        panelPrincipal.add(botonAzul);
    }
    private void eventoDeCambioDeColor() {
        MouseWheelListener eventoDeCambioDeColorPrincipal = new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                if(botonPulsado != 0){
                    switch(botonPulsado){
                        case 1:     //BOTON ROJO
                                    contadorRojo += e.getWheelRotation();
                                    if(contadorRojo < 0){
                                        contadorRojo = 0;
                                    }
                                    if(contadorRojo > 255){
                                        contadorRojo = 255;
                                    }                                    
                            break;
                        case 2:     //BOTON VERDE
                                    contadorVerde += e.getWheelRotation();
                                    if(contadorVerde < 0){
                                        contadorVerde = 0;
                                    }
                                    if(contadorVerde > 255){
                                        contadorVerde = 255;
                                    }    
                            break;
                        case 3:     //BOTON AZUL
                                    contadorAzul += e.getWheelRotation();
                                    if(contadorAzul < 0){
                                        contadorAzul = 0;
                                    }
                                    if(contadorAzul > 255){
                                        contadorAzul = 255;
                                    }    
                            break;
                    }
                }
                etiqueta1.setText("COLOR (ROJO = "+contadorRojo+" , VERDE = "+contadorVerde+" , AZUL = "+ contadorAzul+")");
                panelPrincipal.setBackground(new Color(contadorRojo,contadorVerde,contadorAzul));
            }
        };
        panelPrincipal.addMouseWheelListener(eventoDeCambioDeColorPrincipal);
    }
}