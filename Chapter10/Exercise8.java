import java.util.*;

public class Exercise8{

   public static void removeOdd(ArrayList<Integer> arr){
      for(int i=0; i<arr.size(); i++){
         if(arr.get(i)%2 != 0){
            arr.remove(i);
            i--;
         }
      }   
   }
   
   public static void main(String args[]){
      ArrayList<Integer> arr = new ArrayList(
         Arrays.asList(9, 6, 2, 4, 8, 3, 1));
      
      removeOdd(arr);
      
      for(Integer i : arr){
         System.out.println(i); 
      }
   }
}