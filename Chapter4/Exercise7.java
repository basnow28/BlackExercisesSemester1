public class Exercise7{
   public static void xo(int size){
      int leftCounter = 0;
      int rightCounter = size - 1;
      
      for(int i=0; i<size; i++){
         for(int j=0; j<size; j++){
            if(j==leftCounter || j == rightCounter){
               System.out.print("x");
            }
            else{
               System.out.print("o");
            }
         }
         leftCounter++;
         rightCounter--;
         System.out.println();
      }
   }
   
   public static void main(String args[]){
      xo(5);
   }
}