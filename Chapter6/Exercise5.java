import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise5{
   public static void quadSpaces(Scanner input){
      while(input.hasNext()){
         String str = input.next();
         System.out.print(str + "    ");
      }
   }
   public static void main(String args[]) throws FileNotFoundException{
      Scanner input = new Scanner(new File("exercise5.txt"));
      quadSpaces(input);
   }
}