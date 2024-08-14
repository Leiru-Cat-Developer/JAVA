package Funciones_Principales;
import javax.swing.table.DefaultTableModel;
public class VentanaMostrarResultados extends javax.swing.JDialog {
    private DefaultTableModel modeloTabla = new DefaultTableModel();
    private String jugador1, jugador2;
    private int vecesQueGanoJugador1 = 0, vecesQueGanoJugador2 = 0, vecesQueEmpataron = 0;
    public VentanaMostrarResultados(java.awt.Frame parent, boolean modal, String jugador1, String jugador2, int vecesQueGanoJugador1, int vecesQueGanoJugador2, int vecesQueEmpataron) {
        super(parent, modal);
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.vecesQueGanoJugador1 = vecesQueGanoJugador1;
        this.vecesQueGanoJugador2 = vecesQueGanoJugador2;
        this.vecesQueEmpataron = vecesQueEmpataron;
        cargarDatosDeLaTabla();
        initComponents();
        this.setSize(900, 400);
        this.setLocationRelativeTo(null);
    }
    private void cargarDatosDeLaTabla(){
        //COLUMNAS PERSONALIZADAS
        modeloTabla.addColumn("PARTIDAS GANADAS POR "+jugador1);
        modeloTabla.addColumn("PARTIDAS GANADAS POR "+jugador2);
        modeloTabla.addColumn("NÚMERO DE EMPATES");
        //FILAS INICIALIZADAS
        String [] fila = {String.valueOf(vecesQueGanoJugador1),
                          String.valueOf(vecesQueGanoJugador2),
                          String.valueOf(vecesQueEmpataron)};
        modeloTabla.addRow(fila);
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaTitulo = new javax.swing.JLabel();
        scrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        botonRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        etiquetaTitulo.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTitulo.setText("TABLA DE RESULTADOS");

        tabla1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        tabla1.setModel(modeloTabla);
        scrollPane1.setViewportView(tabla1);

        botonRegresar.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        botonRegresar.setText("REGRESAR");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etiquetaTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(etiquetaTitulo)
                .addGap(18, 18, 18)
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(botonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed
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
            java.util.logging.Logger.getLogger(VentanaMostrarResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaMostrarResultados dialog = new VentanaMostrarResultados(new javax.swing.JFrame(), true, null, null, 0, 0, 0);
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
    private javax.swing.JButton botonRegresar;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JScrollPane scrollPane1;
    private javax.swing.JTable tabla1;
    // End of variables declaration//GEN-END:variables
}