import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise2{
   public static void oddNumbers(Scanner input){
      int totalNumOfNum = 0;
      int sum = 0;
      int howManyOddNum = 0;
      double perOfOddNum = 0;
      
      while(input.hasNextInt()){
         int num = input.nextInt();
         sum += num;
         totalNumOfNum++;
         
         if(num%2 != 0){
            howManyOddNum++;
         }
      }
      
      perOfOddNum = 100.00 * ((double)howManyOddNum/(double)totalNumOfNum);
      
      System.out.println(totalNumOfNum + " numbers, sum = " + sum);
      System.out.println(howManyOddNum + " odds (" + perOfOddNum + "%)");
   }
   public static void main(String args[]) throws FileNotFoundException{
      Scanner input = new Scanner(new File("exercise2.txt"));
      oddNumbers(input);
   }
}