package Vista;
import Modelo.Cifrar_Contraseña;
import Modelo.SQL_Usuario;
import Modelo.Usuario;
import java.awt.Dimension;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
public class IniciarSesion extends javax.swing.JFrame {
    public IniciarSesion() {
        initComponents();
        this.setSize(new Dimension(500, 500));
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        textoIniciarSesionPrograma = new javax.swing.JLabel();
        textoUsuario = new javax.swing.JLabel();
        textoContraseña = new javax.swing.JLabel();
        textFieldUsuario = new javax.swing.JTextField();
        passwordFieldContraseña = new javax.swing.JPasswordField();
        botonIniciarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("INICIAR SESION");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        textoIniciarSesionPrograma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoIniciarSesionPrograma.setText("INICIAR SESION EN EL PROGRAMA");

        textoUsuario.setText("USURARIO:");

        textoContraseña.setText("CONTRASEÑA:");

        botonIniciarSesion.setText("INICIAR SESION");
        botonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoIniciarSesionPrograma, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoUsuario)
                            .addComponent(textoContraseña))
                        .addGap(30, 30, 30)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldUsuario)
                            .addComponent(passwordFieldContraseña)))
                    .addComponent(botonIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(textoIniciarSesionPrograma)
                .addGap(43, 43, 43)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoUsuario)
                    .addComponent(textFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoContraseña)
                    .addComponent(passwordFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(botonIniciarSesion)
                .addGap(45, 45, 45))
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
    private void botonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarSesionActionPerformed
        Usuario usuario = new Usuario();
        SQL_Usuario sql_usuario = new SQL_Usuario();
        Date date = new Date();
        DateFormat fechaHora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");     //COLOCAR EXACTAMENTE IGUAL
        String contraseña = new String(passwordFieldContraseña.getPassword());
        if((textFieldUsuario.getText().isEmpty()) || (contraseña.isEmpty())){
            JOptionPane.showMessageDialog(null, "POR FAVOR RELLENE TODOS LOS CAMPOS");
        }else{
            String contraseñaCifradaMD5 = Cifrar_Contraseña.md5(contraseña);
            usuario.setNombreUsuario(textFieldUsuario.getText());
            usuario.setContraseña(contraseñaCifradaMD5);
            usuario.setUltima_sesion(fechaHora.format(date));                   //FORMATO DE HORA
            if(sql_usuario.iniciarSesion(usuario)){
                Inicio.iniciarSesion = null;
                this.dispose();
                Programa programa = new Programa(usuario);
                programa.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "LOS DATOS SON INCORRECTOS");
            }
        }
    }//GEN-LAST:event_botonIniciarSesionActionPerformed
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Inicio.iniciarSesion = null;
    }//GEN-LAST:event_formWindowClosing
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
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIniciarSesion;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPasswordField passwordFieldContraseña;
    private javax.swing.JTextField textFieldUsuario;
    private javax.swing.JLabel textoContraseña;
    private javax.swing.JLabel textoIniciarSesionPrograma;
    private javax.swing.JLabel textoUsuario;
    // End of variables declaration//GEN-END:variables
}