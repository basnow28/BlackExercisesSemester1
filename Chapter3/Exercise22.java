import java.util.*;
public class Exercise22{
   public static String examResult(int internalScore, int finalScore){
      if(internalScore < 20)
         return "You failed";
      else if(finalScore < 40)
         return "You failed";
         
      return "You have passed!";
   }
   public static void main(String args[]){
      Scanner console = new Scanner(System.in);
      System.out.print("What is your internal test score? "); 
      int internalScore = console.nextInt();
      System.out.print("What is your final exam score? ");
      int finalScore = console.nextInt();
      
      System.out.println(examResult(internalScore, finalScore));
   }
}