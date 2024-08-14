package Funciones_Principales;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
public class VentanaInicial extends javax.swing.JFrame {
    private String jugador1 = "";
    private String jugador2 = "";
    public VentanaInicial() {
        initComponents();
        this.setSize(570, 400);
        this.setMinimumSize(new Dimension(570, 400));
        this.setLocationRelativeTo(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal1 = new FondoPanelPrincipal1();
        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaNombreJugador1 = new javax.swing.JLabel();
        etiquetaNombreJugador2 = new javax.swing.JLabel();
        cajaDeTextoJugador1 = new javax.swing.JTextField();
        cajaDeTextoJugador2 = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();
        etiquetaMuestra1 = new javax.swing.JLabel();
        etiquetaMuestra2 = new javax.swing.JLabel();
        botonComenzar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pantalla Principal");
        setResizable(false);

        panelPrincipal1.setBackground(new java.awt.Color(0, 0, 0));
        panelPrincipal1.setForeground(new java.awt.Color(255, 255, 255));

        etiquetaTitulo.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTitulo.setText("JUEGO DE GATO");

        etiquetaNombreJugador1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        etiquetaNombreJugador1.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaNombreJugador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaNombreJugador1.setText("Digite el nombre del jugador 1:");

        etiquetaNombreJugador2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        etiquetaNombreJugador2.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaNombreJugador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaNombreJugador2.setText("Digite el nombre del jugador 2:");

        cajaDeTextoJugador1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cajaDeTextoJugador1.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        cajaDeTextoJugador2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cajaDeTextoJugador2.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        botonGuardar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        botonGuardar.setText("GUARDAR");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        etiquetaMuestra1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        etiquetaMuestra1.setForeground(new java.awt.Color(255, 255, 255));

        etiquetaMuestra2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        etiquetaMuestra2.setForeground(new java.awt.Color(255, 255, 255));

        botonComenzar.setVisible(false);
        botonComenzar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        botonComenzar.setText("COMENZAR");
        botonComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComenzarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipal1Layout = new javax.swing.GroupLayout(panelPrincipal1);
        panelPrincipal1.setLayout(panelPrincipal1Layout);
        panelPrincipal1Layout.setHorizontalGroup(
            panelPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipal1Layout.createSequentialGroup()
                .addGroup(panelPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipal1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(etiquetaTitulo))
                    .addGroup(panelPrincipal1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaNombreJugador1)
                            .addComponent(etiquetaNombreJugador2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonComenzar)
                            .addGroup(panelPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cajaDeTextoJugador1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                .addComponent(cajaDeTextoJugador2))))
                    .addGroup(panelPrincipal1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(etiquetaMuestra2, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                            .addComponent(botonGuardar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaMuestra1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        panelPrincipal1Layout.setVerticalGroup(
            panelPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipal1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(etiquetaTitulo)
                .addGap(30, 30, 30)
                .addGroup(panelPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombreJugador1)
                    .addComponent(cajaDeTextoJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaDeTextoJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaNombreJugador2))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonComenzar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(etiquetaMuestra1)
                .addGap(18, 18, 18)
                .addComponent(etiquetaMuestra2)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        jugador1 = cajaDeTextoJugador1.getText();
        jugador2 = cajaDeTextoJugador2.getText();
        botonGuardar.setVisible(false);
        etiquetaMuestra1.setText(jugador1+" JUGARÁ PRIMERO CON LA FICHA 'X'");
        etiquetaMuestra2.setText(jugador2+" JUGARÁ DESPUÉS CON LA FICHA 'O'");
        botonComenzar.setVisible(true);
    }//GEN-LAST:event_botonGuardarActionPerformed
    private void botonComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComenzarActionPerformed
        VentanaJuego VJ = new VentanaJuego(jugador1, jugador2);
        VJ.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonComenzarActionPerformed
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
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicial().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonComenzar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JTextField cajaDeTextoJugador1;
    private javax.swing.JTextField cajaDeTextoJugador2;
    private javax.swing.JLabel etiquetaMuestra1;
    private javax.swing.JLabel etiquetaMuestra2;
    private javax.swing.JLabel etiquetaNombreJugador1;
    private javax.swing.JLabel etiquetaNombreJugador2;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JPanel panelPrincipal1;
    // End of variables declaration//GEN-END:variables
    class FondoPanelPrincipal1 extends JPanel{
        private Image imagen;
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/Imagenes/Gif_Procesando.gif")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
        
    }
}