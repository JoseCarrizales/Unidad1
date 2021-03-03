import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFrameModificar extends JFrame
{
   Modificar mod = new Modificar();
   public JFrameModificar()
   {
     initComponents();
   }
   
   private void initComponents()
   {
     super.setVisible(false);
     super.dispose();
     setSize(300,200);
     setTitle("Modificar");
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setContentPane(mod);
     setResizable(false);
     setVisible(true);
   }
}