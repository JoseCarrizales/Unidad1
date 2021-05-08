public class PrincipalMultihilos{
   static int arrSize = 6;
   
   public static void main(String args[]){
      
      Hilo1Suma hilo1 = new Hilo1Suma(); 
      Hilo2Cuadrados hilo2 = new Hilo2Cuadrados();
      Hilo3Media hilo3 = new Hilo3Media();
      
      hilo1.start();
      hilo2.start();
      hilo3.start();
   }
}