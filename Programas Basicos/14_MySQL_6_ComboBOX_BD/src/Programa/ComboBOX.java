package Programa;
import Modelo.Clase_Ciudad;
import Modelo.Clase_Estado;
import Modelo.Clase_Pais;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
public class ComboBOX extends javax.swing.JFrame {
    public ComboBOX() {
        initComponents();
        this.setSize(600, 400);
        this.setMinimumSize(new Dimension(610, 410));
        this.setLocationRelativeTo(null);
        Clase_Pais cp = new Clase_Pais();
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel(cp.mostrarPaises());
        comboBoxPaises.setModel(modeloCombo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelPrincipal = new javax.swing.JPanel();
        etiquetaPaises = new javax.swing.JLabel();
        etiquetaEstados = new javax.swing.JLabel();
        etiquetaCiudad = new javax.swing.JLabel();
        comboBoxPaises = new javax.swing.JComboBox<>();
        comboBoxEstados = new javax.swing.JComboBox<>();
        comboBoxCiudades = new javax.swing.JComboBox<>();
        etiquetaInformacion = new javax.swing.JLabel();
        scrollPane1 = new javax.swing.JScrollPane();
        areaInformacion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        panelPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        panelPrincipal.setLayout(new java.awt.GridBagLayout());

        etiquetaPaises.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        etiquetaPaises.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaPaises.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaPaises.setText("PAISES:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelPrincipal.add(etiquetaPaises, gridBagConstraints);

        etiquetaEstados.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        etiquetaEstados.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaEstados.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaEstados.setText("ESTADOS:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelPrincipal.add(etiquetaEstados, gridBagConstraints);

        etiquetaCiudad.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        etiquetaCiudad.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaCiudad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaCiudad.setText("CIUDAD:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelPrincipal.add(etiquetaCiudad, gridBagConstraints);

        comboBoxPaises.setBackground(new java.awt.Color(204, 204, 204));
        comboBoxPaises.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        comboBoxPaises.setForeground(new java.awt.Color(0, 0, 0));
        comboBoxPaises.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxPaisesItemStateChanged(evt);
            }
        });
        comboBoxPaises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPaisesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelPrincipal.add(comboBoxPaises, gridBagConstraints);

        comboBoxEstados.setBackground(new java.awt.Color(204, 204, 204));
        comboBoxEstados.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        comboBoxEstados.setForeground(new java.awt.Color(0, 0, 0));
        comboBoxEstados.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxEstadosItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelPrincipal.add(comboBoxEstados, gridBagConstraints);

        comboBoxCiudades.setBackground(new java.awt.Color(204, 204, 204));
        comboBoxCiudades.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        comboBoxCiudades.setForeground(new java.awt.Color(0, 0, 0));
        comboBoxCiudades.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxCiudadesItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelPrincipal.add(comboBoxCiudades, gridBagConstraints);

        etiquetaInformacion.setText("INFORMACIÓN:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelPrincipal.add(etiquetaInformacion, gridBagConstraints);

        areaInformacion.setColumns(20);
        areaInformacion.setRows(5);
        scrollPane1.setViewportView(areaInformacion);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelPrincipal.add(scrollPane1, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void comboBoxPaisesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxPaisesItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Clase_Pais pais = (Clase_Pais)comboBoxPaises.getSelectedItem();     //CAST
            Clase_Estado estado = new Clase_Estado();
            DefaultComboBoxModel modeloComboEstados = new DefaultComboBoxModel(estado.mostrarEstados(pais.getIdPais()));
            comboBoxEstados.setModel(modeloComboEstados);
            comboBoxCiudades.removeAllItems();
        }
    }//GEN-LAST:event_comboBoxPaisesItemStateChanged
    private void comboBoxPaisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPaisesActionPerformed
        //VACIO
    }//GEN-LAST:event_comboBoxPaisesActionPerformed
    private void comboBoxEstadosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxEstadosItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Clase_Estado estado = (Clase_Estado)comboBoxEstados.getSelectedItem();//CAST
            Clase_Ciudad ciudad = new Clase_Ciudad();
            DefaultComboBoxModel modeloComboCiudad = new DefaultComboBoxModel(ciudad.mostrarCiudades(estado.getIdEstado()));
            comboBoxCiudades.setModel(modeloComboCiudad);
            areaInformacion.setText("");
        }
    }//GEN-LAST:event_comboBoxEstadosItemStateChanged
    private void comboBoxCiudadesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxCiudadesItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Clase_Pais pais = (Clase_Pais)comboBoxPaises.getSelectedItem();         //CAST
            Clase_Estado estado = (Clase_Estado)comboBoxEstados.getSelectedItem();  //CAST
            Clase_Ciudad ciudad = (Clase_Ciudad)comboBoxCiudades.getSelectedItem(); //CAST
            areaInformacion.setText("PAIS: "+pais.getNombrePais()+", ESTADO: "+estado.getNombreEstado()+", CIUDAD: "+ciudad.getNombreCiudad());
        }
    }//GEN-LAST:event_comboBoxCiudadesItemStateChanged
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
            java.util.logging.Logger.getLogger(ComboBOX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComboBOX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComboBOX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComboBOX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComboBOX().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaInformacion;
    private javax.swing.JComboBox<String> comboBoxCiudades;
    private javax.swing.JComboBox<String> comboBoxEstados;
    private javax.swing.JComboBox<String> comboBoxPaises;
    private javax.swing.JLabel etiquetaCiudad;
    private javax.swing.JLabel etiquetaEstados;
    private javax.swing.JLabel etiquetaInformacion;
    private javax.swing.JLabel etiquetaPaises;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JScrollPane scrollPane1;
    // End of variables declaration//GEN-END:variables
}