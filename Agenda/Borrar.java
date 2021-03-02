import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Borrar extends Panel implements ActionListener{
   JTextField txtBuscar;
   JButton OK;
   ManejoPersona mp = new ManejoPersona();
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
      int x = 0;
      int pos = 0;
      String nombre = new String(txtBuscar.getText());
      String aux;
      boolean found = false;
      
      if(e.getSource() == OK){
         Iterator<Persona> itrPersona = datosPer.iterator();
         while(itrPersona.hasNext()){
            Persona persona = itrPersona.next();
            aux = persona.getNombre().toString();
            if(aux.equals(nombre)){
               found = true;
               pos = x;
            }
            x++;
         }

         if(found == true){
            mp.eliminar(pos);
            JOptionPane.showMessageDialog(null, "Registro eliminado");
            txtBuscar.setText(null);
            txtBuscar.requestFocus();
         }
         else
            if(found == false){
               JOptionPane.showMessageDialog(null, "Registro no encontrado","Error", JOptionPane.WARNING_MESSAGE);
               txtBuscar.setText(null);
               txtBuscar.requestFocus();
            }
      }
   }
}