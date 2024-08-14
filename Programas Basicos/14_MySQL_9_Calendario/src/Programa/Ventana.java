package Programa;
import Modelo.Clase_Conexion;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
public class Ventana extends javax.swing.JFrame {
    public Ventana() {
        initComponents();
        this.setSize(new Dimension(600, 500));
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

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        panelPrincipal = new javax.swing.JPanel();
        seleccionarFecha = new com.toedter.calendar.JDateChooser();
        botonMostrarFecha = new javax.swing.JButton();
        botonInsertarFecha = new javax.swing.JButton();
        botonCargarFecha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALENDARIO");
        setPreferredSize(new java.awt.Dimension(600, 500));
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(0, 0, 0));

        botonMostrarFecha.setText("MOSTRAR FECHA");
        botonMostrarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarFechaActionPerformed(evt);
            }
        });

        botonInsertarFecha.setText("INSERTAR FECHA");
        botonInsertarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarFechaActionPerformed(evt);
            }
        });

        botonCargarFecha.setText("CARGAR FECHA");
        botonCargarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seleccionarFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(botonMostrarFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addComponent(botonCargarFecha)
                        .addGap(73, 73, 73)
                        .addComponent(botonInsertarFecha)))
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(seleccionarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 309, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonMostrarFecha)
                    .addComponent(botonInsertarFecha)
                    .addComponent(botonCargarFecha))
                .addContainerGap())
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
    private void botonMostrarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarFechaActionPerformed
        Date date = seleccionarFecha.getDate();                                 //OBTENIENDO FECHA SELECCIONADA
        long d = date.getTime();
        java.sql.Date fecha = new java.sql.Date(d);                             //FORMATO DE FECHA
        JOptionPane.showMessageDialog(null, fecha);
    }//GEN-LAST:event_botonMostrarFechaActionPerformed
    private void botonInsertarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarFechaActionPerformed
        Clase_Conexion con = new Clase_Conexion();
        PreparedStatement ps = null;
        Date date = seleccionarFecha.getDate();                                 //OBTENIENDO FECHA SELECCIONADA
        long d = date.getTime();
        java.sql.Date fecha = new java.sql.Date(d);                             //FORMATO DE FECHA
        try {
            Connection conexion = con.getConnection();
            ps = conexion.prepareStatement("insert into tablafecha (fecha) values (?)");
            ps.setDate(1, fecha);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "FECHA INSERTADA CORRECTAMENTE");
            conexion.close();
        } catch (Exception e) {
            System.err.println("ERROR AL INSERTAR FECHA");
        }
    }//GEN-LAST:event_botonInsertarFechaActionPerformed
    private void botonCargarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarFechaActionPerformed
        Clase_Conexion con = new Clase_Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Connection conexion = con.getConnection();
            ps = conexion.prepareStatement("select fecha from tablafecha where idfecha=?");
            ps.setInt(1, 2);
            rs = ps.executeQuery();
            while(rs.next()){
                seleccionarFecha.setDate(rs.getDate("fecha"));
            }
            conexion.close();
        } catch (Exception e) {
            System.err.println("ERROR AL BUSCAR FECHA");
        }
    }//GEN-LAST:event_botonCargarFechaActionPerformed
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
    private javax.swing.JButton botonCargarFecha;
    private javax.swing.JButton botonInsertarFecha;
    private javax.swing.JButton botonMostrarFecha;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JPanel panelPrincipal;
    private com.toedter.calendar.JDateChooser seleccionarFecha;
    // End of variables declaration//GEN-END:variables
}