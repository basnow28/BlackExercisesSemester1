import java.util.*;

public class Exercise4{

   public static void quadList(ArrayList<String> arr){
      for(int i=0; i<arr.size(); i++){
         for(int j=1; j<=3; j++){
            String element = arr.get(i);
            arr.add(i+j, element);
            if(j==3)
               i += j;
         }
      }
   }

   public static void main(String args[]){
      ArrayList<String> arr = new ArrayList(
         Arrays.asList("java", "program"));
      
      quadList(arr);
      
      for(String str : arr){
         System.out.println(str);
      }
   }
}