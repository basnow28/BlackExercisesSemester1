import java.util.*;

public class Exercise2{
   public static void printPowersOf10(int howManyNumbers){
      for(int i=5; i>=howManyNumbers; i--){
         System.out.print((int)Math.pow(10,i) + "  ");
      } 
   }
   
   public static void main(String args[]){
      Scanner console = new Scanner(System.in);
      
      System.out.print("Give the numbers from 0 to 5:  ");
      int howManyNumbers = console.nextInt();
      
      printPowersOf10(howManyNumbers);
   }
}