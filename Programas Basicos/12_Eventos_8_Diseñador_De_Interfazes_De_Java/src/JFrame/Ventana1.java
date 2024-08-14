package JFrame;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
public class Ventana1 extends javax.swing.JFrame {
    //METODOS EXTRA
    private DefaultComboBoxModel<Persona> modeloComboBox = new DefaultComboBoxModel<Persona>();
    private DefaultTableModel modeloTabla = new DefaultTableModel();
    public Ventana1() {
        //INICIO DE PROGRAMA
        llenarModeloComboBox();
        agregarDatosDeTabla();
        initComponents();
        //INICIO DE CONDICIONES DE PANTALLA DESPUES DE INICIALIZAR LA VENTANA
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Agregar Personas");
    }
    private void llenarModeloComboBox(){
        // ¡ AGREGAR EL METODO TO STRING EN CLASE PERSONA PARA PODER VISUALIZARLO !
        modeloComboBox.addElement(new Persona("URIEL","MALDONADO AVALOS","thehambuerger2001@gmail.com","5533557138","CALLE 13"));
        modeloComboBox.addElement(new Persona("DANIEL","SANCHEZ FLORES","daniel.sanchez@gmail.com","11121428121","AV SIEMPRE VIVA"));
        modeloComboBox.addElement(new Persona("VICENTE","GOMEZ TABOADA","gtc.231@hotmail.com","2414612724","HUSTON"));
        modeloComboBox.addElement(new Persona("FERNANDO","FERNANDO ANGLE","fern.ando@hotmail.com","2421469","AV ROBLE"));
        modeloComboBox.addElement(new Persona("KARLA","MONDRAGON RODRIGUEZ","mondragonR@gmail.com","12648746217","AV CUAUTEMOC"));
        modeloComboBox.addElement(new Persona("KARLA GABRIELA","RAMIREZ RODRIGUEZ","gabyrodriguez@gmail.com","2321873627","AV CUATEMOC"));
        modeloComboBox.addElement(new Persona("CARMEN","FRAGA HERNANDEZ","crmfraga@gmail.com","6274164721","CALLE 65372"));
        modeloComboBox.addElement(new Persona("RODRIGO","RAMIREZ HORTEGA","ghauieh@yahoo.com.mx","4218467271","CALLE fahefaaefu"));
        modeloComboBox.addElement(new Persona("ZEUS","KRATOS ATREUS","soygriego@gmail.com","5555555555","CALLE GRECIA"));
        modeloComboBox.addElement(new Persona("CARLOS JUANO","PEREZ PEREZ","soynuevo@yahoo.com.mx","6666666666","CALLE 13"));
    }
    private void agregarDatosDeTabla(){
        modeloTabla.addColumn("NOMBRES");
        modeloTabla.addColumn("APELLIDOS");
        modeloTabla.addColumn("E-MAIL");
        modeloTabla.addColumn("CELULAR");
        modeloTabla.addColumn("DIRECCION");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        etiquetaTitulo = new javax.swing.JLabel();
        comboBoxPersonas = new javax.swing.JComboBox<>();
        buttonInsertar = new javax.swing.JButton();
        scrollPaneTabla = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        Separator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cajaDeTextoNombre = new javax.swing.JTextField();
        cajaDeTextoApellido = new javax.swing.JTextField();
        cajaDeTextoEmail = new javax.swing.JTextField();
        cajaDeTextoCelular = new javax.swing.JTextField();
        cajaDeTextoDireccion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        etiquetaTitulo.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        etiquetaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTitulo.setText("PERSONA");

        comboBoxPersonas.setModel(modeloComboBox);
        comboBoxPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPersonasActionPerformed(evt);
            }
        });

        buttonInsertar.setText("INSERTAR PERSONA");
        buttonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInsertarActionPerformed(evt);
            }
        });

        tabla1.setModel(modeloTabla);
        ListSelectionListener oyenteDeSeleccionTabla1 = new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(e.getValueIsAdjusting()){
                    int numeroDeFila = tabla1.getSelectedRow();
                    //OBTENER VALORES DE CADA COLUMNA, DE ACUERDO A LA FILA SELECCIONADA
                    String nombres = (String) modeloTabla.getValueAt(numeroDeFila, 0);
                    String apellidos = (String) modeloTabla.getValueAt(numeroDeFila, 1);
                    String email = (String) modeloTabla.getValueAt(numeroDeFila, 2);
                    String celular = (String) modeloTabla.getValueAt(numeroDeFila, 3);
                    String direccion = (String) modeloTabla.getValueAt(numeroDeFila, 4);

                    cajaDeTextoNombre.setText(nombres);
                    cajaDeTextoApellido.setText(apellidos);
                    cajaDeTextoEmail.setText(email);
                    cajaDeTextoCelular.setText(celular);
                    cajaDeTextoDireccion.setText(direccion);
                }
            }
        };
        tabla1.getSelectionModel().addListSelectionListener(oyenteDeSeleccionTabla1);
        scrollPaneTabla.setViewportView(tabla1);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setText("Datos de de la persona");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Email");

        jLabel5.setText("Celular");

        jLabel6.setText("Direccion");

        cajaDeTextoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaDeTextoNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(etiquetaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Separator1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createSequentialGroup()
                            .addComponent(comboBoxPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                            .addComponent(buttonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(scrollPaneTabla, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(30, 30, 30)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cajaDeTextoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                            .addComponent(cajaDeTextoApellido)
                            .addComponent(cajaDeTextoEmail)
                            .addComponent(cajaDeTextoCelular)
                            .addComponent(cajaDeTextoDireccion))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(scrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cajaDeTextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cajaDeTextoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cajaDeTextoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cajaDeTextoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cajaDeTextoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void cajaDeTextoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaDeTextoNombreActionPerformed
        //VACIO
    }//GEN-LAST:event_cajaDeTextoNombreActionPerformed
    private void comboBoxPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPersonasActionPerformed
        //VACIO
    }//GEN-LAST:event_comboBoxPersonasActionPerformed
    private void buttonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInsertarActionPerformed
        Persona P = (Persona) comboBoxPersonas.getSelectedItem();
        String nombre = P.getNombre();
        String apellidos = P.getApellidos();
        String email = P.getEmail();
        String celular = P.getCelular();
        String direccion = P.getDireccion();
        String [] persona = {nombre,apellidos,email,celular,direccion};
        modeloTabla.addRow(persona);
    }//GEN-LAST:event_buttonInsertarActionPerformed
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //COMENTAMOS LOS RESULTADOS DE TRY CATCH PARA EVITAR INCOMBENIENTES EN LA PANTALLA
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(Ventana1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            //Logger.getLogger(Ventana1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            //Logger.getLogger(Ventana1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            //Logger.getLogger(Ventana1.class.getName()).log(Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Separator1;
    private javax.swing.JButton buttonInsertar;
    private javax.swing.JTextField cajaDeTextoApellido;
    private javax.swing.JTextField cajaDeTextoCelular;
    private javax.swing.JTextField cajaDeTextoDireccion;
    private javax.swing.JTextField cajaDeTextoEmail;
    private javax.swing.JTextField cajaDeTextoNombre;
    private javax.swing.JComboBox<Persona> comboBoxPersonas;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JScrollPane scrollPaneTabla;
    private javax.swing.JTable tabla1;
    // End of variables declaration//GEN-END:variables
}