import javax.swing.*;
import java.awt.*;

public class JFrameMenuAgenda extends JFrame
{
   MenuAgenda mA = new MenuAgenda();
   public JFrameMenuAgenda()
   {
     initComponents();
   }
   
   private void initComponents()
   {
     super.setVisible(false);
     super.dispose();
     setSize(400,200);
     setTitle("Menu Agenda");
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setContentPane(mA);
     setResizable(false);
     setVisible(true);
   }
}