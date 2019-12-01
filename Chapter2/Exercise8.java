public class Exercise8{
   public static void main(String args[]){
      int number = 5;
      
      for(int i=number; i>=1; i--){
         for(int j=i; j>=1; j--){
            System.out.print(i);
         }
         System.out.println();
      }
   }
}