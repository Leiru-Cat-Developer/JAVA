package Funciones_Principales;
import java.awt.Color;
public class Ventana extends javax.swing.JFrame {
    public Ventana() {
        initComponents();
        this.setLocationRelativeTo(null);
        //GRUPO DE RADIO BOTONES
        grupoDeRadioBotones1.add(radioBoton1);
        grupoDeRadioBotones1.add(radioBoton2);
        grupoDeRadioBotones1.add(radioBoton3);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoDeRadioBotones1 = new javax.swing.ButtonGroup();
        menuClickDerecho1 = new javax.swing.JPopupMenu();
        menu2 = new javax.swing.JMenu();
        cambiarColorPanelRojo = new javax.swing.JMenuItem();
        cambiarColorPanelAzul = new javax.swing.JMenuItem();
        cambiarColorPanelDefault = new javax.swing.JMenuItem();
        separador3 = new javax.swing.JPopupMenu.Separator();
        menuItem3 = new javax.swing.JMenuItem();
        menuItem4 = new javax.swing.JMenuItem();
        panelPrincipal = new javax.swing.JPanel();
        barraDeMenu1 = new javax.swing.JMenuBar();
        menu1 = new javax.swing.JMenu();
        menuItem1 = new javax.swing.JMenuItem();
        menuDesplegable1 = new javax.swing.JMenu();
        checkBox1 = new javax.swing.JCheckBoxMenuItem();
        checkBox2 = new javax.swing.JCheckBoxMenuItem();
        separador2 = new javax.swing.JPopupMenu.Separator();
        radioBoton1 = new javax.swing.JRadioButtonMenuItem();
        radioBoton2 = new javax.swing.JRadioButtonMenuItem();
        radioBoton3 = new javax.swing.JRadioButtonMenuItem();
        separador1 = new javax.swing.JPopupMenu.Separator();
        menuItem2 = new javax.swing.JMenuItem();

        menuClickDerecho1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuClickDerecho1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menuClickDerecho1MouseReleased(evt);
            }
        });

        menu2.setText("Cambiar Color");

        cambiarColorPanelRojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoRojo.png"))); // NOI18N
        cambiarColorPanelRojo.setText("Rojo");
        cambiarColorPanelRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarColorPanelRojoActionPerformed(evt);
            }
        });
        menu2.add(cambiarColorPanelRojo);

        cambiarColorPanelAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoAzul.png"))); // NOI18N
        cambiarColorPanelAzul.setText("Azul");
        cambiarColorPanelAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarColorPanelAzulActionPerformed(evt);
            }
        });
        menu2.add(cambiarColorPanelAzul);

        cambiarColorPanelDefault.setText("Default");
        cambiarColorPanelDefault.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarColorPanelDefaultActionPerformed(evt);
            }
        });
        menu2.add(cambiarColorPanelDefault);

        menuClickDerecho1.add(menu2);
        menuClickDerecho1.add(separador3);

        menuItem3.setText("Maximizar");
        menuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem3ActionPerformed(evt);
            }
        });
        menuClickDerecho1.add(menuItem3);

        menuItem4.setText("Minimizar");
        menuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem4ActionPerformed(evt);
            }
        });
        menuClickDerecho1.add(menuItem4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(239, 239, 239));
        panelPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelPrincipalMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );

        menu1.setText("Desplegar Menú");

        menuItem1.setText("Iniciar");
        menu1.add(menuItem1);

        menuDesplegable1.setText("Escoger");

        checkBox1.setSelected(true);
        checkBox1.setText("Opción 1");
        menuDesplegable1.add(checkBox1);

        checkBox2.setSelected(true);
        checkBox2.setText("Opción2");
        menuDesplegable1.add(checkBox2);
        menuDesplegable1.add(separador2);

        radioBoton1.setSelected(true);
        radioBoton1.setText("Selección 1");
        menuDesplegable1.add(radioBoton1);

        radioBoton2.setSelected(true);
        radioBoton2.setText("Selección 2");
        menuDesplegable1.add(radioBoton2);

        radioBoton3.setSelected(true);
        radioBoton3.setText("Selección 3");
        menuDesplegable1.add(radioBoton3);

        menu1.add(menuDesplegable1);
        menu1.add(separador1);

        menuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCerrar.png"))); // NOI18N
        menuItem2.setText("Salir");
        menuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem2ActionPerformed(evt);
            }
        });
        menu1.add(menuItem2);

        barraDeMenu1.add(menu1);

        setJMenuBar(barraDeMenu1);

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
    private void menuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuItem2ActionPerformed
    private void menuClickDerecho1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuClickDerecho1MousePressed
        //VACIO
    }//GEN-LAST:event_menuClickDerecho1MousePressed
    private void menuClickDerecho1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuClickDerecho1MouseReleased
        //VACIO
    }//GEN-LAST:event_menuClickDerecho1MouseReleased
    private void menuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem3ActionPerformed
        this.setSize(1000, 600);
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_menuItem3ActionPerformed
    private void menuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem4ActionPerformed
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_menuItem4ActionPerformed
    private void panelPrincipalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPrincipalMouseReleased
        if(evt.isPopupTrigger()){
            menuClickDerecho1.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_panelPrincipalMouseReleased
    private void cambiarColorPanelRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarColorPanelRojoActionPerformed
        panelPrincipal.setBackground(Color.RED);
    }//GEN-LAST:event_cambiarColorPanelRojoActionPerformed
    private void cambiarColorPanelAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarColorPanelAzulActionPerformed
        panelPrincipal.setBackground(Color.BLUE);
    }//GEN-LAST:event_cambiarColorPanelAzulActionPerformed
    private void cambiarColorPanelDefaultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarColorPanelDefaultActionPerformed
        panelPrincipal.setBackground(new Color(239,239,239));
    }//GEN-LAST:event_cambiarColorPanelDefaultActionPerformed
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraDeMenu1;
    private javax.swing.JMenuItem cambiarColorPanelAzul;
    private javax.swing.JMenuItem cambiarColorPanelDefault;
    private javax.swing.JMenuItem cambiarColorPanelRojo;
    private javax.swing.JCheckBoxMenuItem checkBox1;
    private javax.swing.JCheckBoxMenuItem checkBox2;
    private javax.swing.ButtonGroup grupoDeRadioBotones1;
    private javax.swing.JMenu menu1;
    private javax.swing.JMenu menu2;
    private javax.swing.JPopupMenu menuClickDerecho1;
    private javax.swing.JMenu menuDesplegable1;
    private javax.swing.JMenuItem menuItem1;
    private javax.swing.JMenuItem menuItem2;
    private javax.swing.JMenuItem menuItem3;
    private javax.swing.JMenuItem menuItem4;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JRadioButtonMenuItem radioBoton1;
    private javax.swing.JRadioButtonMenuItem radioBoton2;
    private javax.swing.JRadioButtonMenuItem radioBoton3;
    private javax.swing.JPopupMenu.Separator separador1;
    private javax.swing.JPopupMenu.Separator separador2;
    private javax.swing.JPopupMenu.Separator separador3;
    // End of variables declaration//GEN-END:variables
}
