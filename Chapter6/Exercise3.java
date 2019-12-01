import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise3{
   public static void positiveSum(Scanner input){
      int sum = 0;
      int steps = 0;
      
      while(input.hasNextInt() && sum <= 0){
         int num = input.nextInt();
         
         sum += num;
         steps += 1;
      }
      
      if(sum>0){
         System.out.println("sum of " + sum + " after " + steps + " steps");
      }else{
         System.out.println("No positive sum");
      }
      
   }
   public static void main(String args[]) throws FileNotFoundException{
      Scanner input = new Scanner(new File("exercise3.txt"));
      positiveSum(input);
   }
}