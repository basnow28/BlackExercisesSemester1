import java.util.Scanner;

public class Exercise11{
   public static void shortestName(Scanner scanner, int howMany){
      String name = ""; 
      String shortestName = "";
      
      for(int i=1; i<=howMany; i++){
         System.out.print("name #" + i + "?");
         name = scanner.next();
         
         if( i == 1)
            shortestName = name;
         
         if(Math.min(name.length(), shortestName.length()) == name.length())
            shortestName = name;
      }
      
      System.out.println(shortestName +"'s is the shortest");
   }
   
   public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
      System.out.print("How many names? ");
      int howMany = scanner.nextInt();
      System.out.println();
      
      shortestName(scanner, howMany); 
   }
}