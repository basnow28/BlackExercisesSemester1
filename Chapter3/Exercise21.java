import java.util.*;

public class Exercise21{
   public static void processName(Scanner input){
      System.out.print("Please enter your full name: ");
      String name = input.next();
      System.out.println();
   
      char a; 
      String as;
      
      System.out.print("The name in uppercase characters is: ");
      
      for(int i=0; i<name.length(); i++){
         as = String.valueOf(name.charAt(i));
         a = as.charAt(0);
         a = Character.toUpperCase(a);
         System.out.print(a);
      }
   }
   public static void main(String args[]){
      Scanner input = new Scanner(System.in);  
      processName(input); 
   }
}