package Funciones_Principales;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class VentanaMostrarAtletas extends javax.swing.JDialog {
    DefaultTableModel modeloTabla = new DefaultTableModel();
    public VentanaMostrarAtletas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        cargarModeloTabla();
        initComponents();
        this.setSize(900, 450);
        this.setLocationRelativeTo(null);
    }
    private void cargarModeloTabla(){
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Edad");
        modeloTabla.addColumn("Peso [KG]");
        modeloTabla.addColumn("Estatura [CM]");
        leerBinario();
    }
    private void leerBinario(){
        Atleta atleta;
        String nombre, edad, peso, estatura;
        try {
            FileInputStream archivo = new FileInputStream("Registro Atletas.bin");
            ObjectInputStream lectura = new ObjectInputStream(archivo);
            while(true){
                atleta = (Atleta) lectura.readObject();                         
                nombre = atleta.getNombre();                                    //STRING
                edad = String.valueOf(atleta.getEdad());                        //INT - STRING
                peso = String.valueOf(atleta.getPeso());                        //DOUBLE - STRING
                estatura = String.valueOf(atleta.getEstatura());                //INT - STRING
                String fila[] = {nombre, edad, peso, estatura};                 //ARREGLO
                modeloTabla.addRow(fila);                                       //AÑADIR ARREGLO A LA TABLA
            }
        } catch (EOFException ex) {
            //SE LLEGO AL FINAL DEL ARCHIVO
            return;
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "ERROR, EL ARCHIVO NO PUDO SER ENCONTRADO");
        } catch (IOException ex){
            JOptionPane.showMessageDialog(null, "ERROR, NO SE PUDO LEER EL ARCHIVO");
        } catch (ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "ERROR, LA CLASE NO FUE ENCONTRADA");
        }
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
        scrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        botonRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ATLETAS REGISTRADOS");

        panelPrincipal.setBackground(new java.awt.Color(102, 0, 102));
        panelPrincipal.setLayout(new java.awt.GridBagLayout());

        etiquetaTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTitulo.setText("ATLETAS REGISTRADOS");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelPrincipal.add(etiquetaTitulo, gridBagConstraints);

        tabla1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tabla1.setForeground(new java.awt.Color(0, 0, 0));
        tabla1.setModel(modeloTabla);
        scrollPane1.setViewportView(tabla1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panelPrincipal.add(scrollPane1, gridBagConstraints);

        botonRegresar.setBackground(new java.awt.Color(102, 102, 102));
        botonRegresar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        botonRegresar.setText("REGRESAR");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 20);
        panelPrincipal.add(botonRegresar, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(VentanaMostrarAtletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarAtletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarAtletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarAtletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaMostrarAtletas dialog = new VentanaMostrarAtletas(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JScrollPane scrollPane1;
    private javax.swing.JTable tabla1;
    // End of variables declaration//GEN-END:variables
}