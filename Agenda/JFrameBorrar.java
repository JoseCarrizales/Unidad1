import javax.swing.*;
import java.awt.*;

public class JFrameBorrar extends JFrame{
   Borrar borrar = new Borrar();
   public JFrameBorrar()
   {
     initComponents();
   }
   
   private void initComponents()
   {
     super.setVisible(false);
     super.dispose();
     setSize(300,200);
     setTitle("Eliminar");
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setContentPane(borrar);
     setResizable(false);
     setVisible(true);
   }
}