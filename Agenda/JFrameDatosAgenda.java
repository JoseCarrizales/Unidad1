import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFrameDatosAgenda extends JFrame
{
   PanelDatosAgenda pdA = new PanelDatosAgenda();
   public JFrameDatosAgenda()
   {
     initComponents();
   }
   
   private void initComponents()
   {
     super.setVisible(false);
     super.dispose();
     setSize(300,200);
     setTitle("Datos Personales");
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setContentPane(pdA);
     setResizable(false);
     setVisible(true);
   }
}