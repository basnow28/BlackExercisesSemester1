import java.util.*;

public class Exercise5{
   public static void scaleByK(ArrayList<Integer> arr){
      for(int i=0; i<arr.size(); i++){
      
         while(arr.get(i) <= 0){
            arr.remove(i);
            if(i >= arr.size()){
               break;
            }
         }
         
         if(i<arr.size())
            for(int j=1; j<arr.get(i); j++){
               int element = arr.get(i);
               int index = i+j;
               arr.add(index, element);
            
               if(j==arr.get(i)-1)
                  i+=j;
            }
      }
   }
   
   public static void main(String args[]){
      ArrayList<Integer> arr = new ArrayList(
         Arrays.asList(-12,-7,4,1,2,0,3,-1,-8,2,-4,-8));
     
      scaleByK(arr);
      
      for(Integer i : arr){
         System.out.println(i);
      }
   }
}