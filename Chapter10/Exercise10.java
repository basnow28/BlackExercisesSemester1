import java.util.*;

public class Exercise10{

   public static void stutter(ArrayList<String> arr, int k){
      if(k <= 0){
         arr.clear();
      }
     
      for(int i=0; i<arr.size(); i++){
         for(int j=1; j<k; j++){
            String element = arr.get(i);
            arr.add(i+j, element);
         }
         i+=k-1;
      }
   }
   
   public static void main(String args[]){
      ArrayList<String> arr = new ArrayList(
         Arrays.asList("how", "are","you?"));
      
      stutter(arr,2);
      
      for(String str : arr)
         System.out.println(str);
   }
}