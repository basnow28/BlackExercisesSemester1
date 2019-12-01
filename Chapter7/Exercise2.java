import java.lang.Math;

public class Exercise2{
   public static int product(int [] arr){
      int max = 0;
      int min = 0;
      
      if(arr.length > 1){
         max = Math.max(arr[0], arr[1]);
         min = Math.min(arr[0], arr[1]);
      
         for(int i=2; i<arr.length; i++){
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
         }   
      }
      else
         return arr[0];
           
      return min*max; 
   }
   
   
   public static void main(String args[]){
      int [] arr = {25, 85, 22, 15, 78, 27, 48};
      System.out.println(product(arr));
   }
}