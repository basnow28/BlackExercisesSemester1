import java.util.*;

public class Exercise9{
   public static void oddSumMax(){
      Scanner scanner = new Scanner(System.in);
      int howMany = 0;
      int maxNum = 0;
      int num = 0;
      int sum = 0;
      
      System.out.println("How many integers? ");
      howMany = scanner.nextInt();
      for(int i=0; i<howMany; i++){
         System.out.print("Next integer? ");
         num = scanner.nextInt();
         
         if(num%2 != 0){
            maxNum = Math.max(num, maxNum);
            sum += num;
         }
      }
      System.out.println("Odd sum = " + sum); 
      System.out.println("Odd max = " + maxNum);
   }
   
   public static void main(String args[]){
      oddSumMax();
   }
}