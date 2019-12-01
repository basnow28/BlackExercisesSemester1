public class Exercise5{
   public static void printReverseGrid(int rows, int columns){
      int num = rows * columns; 
      
      for(int i=1; i<=rows; i++){
         for(int j=1; j<=columns; j++){
            System.out.print(num + " ");
            num--;
         }
         System.out.println();
      }
   }
   public static void main(String args[]){
      printReverseGrid(4,3);
   }
}