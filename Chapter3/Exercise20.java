import java.util.*;

public class Exercise20{
   public static void applicationDate(Scanner console){
      
      System.out.print("On what day of the month you applied?");
      int day = console.nextInt();
      System.out.println();
      
      System.out.print("What is the name of the month in which you applied?");
      String month = console.next();
      System.out.println();
     
      System.out.print("During which year you applied?");
      int year = console.nextInt();
      System.out.println();
      
      System.out.println("Your application date is " + month + " " + day + ", " + year);
   }
   
   public static void main(String args[]){
      Scanner console = new Scanner(System.in);
      
      applicationDate(console);
      
   }
}