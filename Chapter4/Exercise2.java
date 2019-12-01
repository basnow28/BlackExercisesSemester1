import java.io.*;

public class Exercise2{
   public static String repeat(String word){
      int size = word.length();
      String finalWord = "";
      
      for(int i=0; i<size; i++){
         finalWord += word;
      }
      
      return finalWord;
   }
   
   public static void main(String args[]){
      System.out.print(repeat("hello"));
   }
}