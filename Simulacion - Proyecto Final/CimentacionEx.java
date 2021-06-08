import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.DecimalFormat;

public class CimentacionEx extends JFrame implements ItemListener{
   static float valorT;
   String select;
   JTextField ArTerreno, NumPisos, semanas, costMat, costObra, costAprox;
   JRadioButton firme, reteplen, arcilla;
   JLabel lblTerreno, lblPisos, lblSemanas, lblMat, lblObra, lblAprox;
   JButton ok, salir;
   JPanel panel;
   SpinnerModel pisos;
   JSpinner spinner;
   private Object objTextField;
   static JComboBox combo1;
   
   public CimentacionEx (){
      initComponents();
   }
   
   private void initComponents(){
      setTitle("Simulacion de costos de cimentacion");
      setSize(450,200);
      lblTerreno = new JLabel("Area del terreno (m2): ");
      ArTerreno = new JTextField("0", 6);
      ArTerreno.setEditable(true);
      ArTerreno.setBounds(132,28,144,20);
      lblPisos = new JLabel("Numero de pisos: ");
      pisos = new SpinnerNumberModel(1, 1, 10, 1);
      spinner = new JSpinner(pisos);
      spinner.setBounds(132,28,144,20);
      lblSemanas = new JLabel("Numero de semanas requeridas: ");
      semanas = new JTextField("0", 6);
      semanas.setEditable(true);
      semanas.setBounds(132,28,144,20);
      combo1 = new JComboBox();
      combo1.setBounds(10,10,80,20);
      lblMat = new JLabel("Costo de material: ");
      costMat = new JTextField("0", 6);
      costMat.setEditable(false);
      costMat.setBounds(132,28,144,20);
      lblObra = new JLabel("Costo de mano de obra: ");
      costObra = new JTextField("0", 6);
      costObra.setEditable(false);
      costObra.setBounds(132,28,144,20);
      lblAprox = new JLabel("Costo total: ");
      costAprox = new JTextField("0", 6);
      costAprox.setEditable(false);
      costAprox.setBounds(132,28,144,20);
      ok = new JButton("Aceptar");
      ok.setMnemonic('A');
      ok.setBounds(10,10,100,50);
      salir = new JButton("Salir");
      salir.setMnemonic('S');
      
      ok.addMouseListener(new MyClickListener());
      salir.addMouseListener(new MyClick());
      
      panel = new JPanel();
      panel.add(lblTerreno);
      panel.add(ArTerreno);
      panel.add(lblPisos);
      panel.add(spinner);
      panel.add(lblSemanas);
      panel.add(semanas);
      panel.add(combo1);
      combo1.addItem("Tierra firme");
      combo1.addItem("Arcilla");
      combo1.addItem("Reteplen");
      combo1.addItemListener(this);
      panel.add(lblMat);
      panel.add(costMat);
      panel.add(lblObra);
      panel.add(costObra);
      panel.add(lblAprox);
      panel.add(costAprox);
      panel.add(ok);
      panel.add(salir);
      setContentPane(panel);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public void itemStateChanged(ItemEvent e){
      if(e.getSource()==combo1){
         String seleccionado = (String)combo1.getSelectedItem();
         select = seleccionado;
      }
   }
   
   private class MyClickListener extends MouseAdapter{
      double var, aux, costObra2, costMat2, costAprox2;
      double a, b, e;
      
      public void mouseClicked(MouseEvent event){
         try{
            if(select == "Tierra firme"){
               var = 1;
               aux = 140;
            }
            if(select == "Arcilla"){
               var = 1.5;
               aux = 280;
            }
            if(select == "Reteplen"){
               var = 1.7;
               aux = 320;
            }
            
            a = Double.parseDouble(ArTerreno.getText());
            b = (Integer) spinner.getValue();
            e = Double.parseDouble(semanas.getText());
            costObra2 = e * 5100;
            costAprox2 = (var * b * aux)*(a) + costObra2;
            double costAux = costAprox2 - costObra2;
            DecimalFormat formato = new DecimalFormat("#.00");
            costMat.setText(String.valueOf(formato.format(costAux)));
            costObra.setText(String.valueOf(formato.format(costObra2)));
            costAprox.setText(String.valueOf(formato.format(costAprox2)));
         }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Valores no validos.", "Error", JOptionPane.ERROR_MESSAGE);
            ArTerreno.setText("0");
            semanas.setText("0");
            costMat.setText("");
            costObra.setText("");
            costAprox.setText("");
            ArTerreno.requestFocus();
         }
      }
   }
   
   private class MyClick extends MouseAdapter{
      public void mouseClicked(MouseEvent event){
         System.exit(0);
      }
   }

}