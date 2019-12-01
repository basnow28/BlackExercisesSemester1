import java.util.*;

public class Exercise9{
   public static int rangeBetweenEvens(ArrayList<Integer> arr){
      int firstIndex = 0;
      int lastIndex = 0;
      
      for(int i=0; i<arr.size(); i++){
         if(arr.lastIndexOf(arr.get(i)) != i){
            firstIndex = i;
            break;
         }
      }
      
      for(int i=arr.size()-1; i>=0; i--){
         if(arr.indexOf(arr.get(i)) != i){
            lastIndex = i;
            break;
         }
      }
      
      return lastIndex - firstIndex;
   }
   
   
   public static void main(String args[]){
      ArrayList<Integer> arr = new ArrayList(
         Arrays.asList(0,4,1,1,1,2,3));
      
      System.out.println(rangeBetweenEvens(arr));
   }
}