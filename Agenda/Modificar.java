import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class Modificar extends Panel implements ActionListener{
  JButton btnGuardar;
  JTextField txtBuscar, txtNombre, txtApellidos, txtTelefono, txtCorreo, txtBirthday;
  JRadioButton amigo, conocido;

   ManejoPersona mp = new ManejoPersona();
   Consulta ob = new Consulta();
   ArrayList<Persona> datosPer = new ArrayList<Persona>();
   
   public Modificar(){
      setLayout(new GridLayout(8,3));
      JLabel modNombre = new JLabel("Nombre del usuario: ", JLabel.RIGHT);
      txtBuscar = new JTextField(20);
      add(modNombre);
      add(txtBuscar);
      
      JLabel lblNombre = new JLabel("Nombre nuevo: ", JLabel.RIGHT);
      txtNombre = new JTextField(20);
      add(lblNombre);
      add(txtNombre);
    
      JLabel lblApellidos = new JLabel("Apellidos nuevos: ", JLabel.RIGHT);
      txtApellidos = new JTextField(30);
      add(lblApellidos);
      add(txtApellidos);
    
      JLabel lblTelefono = new JLabel("Telefono nuevo: ", JLabel.RIGHT);
      txtTelefono = new JTextField(15);
      add(lblTelefono);
      add(txtTelefono);
    
      JLabel lblCorreo = new JLabel("Correo nuevo: ", JLabel.RIGHT);
      txtCorreo = new JTextField(30);
      add(lblCorreo);
      add(txtCorreo);
    
      JLabel lblBirthday = new JLabel("Fecha de nacimiento nueva: ", JLabel.RIGHT);
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
   
   public void actionPerformed(ActionEvent e){
      String search = txtBuscar.getText();
      String caja_text=search;
      String tipo="Conocido";
      int x=1;
      int aux=0;
      String informacion[][] = ob.obtenerDatos();
      
      if(search == null || txtBuscar.getText().isEmpty())
      {
         JOptionPane.showMessageDialog(null, "Debe ir al menos el nombre de la persona", "Aviso", JOptionPane.INFORMATION_MESSAGE);
         txtBuscar.requestFocus();
      }
      else
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
          JOptionPane.showMessageDialog(null, "Se debe de colocar el teléfono de la persona",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtTelefono.requestFocus();
         }
         else
         {
            String cadena = "";
            boolean ban = false;
            for(int y=0; y < informacion.length; y++)
            {
               cadena=informacion[y][0];
               if(search.equals(cadena))
                {
                  JOptionPane.showMessageDialog(null, "Se modificara el usuario", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                  ban = true;
                  mp.mod(y, txtNombre.getText(), txtApellidos.getText(), txtTelefono.getText(), txtCorreo.getText(), txtBirthday.getText(), tipo);
                  break;
                }
             }
             if(ban == false)
               {
                  JOptionPane.showMessageDialog(null, "No se encontro el usuario", "Aviso", JOptionPane.INFORMATION_MESSAGE);
               }

         }

   }
}