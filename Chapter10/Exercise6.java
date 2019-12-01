import java.util.*;

public class Exercise6{
   public static void maxToFront(ArrayList<Integer> arr){
      int max = arr.get(0);
      int maxIndex = 0;
      
      for(int i = 1; i<arr.size(); i++){
         if(arr.get(i) > max){
            max = arr.get(i);
            maxIndex = i;
         }
      }
      
      arr.remove(maxIndex);
      arr.add(0, max);
   }
   
   public static void main(String args[]){
      ArrayList<Integer> arr = new ArrayList(
         Arrays.asList(25, 39, 50, 3, 8, 24, 4));
      
      maxToFront(arr);
      
      for(Integer i : arr) {
         System.out.println(i);
      }
   }
}