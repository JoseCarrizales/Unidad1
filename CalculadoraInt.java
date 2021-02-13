//Alumno: Jose de Jesus Carrizales Guzman

import javax.swing.*;
import java.awt.event.*;

public class CalculadoraInt extends JFrame{
   JLabel etiqueta1;
   JTextField numero1;
   JLabel etiqueta2;
   JTextField numero2;
   JButton sum;
   JButton res;
   JButton mult;
   JButton div;
   JButton btnSalir;
   JLabel respuesta;
   
   public CalculadoraInt(){
      componentes();
   }
   
   private void componentes(){
      setTitle("Calculadora");
      setSize(900, 300);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      
      etiqueta1 = new JLabel("Numero 1: ");
      numero1 = new JTextField("0", 20);
      numero1.setEditable(true);
      etiqueta2 = new JLabel("Numero 2: ");
      numero2 = new JTextField("0", 20);
      numero2.setEditable(true);
      sum = new JButton("+");
      res = new JButton("-");
      mult = new JButton("*");
      div = new JButton("/");
      btnSalir = new JButton("Salir");
      respuesta = new JLabel();
      
      JPanel panel = new JPanel();
      
      panel.add(etiqueta1);
      panel.add(numero1);
      panel.add(etiqueta2);
      panel.add(numero2);
      panel.add(sum);
      panel.add(res);
      panel.add(mult);
      panel.add(div);
      panel.add(btnSalir);
      sum.addMouseListener(new MyClickListener1());
      res.addMouseListener(new MyClickListener2());
      mult.addMouseListener(new MyClickListener3());
      div.addMouseListener(new MyClickListener4());
      btnSalir.addMouseListener(new MyClick());
      panel.add(respuesta);
      setContentPane(panel);
      setVisible(true);
   }
   
   private class MyClickListener1 extends MouseAdapter{
      int num1 = 0;
      int num2 = 0;
      int resultado = 0;
      public void mouseClicked(MouseEvent event){
         try{
            num1 = Integer.parseInt(numero1.getText());
            num2 = Integer.parseInt(numero2.getText());
            resultado = num1 + num2;
            respuesta.setText("Resultado: " + resultado);
         }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El valor de los numeros no es valido", "Error", JOptionPane.ERROR_MESSAGE);
            numero1.setText("0");
            numero2.setText("0");
            numero1.requestFocus();
         }
      }
   }
   private class MyClickListener2 extends MouseAdapter{
      int num1 = 0;
      int num2 = 0;
      int resultado = 0;
      public void mouseClicked(MouseEvent event){
         try{
            num1 = Integer.parseInt(numero1.getText());
            num2 = Integer.parseInt(numero2.getText());
            resultado = num1 - num2;
            respuesta.setText("Resultado: " + resultado);
         }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El valor de los numeros no es valido", "Error", JOptionPane.ERROR_MESSAGE);
            numero1.setText("0");
            numero2.setText("0");
            numero1.requestFocus();
         }
      }
   }
   private class MyClickListener3 extends MouseAdapter{
      int num1 = 0;
      int num2 = 0;
      int resultado = 0;
      public void mouseClicked(MouseEvent event){
         try{
            num1 = Integer.parseInt(numero1.getText());
            num2 = Integer.parseInt(numero2.getText());
            resultado = num1 * num2;
            respuesta.setText("Resultado: " + resultado);
         }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El valor de los numeros no es valido", "Error", JOptionPane.ERROR_MESSAGE);
            numero1.setText("0");
            numero2.setText("0");
            numero1.requestFocus();
         }
      }
   }
   private class MyClickListener4 extends MouseAdapter{
      int num1 = 0;
      int num2 = 0;
      double resultado = 0.0;
      public void mouseClicked(MouseEvent event){
         try{
            num1 = Integer.parseInt(numero1.getText());
            num2 = Integer.parseInt(numero2.getText());
            resultado = num1 / num2;
            respuesta.setText("Resultado: " + resultado);
         }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El valor de los numeros no es valido", "Error", JOptionPane.ERROR_MESSAGE);
            numero1.setText("0");
            numero2.setText("0");
            numero1.requestFocus();
         }
      }
   }
   private class MyClick extends MouseAdapter{
      public void mouseClicked(MouseEvent event){
         System.exit(0);
      }
   }
}