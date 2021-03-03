import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuAgenda extends JPanel implements ActionListener{
  JButton btnAdd, btnCons, btnDel, btnMod;
  
  public MenuAgenda(){
    setLayout(new GridLayout(2,2));
    
    btnAdd = new JButton("Agregar");
    btnAdd.addActionListener(this);
    btnCons = new JButton("Consultar");
    btnCons.addActionListener(this);
    btnDel = new JButton("Eliminar");
    btnDel.addActionListener(this);
    btnMod = new JButton("Modificar");
    btnMod.addActionListener(this);
    add(btnAdd);
    add(btnCons);
    add(btnDel);
    add(btnMod);
  }
  
  public void actionPerformed(ActionEvent e){
      if(e.getSource() == btnAdd){
         JFrameDatosAgenda fda = new JFrameDatosAgenda();
      }
      else
         if(e.getSource() == btnCons){
            JFrameConsulta fc = new JFrameConsulta();
         }
         else
            if(e.getSource() == btnDel){
               JFrameBorrar fb = new JFrameBorrar();
            }
            else
               if(e.getSource() == btnMod){
                  JFrameModificar fm = new JFrameModificar();
               }
  }
}
