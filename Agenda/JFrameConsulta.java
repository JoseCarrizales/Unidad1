import javax.swing.*;
import java.awt.*;

public class JFrameConsulta extends JFrame
{
   Consulta con = new Consulta();
   
   public JFrameConsulta()
   {
     initComponents();
   }
   
   private void initComponents()
   {
     setSize(300,200);
     setTitle("Contactos Guardados");
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setContentPane(con);
     setResizable(false);
     setVisible(true);
   }
}