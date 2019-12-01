import java.util.*;

public class Exercise7{
   public static void removeDuplicates(ArrayList<String> arr){
      int i=0;
      while(i+1 < arr.size()){
         if(arr.get(i) == arr.get(i+1)){
            arr.remove(i);
         }
         i++;
      }
   }   
   
   public static void main(String args[]){
      ArrayList<String> arr = new ArrayList<String> (
         Arrays.asList("be", "be", "is", "not", "or",
         "question", "that", "the", "to", "to"));  
         
      removeDuplicates(arr);
         
      for(String str : arr)
         System.out.println(str);
   }
}