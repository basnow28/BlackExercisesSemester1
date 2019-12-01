public class Exercise8{
   static void javaOutput()
   {
      for(int i=0; i<40; i++){
         System.out.print("^");
      } 
   }
   
   static void javaIntro()
   {
      System.out.print("\n!! Introduction to Java Programming !!\n");
   }
   
   public static void main(String args[]){
      for(int i=1; i<=5; i++){
         javaOutput();
         javaIntro();
      }
      javaOutput();
   }
}