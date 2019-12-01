import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise4{
   public static double howMuchMoney(String type, int numOfCoins){
      switch(type.toLowerCase()){
         case "pennies":
            return 1.0 * numOfCoins;
         case "quarters":
            return 25 * numOfCoins;
         case "nickels":
            return 5 * numOfCoins;
         default: // dimes
            return 10 * numOfCoins;             
      }
   }
   public static double cointCoins(Scanner input){
      String type;
      int howManyCoins;
      double sum = 0;
      
      while(input.hasNext()){
         howManyCoins = input.nextInt();
         type = input.next();
         sum += howMuchMoney(type, howManyCoins);
      }
      
      return sum/100.00;
      
   }
   public static void main(String args[]) throws FileNotFoundException{
      Scanner input = new Scanner(new File("exercise4.txt"));
      System.out.println("Total money: $" + cointCoins(input));
   }
}