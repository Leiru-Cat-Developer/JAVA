package Vista;
public class JFrame_Vista extends javax.swing.JFrame {
    public JFrame_Vista() {
        initComponents();
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
        etiquetaNumero1 = new javax.swing.JLabel();
        etiquetaNumero2 = new javax.swing.JLabel();
        etiquetaResultado = new javax.swing.JLabel();
        textFieldNumero1 = new javax.swing.JTextField();
        textFieldNumero2 = new javax.swing.JTextField();
        textFieldResultado = new javax.swing.JTextField();
        botonSumar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        panelPrincipal.setLayout(new java.awt.GridBagLayout());

        etiquetaTitulo.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTitulo.setText("SUMA 2 NÚMEROS");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        panelPrincipal.add(etiquetaTitulo, gridBagConstraints);

        etiquetaNumero1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        etiquetaNumero1.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaNumero1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaNumero1.setText("NÚMERO 1:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        panelPrincipal.add(etiquetaNumero1, gridBagConstraints);

        etiquetaNumero2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        etiquetaNumero2.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaNumero2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaNumero2.setText("NÚMERO 2:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        panelPrincipal.add(etiquetaNumero2, gridBagConstraints);

        etiquetaResultado.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        etiquetaResultado.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaResultado.setText("RESULTADO:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        panelPrincipal.add(etiquetaResultado, gridBagConstraints);

        textFieldNumero1.setBackground(new java.awt.Color(255, 255, 255));
        textFieldNumero1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textFieldNumero1.setForeground(new java.awt.Color(0, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        panelPrincipal.add(textFieldNumero1, gridBagConstraints);

        textFieldNumero2.setBackground(new java.awt.Color(255, 255, 255));
        textFieldNumero2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textFieldNumero2.setForeground(new java.awt.Color(0, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        panelPrincipal.add(textFieldNumero2, gridBagConstraints);

        textFieldResultado.setBackground(new java.awt.Color(255, 255, 255));
        textFieldResultado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textFieldResultado.setForeground(new java.awt.Color(0, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        panelPrincipal.add(textFieldResultado, gridBagConstraints);

        botonSumar.setBackground(new java.awt.Color(0, 0, 0));
        botonSumar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        botonSumar.setForeground(new java.awt.Color(255, 255, 255));
        botonSumar.setText("SUMAR");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        panelPrincipal.add(botonSumar, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
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
            java.util.logging.Logger.getLogger(JFrame_Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Vista().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonSumar;
    private javax.swing.JLabel etiquetaNumero1;
    private javax.swing.JLabel etiquetaNumero2;
    private javax.swing.JLabel etiquetaResultado;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JPanel panelPrincipal;
    public javax.swing.JTextField textFieldNumero1;
    public javax.swing.JTextField textFieldNumero2;
    public javax.swing.JTextField textFieldResultado;
    // End of variables declaration//GEN-END:variables
}