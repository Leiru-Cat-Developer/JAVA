package GUI_Package;
import java.awt.Color;                                                          //PAQUETE PARA CAMBIAR COLOR DE JFRAME
import java.awt.Dimension;                                                      //PAQUETE PARA DIMENSIÓN MÍNIMA DE JFRAME
import java.awt.Font;                                                           //PAQUETE PARA CAMBIAR EL TIPO DE LETRA JLABEL
import java.awt.Image;                                                          //PAQUETE PARA PODER EDITAR IMAGENES
import javax.swing.BorderFactory;                                               //PAQUETE PARA AGREGAR BORDES EN JBUTTON
import javax.swing.ButtonGroup;                                                 //PAQUETE PARA TOGGLE BUTTON
import javax.swing.DefaultComboBoxModel;                                        //PAQUETE PARA COMBO BOX MODEL
import javax.swing.DefaultListModel;                                            //PAQUETE PARA LAS LISTAS
import javax.swing.ImageIcon;                                                   //PAQUETE PARA AGREGAR IMAGENES
import javax.swing.JButton;                                                     //PAQUETE PARA AGREGAR BOTONOES
import javax.swing.JCheckBox;                                                   //PAQUETE PARA JCHECKBOX
import javax.swing.JComboBox;                                                   //PAQUETE PARA JCOMBOBOX
import javax.swing.JFrame;                                                      //PAQUETE PARA JFRAME
import javax.swing.JLabel;                                                      //PAQUETE PARA AGREGAR LABEL EN EL JFRAME
import javax.swing.JList;                                                       //PAQUETE PARA LISTAS
import javax.swing.JPanel;                                                      //PAQUETE PARA AGREGAR PANEL EN EL JFRAME
import javax.swing.JPasswordField;                                              //PAQUETE PARA AGREGAR JPASSWORDFIELD
import javax.swing.JRadioButton;                                                //PAQUETE PARA RADIO BUTTON
import javax.swing.JScrollPane;                                                 //PAQUETE PARA SCROLL PANE
import javax.swing.JTable;                                                      //PAQUETE PARA JTABLE
import javax.swing.JTextArea;                                                   //PAQUETE PARA JTEXT AREA
import javax.swing.JTextField;                                                  //PAQUETE PARA J TEXT FIELD
import javax.swing.JToggleButton;                                               //PAQUETE PARA AGRUPAR TOGGLE BUTTON
import javax.swing.ScrollPaneConstants;                                         //PAQUETE PARA AGREGAR BARRAS DE DESPLAZAMIENTO
import javax.swing.SwingConstants;                                              //PAQUETE PARA CENTRAR TEXTO DE JLABEL
import javax.swing.table.DefaultTableModel;                                     //PAQUETE PARA TABLAS
public class Ventana extends JFrame {                                           //HEREDA CLASE JFRAME
    //ATRIBUTOS
    private JPanel JP;
    //METODOS
    public Ventana() {
    //CONSTRUCTOR
        this.setSize(600, 600);                                                 //CREAR TAMAÑO DE VENTANA [ANCHO - LARGO]
        this.setTitle("Ventana de Prueba");                                     //ESTABLECE UN TITULO EN LA VENTANA
        this.setLocationRelativeTo(null);                                       //LA PANTALLA SE EJECUTA CENTRALIZADA -- NECESITA SET SIZE
        this.setMinimumSize(new Dimension(400, 400));                           //NECESITA DE UNA IMPORTACIÓN, DEFINE TAMAÑO [LARGO - ANCHO]
        iniciarComponentes();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);                           //TERMINA EL PROGRAMA CUANDO SE CIERRA LA VENTANA
    //ES OPCIONAL COLOCAR 'this'
    }
    private void iniciarComponentes() {        
        colocarPaneles();
        colocarEtiquetas();
        colocarBotonoes();
        colocarRadioBotones();
        colocarBotonesDeActivacion();
        colocarCajasDeTexto();
        colocarAreasDeTexto();
        colocarCheckBoxes();
        colocarListasDesplegables();
        colocarCampoDeContraseña();
        colocarTablas();
        colcarListas();
    /* COMENTAR LOS METODOS QUE NO UTILICEMOS PARA QUE NO INTERFIERAN */
    }
    private void colocarPaneles(){
        JP = new JPanel();                                                      //CONSTRUCTOR DE JPANEL INSTANCIADO
        JP.setLayout(null);                                                     //DESACTIVANDO EL DISEÑO POR DEFAULT
        this.getContentPane().add(JP);                                          //AGREGAMOS EL PANEL EN LA PANTALLA
    }
    private void colocarEtiquetas() {
    //E T I Q U E T A       D E       T E X T O
        JLabel JL = new JLabel("CURSO JAVA",SwingConstants.CENTER);             //CONSTRUCTOR DE JLABEL INSTANCIADO CON INICIALIZACIÓN Y CENTRADO [APLICAN METODOS SEPARADOS]        
        JL.setForeground(Color.BLACK);                                          //CAMBIAMOS EL COLOR DEL TEXTO [COMPONENTE]
        JL.setBounds(130, 10, 300, 80);                                         //DEFINIENDO LA UBICACIÓN DEL LABEL, NECESITA DESACTIVACIÓN DE DISEÑO
    /*    'JL.setText("HOLA");' -> TAMBIEN SE PUEDE DECLARAR DE ESTÁ MANERA    */
        JL.setFont(new Font("Arial",2,20));                                     //CAMBIAR ESTILO DE LETRA [TIPO, INT, INT]
        ImageIcon icono = new ImageIcon("javaImage.png");
        JLabel imagen1 = new JLabel();                                         //AGREGANDO IMAGEN EN EL JPANEL
        imagen1.setBounds(20,80,400,400);                                       //UBICACIÓN DE LA IMAGEN + EDICIÓN DE TAMAÑO
        //ESCALAR IMAGEN, MANERA MEJOR RECOMENDADA
        imagen1.setIcon(new ImageIcon(icono.getImage().getScaledInstance(imagen1.getWidth(),imagen1.getHeight(),Image.SCALE_SMOOTH)));
        JP.add(JL);                                                             //AGREGAMOS EL LABEL EN LA PANTALLA
        JP.add(imagen1);                                                        //AGREGAMOS LA IMAGEN
    }
    private void colocarBotonoes(){
        //BOTON 1
        JButton B1 = new JButton("CLICK");                                      //CONSTRUCTOR DE JBUTTON INSTANCIADO
        B1.setEnabled(true);                                                    //SI ES 'FALSE' SE DESACTIVA Y VICEVERSA
        B1.setMnemonic('A');                                                    //ESTABLECEMOS UN ATAJO 'ALT + CARACTER'
        B1.setBounds(50, 80, 100, 40);                                          //UBICACION + EDICIÓN DE TAMAÑO
        B1.setForeground(Color.ORANGE);                                         //CAMBIAR COLOR DE LA LETRA DEL BOTÓN
        B1.setFont(new Font("Arial",Font.BOLD, 20));                            //CAMBIAR TIPO DE LETRA DEL BOTÓN [TIPO, INT, INT]  
        JP.add(B1);                                                             //AGREGANDO BOTTON 1
        //BOTON 2
        JButton B2 = new JButton("PRESS");                                      //CONSTRUCTOR DE JBUTTON INSTANCIADO
        B2.setBounds(300, 80, 100, 30);                                         //UBICACION + EDICIÓN DE TAMAÑO
        ImageIcon java = new ImageIcon("javaImage.png");                        //INSTANCIAMOS LA IMAGEN QUE QUEREMOS    
        //ESCALA IMAGEN, MANERA MEJOR RECOMENTADA [IMAGEN AGREGADA EN EL BOTTON]
        B2.setIcon(new ImageIcon(java.getImage().getScaledInstance(B2.getWidth(), B2.getHeight(), Image.SCALE_SMOOTH)));
        JP.add(B2);                                                             //AGREGANDO BOTTON 2
        //BOTON 3
        JButton B3 = new JButton();
        B3.setBounds(300, 150, 150, 50);
        B3.setBorder(BorderFactory.createLineBorder(Color.BLACK,2,true));       //AGREGANDO BORDE DE COLORES + ANCHO + ESQUINAS BORDEADAS [NO ES NECESARIO COLOCAR LOS 3 VALORES]
        JP.add(B3);
    }
    private void colocarRadioBotones(){
        //RADIO BOTON 1
        JRadioButton JRB1 = new JRadioButton("Opción 1",true);                  //CONSTRUCTOR DE RADIO BUTTON INSTANCIADO [TEXTO + INICIALIZACION]
        JRB1.setBounds(50, 100, 100, 50);
        //RADIO BOTON 2
        JRadioButton JRB2 = new JRadioButton("Opción 2",false);                 //CONSTRUCTOR DE RADIO BUTTON INSTANCIADO [TEXTO + INICIALIZACION]
        JRB2.setBounds(50, 150, 100, 50);
        //RADIO BOTON 3
        JRadioButton JRB3 = new JRadioButton("Opción 3",false);                 //CONSTRUCTOR DE RADIO BUTTON INSTANCIADO [TEXTO + INICIALIZACION]
        JRB3.setBounds(50, 200, 200, 50);
        JRB3.setEnabled(true);                                                  //HABILITAR O DESABILITAR RADIO BUTTON [FUNCIONA PARA CUALQUIERA]
        JRB3.setFont(new Font("COOPER BLACK", 0, 20));                          //CAMBIAR FUENTE
        //GRUPO DE RADIO BOTONES
        ButtonGroup BGR1 = new ButtonGroup();                                   //CONSTRUCTOR DE GRUPO DE RADIO BUTTON
        BGR1.add(JRB1);
        BGR1.add(JRB2);
        BGR1.add(JRB3);
        JP.add(JRB1);
        JP.add(JRB2);
        JP.add(JRB3);
    }
    private void colocarBotonesDeActivacion(){
        JToggleButton JTB1 = new JToggleButton("OPCION 1",true);
        JTB1.setBounds(50, 100, 100, 50);
        JToggleButton JTB2 = new JToggleButton("OPCION 2",false);
        JTB2.setBounds(200, 100, 100, 50);
        JToggleButton JTB3 = new JToggleButton("OPCION 3",false);
        JTB3.setBounds(350, 100, 100, 50);
        ButtonGroup JBG = new ButtonGroup();
        JBG.add(JTB1);
        JBG.add(JTB2);
        JBG.add(JTB3);
        JP.add(JTB1);
        JP.add(JTB2);
        JP.add(JTB3);
    }
    private void colocarCajasDeTexto(){
        JTextField JTF1 = new JTextField();
        JTF1.setBounds(50, 50, 100, 50);
        JP.add(JTF1);
    }
    private void colocarAreasDeTexto(){
        //AREA DE TEXTO
        JTextArea JTA1 = new JTextArea();
        JTA1.setBounds(20, 20, 300, 200);
        JTA1.append("ESCRIBE POR AQUÍ ...");                                    //ESCRIBE MÁS TEXTO INICIAL
        JTA1.setEditable(true);
        JP.add(JTA1);
        //BARRAS DE DESPLAZAMIENTO
        JScrollPane JSPs = new JScrollPane(JTA1,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);   //SE PUEDE HACER DE ESTÁ MANERA O DE OTRA [CONSULTAR METODOS EXTRAS]
        JSPs.setBounds(20, 20, 300, 200);      
        JP.add(JSPs);
    }
    private void colocarCheckBoxes(){
        //NO ES LO MISMO QUE EL RADIO BUTTON, PUES EN ESTÉ SE PUEDEN MARCAR VARIOS A LA VEZ [AUNQUE SE PUEDE USAR LA RESTRICCION]
        JCheckBox JCB1 = new JCheckBox("MILK",true);
        JCB1.setBounds(50, 50, 150, 50);
        JCB1.setEnabled(false);
        JCheckBox JCB2 = new JCheckBox("COOKIES",true);
        JCB2.setBounds(50, 150, 150, 50);
        JCB2.setEnabled(true);
        JCheckBox JCB3 = new JCheckBox("EGGS",true);
        JCB3.setBounds(50, 250, 150, 50);
        JCB2.setEnabled(true);
        JP.add(JCB1);
        JP.add(JCB2);
        JP.add(JCB3);
    }
    private void colocarListasDesplegables(){
        //COMBOBOX SIN MODEL
        String [] paises = {"ITALIA","COLOMBIA","MÉXICO"} ;
        JComboBox JCB1 = new JComboBox(paises);
        JCB1.setBounds(50, 100, 100, 30);
        JCB1.addItem("FRANCIA");                                                //AGREGA OBJETOS AL FINAL DESPUÉS DE INICIALIZAR
        JCB1.setSelectedItem("MÉXICO");                                         //SELECCIONAR EL PRIMER OBJETO QUE VEREMOS
        //COMBOBOX CON MODEL
        Persona P1 = new Persona("URIEL", 20, "MEXICANA");
        Persona P2 = new Persona("TANIA", 21, "MEXICANA");
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();               //MODELO DE LA LISTA DESPLEGABLE [ES DECIR NOS PERMITE AÑADIR COSAS PARA DESPUES SELECCIONARLAS]
        JComboBox JCB2 = new JComboBox(modelo);
        modelo.addElement(P1);
        modelo.addElement(P2);
        //CUANDO SELECCIONAMOS ALGUNAS DE LAS OPCIONES, TAMBIÉN SELECCIONAMOS LOS ATRIBUTOS DEL OBJETO, SIENDO MÁS ÚTIL
        JCB2.setBounds(50, 200, 300, 30);
        JP.add(JCB1);
        JP.add(JCB2);
    }
    private void colocarCampoDeContraseña(){
        String contraseña = "";                                                 //CREAMOS CAMPO PARA GUARDAR CONTASEA EN CASO DE IMPRIMIRLA
        JPasswordField JPF1 = new JPasswordField("programación");
        JPF1.setBounds(50, 100, 150, 30);
        JP.add(JPF1);
        //MOSTRANDO CONTRASEÑA EN CONSOLA
        for(int i=0; i<JPF1.getPassword().length; i++){
            //PODRIAMOS USAR EL METODO "TO STRING" POR DEFECTO, PERO SERÍA MENOS ESTETICO Y ENTENDIBLE
            contraseña += JPF1.getPassword()[i];
        }
        System.out.print("LA CONTRASEÑA ES: "+contraseña+"\n"); 
    }
    private void colocarTablas(){
        DefaultTableModel modelo = new DefaultTableModel();                     //INICIALIZACION
        //INICIALIZANCO COLUMNAS
        modelo.addColumn("NOMBRE");
        modelo.addColumn("APELLIDO");
        modelo.addColumn("EDAD");
        modelo.addColumn("NACIONALIDAD");
        //INICIALIZANDO FILAS
        String [] persona1 = {"Alejandro","TABOADA","23","PERUANO"};
        String [] persona2 = {"URIEL","MALDONADO","20","MEXICANO"};
        String [] persona3 = {"JUAN","MELISMA","25","ESPAÑOL"};
        modelo.addRow(persona1);        
        modelo.addRow(persona2);        
        modelo.addRow(persona3);
        //CONSTRUCTOR DE LA TABLA
        JTable JT1 = new JTable(modelo);                                        //INICIALIZACION
        JT1.setBounds(40, 100, 500, 200);
        JP.add(JT1);
        //ES NECESARIO AGREGAR EL SCROLL PARA QUE SE PUEDAN VIZUALIZAR LOS DATOS, SE AGREGA DESPUES DE LA TABLA
        JScrollPane Scroll = new JScrollPane(JT1,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);  //HACIENDO LEGIBLES LOS DATOS
        Scroll.setBounds(40, 100, 500, 200);
        JP.add(Scroll);
    }
    private void colcarListas(){
        DefaultListModel modelo = new DefaultListModel();
        Persona P1 = new Persona("URIEL", 20, "MEXICANO");
        Persona P2 = new Persona("ARIEL", 15, "MEXICANO");
        Persona P3 = new Persona("MICHEL", 18, "EUA");
        Persona P4 = new Persona("JUAN", 23, "EUROPEO");
        Persona P5 = new Persona("URIEL", 20, "MEXICANO");
        Persona P6 = new Persona("ARIEL", 15, "MEXICANO");
        Persona P7 = new Persona("MICHEL", 18, "EUA");
        Persona P8 = new Persona("JUAN", 23, "EUROPEO");
        Persona P9 = new Persona("URIEL", 20, "MEXICANO");
        Persona P10 = new Persona("ARIEL", 15, "MEXICANO");
        Persona P11 = new Persona("MICHEL", 18, "EUA");
        Persona P12 = new Persona("JUAN", 23, "EUROPEO");
        Persona P13 = new Persona("URIEL", 20, "MEXICANO");
        Persona P14 = new Persona("ARIEL", 15, "MEXICANO");
        Persona P15 = new Persona("MICHEL", 18, "EUA");
        Persona P16 = new Persona("JUAN", 23, "EUROPEO");
        Persona P17 = new Persona("URIEL", 20, "MEXICANO");
        Persona P18 = new Persona("ARIEL", 15, "MEXICANO");
        Persona P19 = new Persona("MICHEL", 18, "EUA");
        Persona P20 = new Persona("JUAN", 23, "EUROPEO");
        Persona P21 = new Persona("URIEL", 20, "MEXICANO");
        Persona P22 = new Persona("ARIEL", 15, "MEXICANO");
        Persona P23 = new Persona("MICHEL", 18, "EUA");
        Persona P24 = new Persona("JUAN", 23, "EUROPEO");
        modelo.addElement(P1);
        modelo.addElement(P2);
        modelo.addElement(P3);
        modelo.addElement(P4);
        modelo.addElement(P5);
        modelo.addElement(P6);
        modelo.addElement(P7);
        modelo.addElement(P8);
        modelo.addElement(P9);
        modelo.addElement(P10);
        modelo.addElement(P11);
        modelo.addElement(P12);
        modelo.addElement(P13);
        modelo.addElement(P14);
        modelo.addElement(P15);
        modelo.addElement(P16);
        modelo.addElement(P17);
        modelo.addElement(P18);
        modelo.addElement(P19);
        modelo.addElement(P20);
        modelo.addElement(P21);
        modelo.addElement(P22);
        modelo.addElement(P23);
        modelo.addElement(P24);
        JList Lista = new JList(modelo);
        Lista.setBounds(20, 20, 200, 300);
        JP.add(Lista);
        //AGREGAMOS SCROLL
        JScrollPane scroll = new JScrollPane(Lista,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(20, 20, 200, 300);
        JP.add(scroll);
        //AL SELECCIONAR UNA DE LAS OPCIONES, ESTAMOS SELECCIONANDO EL OBJETO COMPLETO
    }
    /*
                                M E T O D O S       E X T R A S         P A R A         V E N T A N A
        
        this.setLocation(100, 200);                                             //X(HORIZONTAL)-- Y(VERTICAL)
        this.setBounds(100, 200, 600, 400);                                     //[X(HORIZONTAL) -- Y(VERTICAL)] + [LARGO - ANGHO]
        this.setResizable(false);                                               //INHABILITA O HABILITA LA INTERACCIÓN DEL TAMAÑO CON JFRAME
        this.getContentPane().setBackground(Color.PINK);                        //NECESITA DE UNA IMPORTACIÓN, LLAMAMOS EL METODO Y COLOREAMOS 
        JP.setBackground(Color.PINK);                                           //ESTABLECEMOS EL COLOR DEL PANEL, DECLARADO EN COMPONENTES
        JL.setBackground(Color.BLACK);                                          //CAMBIA EL COLOR DEL FONDO [COMPONENTE]
        JL.setOpaque(true);                                                     //HABILITAMOS PARA QUE EL COLOR SEA VISIBLE
        B1.setText("CLICK");                                                    //OTRA FORMA DE PONER TEXTO EN EL BOTÓN
        B2.setBackground(Color.red);                                            //ESTABLECEMOS COLOR DE FONDO PARA JBUTTON
        B2.setOpaque(true);                                                     //HABILITAR FONDO DE BUTTON [DEPENDE DE VERSIONES]
        JSPs.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);      //AGREGA SCROLL CUANDO SEA NECESARIO [EXPERIMENTAR]
        JSPs.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);  //AGREGA SCROLL CUANDO SEA NECESARIO [EXPERIMENTAR]
    */
    //EN ESTÉ CASO PRACTICO SE USAN VARIABLES HORRIBLES, HAY QUE SER MÁS ESPECIFICOS LA PROXIMA VEZ
    //LAS IMAGENES SE TIENEN QUE GUARDAR EN LA MISMA CARPETA EN LA QUE ESTÁ NUESTRO PROYECTO
}