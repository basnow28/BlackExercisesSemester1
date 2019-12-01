import java.util.*;

public class Exercise3{
   
   public static void printPowerOfN(int n, int howManyTimes){
      for(int i=0; i<=howManyTimes; i++){
         System.out.print((int)Math.pow(n,i) + "  ");
      }
   }
   public static void main(String args[]){
      Scanner console = new Scanner(System.in);
      System.out.print("Give me the number: ");
      int number = console.nextInt();
      System.out.print("How many times u want to power the number?");
      int howManyTimes = console.nextInt();
      printPowerOfN(number, howManyTimes);
   }
}