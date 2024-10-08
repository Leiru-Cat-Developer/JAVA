package Funciones_Principales;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
public class Ventana1 extends javax.swing.JFrame {
    private Timer tiempo;
    private int milisegundos = 0, segundos = 0, minutos = 0, horas = 0;
    private ActionListener accion = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
             milisegundos++;
            if(milisegundos == 100){
                 segundos++;
                 milisegundos = 0;
            }
            if(segundos == 60){
                 minutos++;
                 segundos = 0;
            }
            if(minutos == 60){
                 horas++;
                 minutos = 0;
            }
            actualizarEtiquetaTiempo();
        }
    };
    private void actualizarEtiquetaTiempo() {
        //OPERADOR TERNARIO PARA REINICIAR EL TIEMPO CUANDO LLEGUE A '9' EVITANDO EL REINICIO CONSTANTE
        String texto = (horas<=9?"0":"")+horas+":"+
                       (minutos<=9?"0":"")+minutos+":"+
                       (segundos<=9?"0":"")+segundos+":"+
                       (milisegundos<=9?"0":"")+milisegundos;
        etiquetaTiempo.setText(texto);
    }
    public Ventana1() {
        initComponents();
        this.setLocationRelativeTo(null);
        botonPausar.setEnabled(false);
        botonDetener.setEnabled(false);
        //CADA DIEZ MILISEGUNDOS REALIZA UNA ACCIÓN [CONSTRUCTOR TIMER]
        tiempo = new Timer(10, accion);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        etiquetaCronometro = new javax.swing.JLabel();
        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaTiempo = new javax.swing.JLabel();
        botonIniciar = new javax.swing.JButton();
        botonPausar = new javax.swing.JButton();
        botonDetener = new javax.swing.JButton();
        etiquetaFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cronometro");
        setResizable(false);

        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaCronometro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenCronometro.png"))); // NOI18N
        panelPrincipal.add(etiquetaCronometro, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 150, 150));

        etiquetaTitulo.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTitulo.setText("CRONOMETRO");
        panelPrincipal.add(etiquetaTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 260, 60));

        etiquetaTiempo.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        etiquetaTiempo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTiempo.setText("00:00:00:00");
        panelPrincipal.add(etiquetaTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 220, 60));

        botonIniciar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        botonIniciar.setText("INICIAR");
        botonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarActionPerformed(evt);
            }
        });
        panelPrincipal.add(botonIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 130, -1));

        botonPausar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        botonPausar.setText("PAUSAR");
        botonPausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPausarActionPerformed(evt);
            }
        });
        panelPrincipal.add(botonPausar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        botonDetener.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        botonDetener.setText("DETENER");
        botonDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDetenerActionPerformed(evt);
            }
        });
        panelPrincipal.add(botonDetener, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));

        etiquetaFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoF1.jpg"))); // NOI18N
        panelPrincipal.add(etiquetaFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void botonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarActionPerformed
        tiempo.start();                                                         //INICIAMOS EL CRONOMETRO
        botonIniciar.setEnabled(false);                                         //DESHABILITAMOS EL BOTÓN
        botonIniciar.setText("REANUDAR");
        botonPausar.setEnabled(true);                                           //BOTON HABILITADO
        botonDetener.setEnabled(true);                                          //BOTON HABILITADO
    }//GEN-LAST:event_botonIniciarActionPerformed

    private void botonPausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPausarActionPerformed
        tiempo.stop();                                                          //DETENEMOS EL CRONOMETRO
        botonIniciar.setEnabled(true);                                          //HABILITAMOS EL BOTÓN
        botonPausar.setEnabled(false);                                          //DESHABILITAMOS EL BOTÓN
    }//GEN-LAST:event_botonPausarActionPerformed

    private void botonDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDetenerActionPerformed
        if(tiempo.isRunning()){
            //PRIMERO PARAMOS EL TIEMPO POR SEGURIDAD
            tiempo.stop();
            botonIniciar.setEnabled(true);
        }
        botonIniciar.setText("INICIAR");
        botonPausar.setEnabled(false);
        botonDetener.setEnabled(false);
        //REINICIAMOS EL CRONOMETRO
        horas = 0;
        minutos = 0;
        segundos = 0;
        milisegundos = 0;
        actualizarEtiquetaTiempo();
    }//GEN-LAST:event_botonDetenerActionPerformed
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
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonDetener;
    private javax.swing.JButton botonIniciar;
    private javax.swing.JButton botonPausar;
    private javax.swing.JLabel etiquetaCronometro;
    private javax.swing.JLabel etiquetaFondo;
    private javax.swing.JLabel etiquetaTiempo;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
