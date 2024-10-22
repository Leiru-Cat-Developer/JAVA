package Aplicacion;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class Conexion extends javax.swing.JFrame {
    //VARIABLES GLOBALES PARA LA CONEXION DE JAVA Y DE MySQL
    //'?autoReconnet=true&useSSL=false' PARA EVITAR ADVERTENCIA DE MySQL
    public static final String URL = "jdbc:mysql://localhost:3306/escuela?autoReconnet=true&useSSL=false";
    public static final String USUARIO = "root";
    public static final String CONTRASEÑA = "123456789";
    public Conexion() {
        initComponents();
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
        java.awt.GridBagConstraints gridBagConstraints;

        panelPrincipal = new javax.swing.JPanel();
        etiquetaTitulo = new javax.swing.JLabel();
        botonConectar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conexion");
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        panelPrincipal.setLayout(new java.awt.GridBagLayout());

        etiquetaTitulo.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTitulo.setText("ESTABLECER CONEXION");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        panelPrincipal.add(etiquetaTitulo, gridBagConstraints);

        botonConectar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonConectar.setText("CONECTAR");
        botonConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConectarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        panelPrincipal.add(botonConectar, gridBagConstraints);

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
    private void botonConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConectarActionPerformed
        Connection conexion = getConnection();                                  //GUARDA VALOR DE LA CONEXION
        PreparedStatement pst;                  //IMPORTACION NECESARIA MySQL
        ResultSet rst;                          //IMPORTACION NECESARIA MySQL
        try {
            pst = conexion.prepareStatement("select * from persona");           //CONSULTA
            rst = pst.executeQuery();                                           //EJECUCION
            if(rst.next()){
                JOptionPane.showMessageDialog(null,"Nombre: "+rst.getString("nombre")
                                                  +"\nDomicilio: "+rst.getString("domicilio")
                                                  +"\nCelular: "+rst.getString("celular")
                                                  +"\nCorreo Electronico: "+rst.getString("correoElectronico")
                                                  +"\nFecha Nacimiento: "+String.valueOf(rst.getDate("fechaNacimiento"))
                                                  +"\nGenero: "+rst.getString("genero"));
            }else {
                JOptionPane.showMessageDialog(null, "NO EXISTE NINGUN REGISTRO");
            }
            conexion.close();
        } catch (Exception ex) {
            System.out.println("ERROR: "+ex);
        }
    }//GEN-LAST:event_botonConectarActionPerformed
    public Connection getConnection(){
        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
            JOptionPane.showMessageDialog(null, "CONEXION ESTABLECIDA");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR ... CONEXION INCORRECTA");
        }
        return conexion;
    }
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
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conexion().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonConectar;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}