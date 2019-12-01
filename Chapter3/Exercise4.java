public class Exercise4{
   public static void printDecrSquare(int max, int min){
      
      int length = max - min + 1;
      int num = 0;
       
      for(int i=max; i>=min; i--){
         num = i;
         for(int j=1; j<=length ; j++){
            System.out.print(num);
            num-=1;
            if(num < min)
               num = max;
         }
         System.out.println();
      }
   }
   public static void main(String args[]){
      printDecrSquare(10,2);
   }
}