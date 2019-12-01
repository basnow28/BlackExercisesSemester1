public class Exercise19{
   public static void printLowercase(String text){
      char a;
      String as;
      
      for(int i=0; i<text.length(); i++){
         as = String.valueOf(text.charAt(i));
         a = as.charAt(0);
         System.out.print(Character.toLowerCase(a));
      }
   }
   
   public static void main(String args[]){
      printLowercase("PROGRAMMING");
   }
}