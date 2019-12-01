public class Exercise13{
   public static void top(){
      System.out.println("   **");
      System.out.println("  * *");
      System.out.println(" *  *");
      middle();
   }
   
   public static void bottom(){
      middle();
      System.out.println(" *  *");
      System.out.println("  * *");
      System.out.println("   **");
   }
   
   public static void line(){
      System.out.println("*****");
   }
   
   public static void middle(){
      System.out.println("*   *");
   }
   
   public static void main(String args[]){
      top();
      line();
      middle();
      middle();
      middle();
      middle();
      line();
      bottom();
      top();
      line();
      line();
      line();
      line();
   }
}