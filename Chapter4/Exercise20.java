import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise20{
   public static int numRepeat(int num1, int num2, int num3, int num4){	
      int howMany = 0;
   	  
      List<Integer> arr = new ArrayList<Integer>();
      arr.add(num1);
      arr.add(num2);
      arr.add(num3);
      arr.add(num4);
         
      Map<Integer, Long> newList;
         
      newList = arr.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
         
      for(Map.Entry<Integer, Long> n : newList.entrySet()){
         if(n.getValue() > 1)
            howMany++;
      }
         
      System.out.println(newList);
         
      return howMany;
   }
   public static void main(String args[]){
      System.out.println(numRepeat(1,1,2,2));
   }
}
