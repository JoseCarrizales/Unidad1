import javax.swing.*;
import java.awt.*;

public class JFrameIngresoAgenda extends JFrame
{
   IngresoAgenda ingreso = new IngresoAgenda();
   
    public JFrameIngresoAgenda()
   {  
      initComponents();
   }
   
   private void initComponents()
   {
      setSize(250, 150);
      setTitle("Usuario y Contraseña");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setContentPane(ingreso);
      setVisible(true);
       
   }   
}