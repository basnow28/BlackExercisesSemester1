public class Exercise10{
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
      System.out.println("\"_'_\"_'_\"");
   }
   public static void main(String args[]){
      top();
      bottom();
      middle();
      top();
      bottom();
      middle();
      bottom();
      top();
      middle();
      bottom();
   }
}