import java.util.*;

public class Exerice1{
   
   public static int totalVowels(String word){
      int sum=0;
      
      for(int i=0; i<word.length(); i++){
         if(word.charAt(i) == 'a')
            sum++;
         else if(word.charAt(i) == 'e')
            sum++;
         else if(word.charAt(i) == 'i')
            sum++;
         else if(word.charAt(i) == 'o')
            sum++;   
         else if(word.charAt(i) == 'u')
            sum++;
      }
      return sum;
   }
   
   public static int totalVowels(ArrayList<String> arr){
      int sum = 0;
      
      for(String word : arr){
         sum += totalVowels(word);
      }
      return sum;
   }   
   
   public static void main(String args[]){
      ArrayList<String> arr = new ArrayList<String>();
      arr.add("Barbara");
      arr.add("aha");
      System.out.println(totalVowels(arr));
   }
}