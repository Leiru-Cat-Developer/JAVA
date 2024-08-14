package Funciones_Principales;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
public class Ventana extends JFrame {
    //ATRIBUTOS
    private JPanel panelPrincipal;
    private JRadioButton radioBoton1;
    private JRadioButton radioBoton2;
    private JRadioButton radioBoton3;
    private JRadioButton radioBoton4;
    private JLabel colocarImagen;
    //METODOS
    public Ventana(){
        //CONSTRUCTOR
        this.setSize(1000, 400);
        this.setTitle("Ejercicio 2 - Radio Botones");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        //INICIO DE PROGRAMA
        iniciarComponentes();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void iniciarComponentes(){
        colocarPaneles();
        colocarEtiquetas();
        colocarRadioBotones();
    }
    private void colocarPaneles() {
        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(null);
        this.getContentPane().add(panelPrincipal);
    }
    private void colocarEtiquetas() {
        JLabel etiqueta1 = new JLabel("ESCOGE TU DEPORTE FAVORITO", SwingConstants.CENTER);
        etiqueta1.setFont(new Font("Arial", 2, 20));
        etiqueta1.setBounds(50, 20, 350, 60);
        panelPrincipal.add(etiqueta1);
    }
    private void colocarRadioBotones(){
        //RADIOBOTON 1
        radioBoton1 = new JRadioButton("F U T B O L");
        radioBoton1.setFont(new Font("Arial", 2, 18));
        radioBoton1.setBounds(50, 100, 300, 50);
        //RADIOBOTON 2
        radioBoton2 = new JRadioButton("B A L O N C E S T O");
        radioBoton2.setFont(new Font("Arial", 2, 18));
        radioBoton2.setBounds(50, 150, 300, 50);
        //RADIOBOTON 3
        radioBoton3 = new JRadioButton("T E N I S");
        radioBoton3.setFont(new Font("Arial", 2, 18));
        radioBoton3.setBounds(50, 200, 300, 50);
        //RADIOBOTON 4
        radioBoton4 = new JRadioButton("N A T A C I O N");
        radioBoton4.setFont(new Font("Arial", 2, 18));
        radioBoton4.setBounds(50, 250, 300, 50);
        
        ButtonGroup grupoDeRadioBotonesPrincipal = new ButtonGroup();
        grupoDeRadioBotonesPrincipal.add(radioBoton1);
        grupoDeRadioBotonesPrincipal.add(radioBoton2);
        grupoDeRadioBotonesPrincipal.add(radioBoton3);
        grupoDeRadioBotonesPrincipal.add(radioBoton4);
        
        panelPrincipal.add(radioBoton1);
        panelPrincipal.add(radioBoton2);
        panelPrincipal.add(radioBoton3);
        panelPrincipal.add(radioBoton4);
        oyenteDeAccionColocarImagen();
    }
    private void oyenteDeAccionColocarImagen(){
        //RADIO BOTON 1
        colocarImagen = new JLabel();
        colocarImagen.setBounds(500, 100, 400, 240);
        panelPrincipal.add(colocarImagen);
        //FORMA CORRECTAR DE COLOCAR UNA IMAGEN, PARA QUE CUANDO CREEMOS UN EJECUTABLE, ESTAS IMAGENES SE INCLUYAN
        final ImageIcon icono1 = new ImageIcon(getClass().getResource("/Imagenes/futbol.jpg"));
        ActionListener oyenteDeAccion1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //EN CASO DE SELECCIONAR OPCION 1
                colocarImagen.setIcon(new ImageIcon(icono1.getImage().getScaledInstance(colocarImagen.getWidth(), colocarImagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        radioBoton1.addActionListener(oyenteDeAccion1);
        
        //RADIO BOTON 2
        colocarImagen = new JLabel();
        colocarImagen.setBounds(500, 100, 400, 240);
        panelPrincipal.add(colocarImagen);
        //FORMA CORRECTAR DE COLOCAR UNA IMAGEN, PARA QUE CUANDO CREEMOS UN EJECUTABLE, ESTAS IMAGENES SE INCLUYAN
        final ImageIcon icono2 = new ImageIcon(getClass().getResource("/Imagenes/baloncesto.jpg"));
        ActionListener oyenteDeAccion2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //EN CASO DE SELECCIONAR OPCION 2
                colocarImagen.setIcon(new ImageIcon(icono2.getImage().getScaledInstance(colocarImagen.getWidth(), colocarImagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        radioBoton2.addActionListener(oyenteDeAccion2);
        
        //RADIO BOTON 3
        colocarImagen = new JLabel();
        colocarImagen.setBounds(500, 100, 400, 240);
        panelPrincipal.add(colocarImagen);
        //FORMA CORRECTAR DE COLOCAR UNA IMAGEN, PARA QUE CUANDO CREEMOS UN EJECUTABLE, ESTAS IMAGENES SE INCLUYAN
        final ImageIcon icono3 = new ImageIcon(getClass().getResource("/Imagenes/tenis.jpg"));
        ActionListener oyenteDeAccion3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //EN CASO DE SELECCIONAR OPCION 3
                colocarImagen.setIcon(new ImageIcon(icono3.getImage().getScaledInstance(colocarImagen.getWidth(), colocarImagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        radioBoton3.addActionListener(oyenteDeAccion3);
        
        //RADIO BOTON 4
        colocarImagen = new JLabel();
        colocarImagen.setBounds(500, 100, 400, 240);
        panelPrincipal.add(colocarImagen);
        //FORMA CORRECTAR DE COLOCAR UNA IMAGEN, PARA QUE CUANDO CREEMOS UN EJECUTABLE, ESTAS IMAGENES SE INCLUYAN
        final ImageIcon icono4 = new ImageIcon(getClass().getResource("/Imagenes/natacion.jpg"));
        ActionListener oyenteDeAccion4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //EN CASO DE SELECCIONAR OPCION 4
                colocarImagen.setIcon(new ImageIcon(icono4.getImage().getScaledInstance(colocarImagen.getWidth(), colocarImagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        radioBoton4.addActionListener(oyenteDeAccion4);
    }
}