import java.util.*;

public class Exercise8{
   public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
      System.out.print("How many numbers do you want to enter?");
      int howManyNumbers = scanner.nextInt();
      int countEvenNum = 0;
      int countOddNum = 0;
      int num;
      System.out.println();
      
      for(int i=1; i<=howManyNumbers; i++){
         System.out.print("Number " + i + ":");
         num = scanner.nextInt();
         if(num%2 == 0)
            countEvenNum++;
         else
            countOddNum++;         
      }
      System.out.println("Count of Even numbers = " + countEvenNum);
      System.out.println("Count of Odd numbers = " + countOddNum);
   }
}