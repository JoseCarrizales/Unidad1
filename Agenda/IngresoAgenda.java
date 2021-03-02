import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IngresoAgenda extends Panel implements ActionListener
{
   private JButton btnIngresa, btnCancelar;
   private JTextField txtUser;
   private JPasswordField contra;
   
   public IngresoAgenda()
   {
     setLayout(new GridLayout(3,2));
     JLabel lblUsuario = new JLabel("Usuario: ", JLabel.RIGHT);
     txtUser = new JTextField(20);
     add(lblUsuario);
     add(txtUser);
     
     JLabel lblContra = new JLabel("Contraseña: ", JLabel.RIGHT);
     contra = new JPasswordField(20);
     contra.setToolTipText("Ingrese contraseña");
     add(lblContra);
     add(contra);
     
     btnIngresa = new JButton("Ingresar");
     btnIngresa.addActionListener(this);
     btnCancelar = new JButton("Cancelar");
     btnCancelar.addActionListener(this);
     add(btnIngresa);
     add(btnCancelar);
   }
   
   public void actionPerformed(ActionEvent e){
      String usuario = txtUser.getText();
      String password = new String(contra.getPassword());
      
      if(e.getSource()==btnIngresa){
         if(password.isEmpty() && usuario.isEmpty())
          {
            JOptionPane.showMessageDialog(null,"Ingrese su usuario y contraseña");
            txtUser.requestFocus();
          }
         else
           if(usuario.equals("Jose") && password.equals("SSJ4")) 
            {
              JOptionPane.showMessageDialog(null, "Bienvenido Administrador");
              JFrameMenuAgenda menu = new JFrameMenuAgenda();
            }
           else
            {
               JOptionPane.showMessageDialog(null, "Usuario o Password equivocado","Peligro",
                                           JOptionPane.WARNING_MESSAGE);
               txtUser.setText(null);
               contra.setText(null);
               txtUser.requestFocus();
            }
      }
   }
}