import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise1{

   public static void boysGirls(Scanner input){
      int numOfGirls = 0;
      int numOfBoys = 0;
      int girlsSum = 0;
      int boysSum = 0;
      
      while(input.hasNext()){
         String name = input.next();
         int num = input.nextInt();
         
         if(isAGirl(name)){
            numOfGirls++;
            girlsSum += num;
         }else{
            numOfBoys++;
            boysSum += num;
         }
      }
      
      System.out.println("Number of girls: " + numOfGirls);
      System.out.println("Number of boys: " + numOfBoys);
      System.out.println("Difference between sums: " + (Math.abs(girlsSum - boysSum)));
      
   }
   
   public static boolean isAGirl(String name){
      if(name.endsWith("a"))
         return true;
         
      return false;
   }
   public static void main(String args[]) throws FileNotFoundException{
      Scanner input = new Scanner(new File("exercise1.txt"));
      boysGirls(input);
      
   }
}