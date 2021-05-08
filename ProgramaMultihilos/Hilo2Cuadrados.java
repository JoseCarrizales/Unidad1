public class Hilo2Cuadrados extends Thread{
   @Override
   public void run(){
      double [] arreglo1 = new double[PrincipalMultihilos.arrSize];
      double suma = 0;
      
      System.out.println("Hilo 2");
      for(int x = 0; x < PrincipalMultihilos.arrSize; x++){
         arreglo1[x] = Math.floor(Math.random()*9+1);
      }
      
      for(int x = 0; x < PrincipalMultihilos.arrSize; x++){
         System.out.println("Arreglo 2 [" + x +"]: " + arreglo1[x]);
         suma = suma + Math.pow(arreglo1[x], 2);
      }
      System.out.println("Suma de los cuadrados del vector 2: " + suma + "\n");
   }
}