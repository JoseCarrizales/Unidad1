import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelDatosAgenda extends JPanel implements ActionListener
{
  JButton btnGuardar, btnSalir;//visibilidad a nivel de clase
  JTextField txtNombre, txtApellidos, txtTelefono, txtCorreo, txtBirthday;
  JRadioButton amigo, conocido;
  ManejoPersona datos = new ManejoPersona();

  
  public PanelDatosAgenda()
  {
    setLayout(new GridLayout(7,3));
    JLabel lblNombre = new JLabel("Nombre: ", JLabel.RIGHT);
    txtNombre = new JTextField(20);
    add(lblNombre);
    add(txtNombre);
    
    JLabel lblApellidos = new JLabel("Apellidos: ", JLabel.RIGHT);
    txtApellidos = new JTextField(30);
    add(lblApellidos);
    add(txtApellidos);
    
    JLabel lblTelefono = new JLabel("Telefono: ", JLabel.RIGHT);
    txtTelefono = new JTextField(15);
    add(lblTelefono);
    add(txtTelefono);
    
    JLabel lblCorreo = new JLabel("Correo: ", JLabel.RIGHT);
    txtCorreo = new JTextField(30);
    add(lblCorreo);
    add(txtCorreo);
    
    JLabel lblBirthday = new JLabel("Fecha de nacimiento: ", JLabel.RIGHT);
    txtBirthday = new JTextField(30);
    add(lblBirthday);
    add(txtBirthday);
    
    ButtonGroup gpoRBotones = new ButtonGroup();
    amigo = new JRadioButton("Amigo", true);
    conocido = new JRadioButton("Conocido");
    gpoRBotones.add(amigo);
    gpoRBotones.add(conocido);
    add(amigo);
    add(conocido);
    
    btnGuardar = new JButton("Guardar");
    btnGuardar.addActionListener(this);
    add(btnGuardar);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    String tipo="Conocido";
    
    if (e.getSource() == btnGuardar) 
      {
         if(amigo.isSelected())
                tipo="Amigo";
         if(txtNombre.getText() == null || txtNombre.getText().isEmpty())
         {
          JOptionPane.showMessageDialog(null, "Debe de ir al menos el nombre de la persona",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtNombre.requestFocus();
         }
        else
         if(txtTelefono.getText() == null || txtTelefono.getText().isEmpty())
         {
          JOptionPane.showMessageDialog(null, "Se debe de colocar el tel�fono de la persona",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtTelefono.requestFocus();
         }
        else
          {
           datos.agregar(txtNombre.getText(), txtApellidos.getText(),
           txtTelefono.getText(), txtCorreo.getText(), txtBirthday.getText(), tipo);
           JOptionPane.showMessageDialog(null, "Se guardar�n los datos",
              "Aviso", JOptionPane.INFORMATION_MESSAGE);	
            txtNombre.setText("");
            txtApellidos.setText("");
            txtTelefono.setText("");
            txtCorreo.setText("");
            txtBirthday.setText("");
            txtNombre.requestFocus();
               // datos.mostrar();
           }
         }
  }
}