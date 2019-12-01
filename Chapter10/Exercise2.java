import java.util.*;
   
public class Exercise2{

   public static void swapPairs(ArrayList<String> arr){
      for(int i=0; i<arr.size(); i+=2){
         if(i+1 < arr.size())
            Collections.swap(arr, i, i+1);
      }
   }

   public static void main(String args[]){
      ArrayList<String> arr = new ArrayList<String>(
         Arrays.asList("to", "be", "or", "not", "to", "be", "hamlet"));
   
   
      swapPairs(arr);
      
      for(String str : arr){
         System.out.println(str);
      }
   }
}