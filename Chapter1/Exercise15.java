public class Exercise15{
   public static void top(){
      System.out.println("   $$$   ");
      System.out.println("  $   $  ");
      System.out.println(" $     $ ");
   }
  
   public static void bottom(){
      System.out.println(" $     $ ");
      System.out.println("  $   $  ");
      System.out.println("   $$$   ");
   }
  
   public static void middle(){
      System.out.println("+-------+");
   }
  
   public static void start(){
      System.out.println("| START |");
   }
  
   public static void main(String args[]){
      top();
      bottom();
      bottom();
      middle();
      top();
      start();
      bottom();
      middle();
     
   }
}