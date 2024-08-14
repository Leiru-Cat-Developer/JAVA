package Funciones_Principales;
public class VentanaEscogerTurno extends javax.swing.JDialog {
    private String jugador1, jugador2;
    private String turno;
    public VentanaEscogerTurno(java.awt.Frame parent, boolean modal, String jugador1, String jugador2) {
        super(parent, modal);
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        initComponents();
        this.setSize(570, 300);
        this.setLocationRelativeTo(null);
    }
    public String getTurno() {
        return turno;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaTitulo = new javax.swing.JLabel();
        botonJugador1 = new javax.swing.JButton();
        botonJugador2 = new javax.swing.JButton();
        etiquetaDecoracion1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        etiquetaTitulo.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        etiquetaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTitulo.setText("¿QUIÉN JUGARÁ PRIMERO?");

        botonJugador1.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        botonJugador1.setText("JUGADOR 1");
        botonJugador1.setText(jugador1);
        botonJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJugador1ActionPerformed(evt);
            }
        });

        botonJugador2.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        botonJugador2.setText("JUGADOR 2");
        botonJugador2.setText(jugador2);
        botonJugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJugador2ActionPerformed(evt);
            }
        });

        etiquetaDecoracion1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        etiquetaDecoracion1.setText("¿¿??");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonJugador1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                        .addComponent(botonJugador2)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiquetaDecoracion1)
                .addGap(252, 252, 252))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(etiquetaTitulo)
                .addGap(18, 18, 18)
                .addComponent(etiquetaDecoracion1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonJugador1)
                    .addComponent(botonJugador2))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void botonJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJugador1ActionPerformed
        turno = "Jugador1";
        dispose();;
    }//GEN-LAST:event_botonJugador1ActionPerformed
    private void botonJugador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJugador2ActionPerformed
        turno = "Jugador2";
        dispose();
    }//GEN-LAST:event_botonJugador2ActionPerformed
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
            java.util.logging.Logger.getLogger(VentanaEscogerTurno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEscogerTurno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEscogerTurno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEscogerTurno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaEscogerTurno dialog = new VentanaEscogerTurno(new javax.swing.JFrame(), true, null, null);
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
    private javax.swing.JButton botonJugador1;
    private javax.swing.JButton botonJugador2;
    private javax.swing.JLabel etiquetaDecoracion1;
    private javax.swing.JLabel etiquetaTitulo;
    // End of variables declaration//GEN-END:variables
}