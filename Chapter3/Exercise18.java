public class Exercise18{
   public static void reverseVertical(String text){
   
      for(int i=text.length() -1; i>=0; i--){
         System.out.println(String.valueOf(text.charAt(i)));
      }
   }
   
   public static void main(String args[]){
      reverseVertical("laptop");
   }
}