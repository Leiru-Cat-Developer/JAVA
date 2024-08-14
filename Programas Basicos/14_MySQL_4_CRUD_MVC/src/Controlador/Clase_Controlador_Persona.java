package Controlador;
import Modelo.Clase_Consultas;
import Modelo.Clase_Persona;
import Vista.JFrame_Vista;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import javax.swing.JOptionPane;
public class Clase_Controlador_Persona implements ActionListener {
    private JFrame_Vista vista1;
    private Clase_Persona persona1;
    private Clase_Consultas consulta1;
    public Clase_Controlador_Persona(JFrame_Vista vista1, Clase_Persona persona1, Clase_Consultas consulta1) {
        this.vista1 = vista1;
        this.persona1 = persona1;
        this.consulta1 = consulta1;
        vista1.botonInsertar.addActionListener(this);
        vista1.botonLimpiar.addActionListener(this);
        vista1.botonBuscar.addActionListener(this);
        vista1.botonModificar.addActionListener(this);
        vista1.botonEliminar.addActionListener(this);
    }
    public void iniciarAplicacion(){
        vista1.textFieldIDPersonaOculto.setVisible(false);
        vista1.setTitle("CRUD MVC");
        vista1.setSize(700, 550);
        vista1.setMinimumSize(new Dimension(710, 560));
        vista1.setLocationRelativeTo(null);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == vista1.botonInsertar){
            if(vista1.textFieldClave.getText().isEmpty() ||
               vista1.textFieldNombre.getText().isEmpty() ||
               vista1.textFieldDomicilio.getText().isEmpty() ||
               vista1.textFieldCelular.getText().isEmpty() ||
               vista1.textFieldCorreoElectronico.getText().isEmpty() ||
               vista1.textFieldFechaNacimiento.getText().isEmpty() ||
               vista1.comboBoxGenero.getSelectedIndex() == 0){
                JOptionPane.showMessageDialog(null, "RELLENE TODOS LOS CAMPOR PARA INSERTAR");
            }else{
                persona1.setClavePersona(vista1.textFieldClave.getText());
                persona1.setNombrePersona(vista1.textFieldNombre.getText());
                persona1.setDomicilioPersona(vista1.textFieldDomicilio.getText());
                persona1.setCelularPersona(vista1.textFieldCelular.getText());
                persona1.setCorreoElectronicoPersona(vista1.textFieldCorreoElectronico.getText());
                persona1.setFechaNacimientoPersona(Date.valueOf(vista1.textFieldFechaNacimiento.getText()));
                persona1.setGeneroPersona(vista1.comboBoxGenero.getSelectedItem().toString());
                if(consulta1.insertarPersona(persona1)){
                    JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
                    limpiarTextFields();
                }else{
                    JOptionPane.showMessageDialog(null, "ERROR AL REGISTRAR");
                }
            }
        }
        if(ae.getSource() == vista1.botonLimpiar){
            limpiarTextFields();
            JOptionPane.showMessageDialog(null, "LIMPIEZA REALIZADA");
        }
        if(ae.getSource() == vista1.botonBuscar){
            persona1.setClavePersona(vista1.textFieldBuscar.getText());
            if(consulta1.buscarPersona(persona1)){
                vista1.textFieldIDPersonaOculto.setText(String.valueOf(persona1.getIdPersona()));
                vista1.textFieldClave.setText(persona1.getClavePersona());
                vista1.textFieldNombre.setText(persona1.getNombrePersona());
                vista1.textFieldDomicilio.setText(persona1.getDomicilioPersona());
                vista1.textFieldCelular.setText(persona1.getCelularPersona());
                vista1.textFieldCorreoElectronico.setText(persona1.getCorreoElectronicoPersona());
                vista1.textFieldFechaNacimiento.setText(String.valueOf(persona1.getFechaNacimientoPersona()));
                vista1.comboBoxGenero.setSelectedItem(persona1.getGeneroPersona());
            }else{
                JOptionPane.showMessageDialog(null, "NO SE ENCONTRO NINGUNA PERSONA RELACIONADA");
            }
        }
        if(ae.getSource() == vista1.botonModificar){
            persona1.setIdPersona(Integer.parseInt(vista1.textFieldIDPersonaOculto.getText()));
            persona1.setClavePersona(vista1.textFieldClave.getText());
            persona1.setNombrePersona(vista1.textFieldNombre.getText());
            persona1.setDomicilioPersona(vista1.textFieldDomicilio.getText());
            persona1.setCelularPersona(vista1.textFieldCelular.getText());
            persona1.setCorreoElectronicoPersona(vista1.textFieldCorreoElectronico.getText());
            persona1.setFechaNacimientoPersona(Date.valueOf(vista1.textFieldFechaNacimiento.getText()));
            persona1.setGeneroPersona(vista1.comboBoxGenero.getSelectedItem().toString());
            if(consulta1.modificarPersona(persona1)){
                JOptionPane.showMessageDialog(null, "PERSONA MODIFICADA CORRECTAMENTE");
                limpiarTextFields();
            }else{
                JOptionPane.showMessageDialog(null, "NO SE PUDO MODIFICAR");
            }
        }
        if(ae.getSource() == vista1.botonEliminar){
            persona1.setIdPersona(Integer.parseInt(vista1.textFieldIDPersonaOculto.getText()));
            if(consulta1.eliminarPersona(persona1)){
                JOptionPane.showMessageDialog(null, "PERSONA ELIMINADA CORRECTAMENTE");
                limpiarTextFields();
            }else{
                JOptionPane.showMessageDialog(null, "NO SE PUDO ELIMINAR");
            }
        }
    }
    public void limpiarTextFields(){
        vista1.textFieldIDPersonaOculto.setText(null);
        vista1.textFieldBuscar.setText(null);
        vista1.textFieldClave.setText(null);
        vista1.textFieldNombre.setText(null);
        vista1.textFieldDomicilio.setText(null);
        vista1.textFieldCelular.setText(null);
        vista1.textFieldCorreoElectronico.setText(null);
        vista1.textFieldFechaNacimiento.setText(null);
        vista1.comboBoxGenero.setSelectedIndex(0);
    }
}