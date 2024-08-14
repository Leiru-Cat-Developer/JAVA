package Funciones_Principales;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
public class VentanaContactos extends javax.swing.JDialog {
    DefaultTableModel nuevoModelo = new DefaultTableModel();
    public VentanaContactos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        cargarNuevoModeloDeTabla();
        initComponents();
        this.setSize(900, 450);
        this.setLocationRelativeTo(null);
    }
    private void cargarNuevoModeloDeTabla(){
        nuevoModelo.addColumn("NOMBRE");
        nuevoModelo.addColumn("CELULAR");
        nuevoModelo.addColumn("CORREO");
        leerArchivoDeTexto();
    }
    private void leerArchivoDeTexto(){
        String cadena = "", fila[];
        try {
            FileReader lector = new FileReader("Archivo Contactos.txt");
            BufferedReader lectura = new BufferedReader(lector);
            cadena = lectura.readLine();
            while(cadena != null){
                fila = cadena.split("%");                                       //CORTA CUANDO ENCUENTRA '%'
                nuevoModelo.addRow(fila);
                cadena = lectura.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.err.println("EL ARCHIVO NO SE PUDO ABIR, PARA MOSTRARLO EN LA TABLA");
        } catch (IOException ex){
            System.err.println("EL ARCHIVO NO SE PUDO ABIR, PARA MOSTRARLO EN LA TABLA");
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelPrincipal = new javax.swing.JPanel();
        etiquetaTitulo = new javax.swing.JLabel();
        tablaParaVisualizarContactos = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CONTACTOS AGREGADOS");

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 204));
        panelPrincipal.setLayout(new java.awt.GridBagLayout());

        etiquetaTitulo.setBackground(new java.awt.Color(0, 0, 0));
        etiquetaTitulo.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTitulo.setText("CONTACTOS AGREGADOS");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        panelPrincipal.add(etiquetaTitulo, gridBagConstraints);

        tabla1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tabla1.setModel(nuevoModelo);
        tablaParaVisualizarContactos.setViewportView(tabla1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panelPrincipal.add(tablaParaVisualizarContactos, gridBagConstraints);

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton1.setText("REGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        panelPrincipal.add(jButton1, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(VentanaContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaContactos dialog = new VentanaContactos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTable tabla1;
    private javax.swing.JScrollPane tablaParaVisualizarContactos;
    // End of variables declaration//GEN-END:variables
}