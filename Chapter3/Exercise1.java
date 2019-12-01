import java.util.*;

public class Exercise1{
   public static void printEvenNumbers(int number){
      for(int i=2; i<=number; i+=2){
         System.out.print("{" + i +"} ");
      }
   }
   public static void main(String args[]){
      Scanner console = new Scanner(System.in);
      int number = console.nextInt();
      printEvenNumbers(number);
   }
}