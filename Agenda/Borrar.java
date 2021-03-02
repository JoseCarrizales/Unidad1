import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class Borrar extends Panel implements ActionListener{
   JTextField txtBuscar;
   JButton OK;
   ManejoPersona mp = new ManejoPersona();
   Consulta ob = new Consulta();
   ArrayList<Persona> datosPer = new ArrayList<Persona>();
   
   public Borrar(){
      setLayout(new GridLayout(3,2));
      JLabel buscar = new JLabel("Nombre del usuario: ", JLabel.RIGHT);
      txtBuscar = new JTextField(20);
      add(buscar);
      add(txtBuscar);
      
      OK = new JButton("Eliminar");
      OK.addActionListener(this);
      add(OK);
   }
   
   public void actionPerformed(ActionEvent e){
      int x=1;
      int aux=0;
      String informacion[][] = ob.obtenerDatos();

      if(e.getSource() == OK)
      {
         String search = txtBuscar.getText();
         String caja_text=search;
         if(search == null || txtBuscar.getText().isEmpty())
         {
            JOptionPane.showMessageDialog(null, "Debe ir al menos el nombre de la persona", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtBuscar.requestFocus();
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
                  JOptionPane.showMessageDialog(null, "Se eliminara el usuario", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                  ban = true;
                  mp.eliminar(y);
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
}
