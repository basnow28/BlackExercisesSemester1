import java.util.*;

public class Exercise3{
   
   public static void removeOddLength(ArrayList<String> arr){
      for(int i=0; i<arr.size(); i++){
         if(arr.get(i).length() %2 != 0)
            arr.remove(i);
      }   
   }
   
   public static void main(String args[]){
      ArrayList<String> arr = new ArrayList<String>(
         Arrays.asList("aa", "bbb"));
      
      removeOddLength(arr);
      
      for(String str : arr){
         System.out.println(str);
      }
      
   }
}