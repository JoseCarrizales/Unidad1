public class Hilo1Suma extends Thread{
   @Override
   public void run(){
      double [] arreglo1 = new double[PrincipalMultihilos.arrSize];
      double suma = 0;
      
      System.out.println("Hilo 1");
      for(int x = 0; x < PrincipalMultihilos.arrSize; x++){
         arreglo1[x] = Math.floor(Math.random()*9+1);
      }
      
      for(int x = 0; x < PrincipalMultihilos.arrSize; x++){
         System.out.println("Arreglo 1 [" + x +"]: " + arreglo1[x]);
         suma = suma + arreglo1[x];
      }
      System.out.println("Suma total del vector 1: " + suma + "\n");
   }
}