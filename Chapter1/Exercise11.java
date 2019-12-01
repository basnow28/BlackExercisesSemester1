public class Exercise11{
   public static void top(int copies){
      for(int i=1; i<=copies; i++)
         System.out.print(" | Sea | \t");
      System.out.println();
         
      for(int i=1; i<=copies; i++)
         System.out.print(" |Horse| \t");
      System.out.println();
         
      for(int i=1; i<=copies; i++)
         System.out.print("  |   |  \t");
      System.out.println();
         
      for(int i=1; i<=copies; i++)
         System.out.print("  |   |  \t");
      System.out.println();
         
      for(int i=1; i<=copies; i++)
         System.out.print("  |   |  \t");
      System.out.println(); 
   }
   public static void bottom(int copies){ 
      for(int i=1; i<=copies; i++)
         System.out.print("---------\t");
      System.out.println();   
         
      for(int i=1; i<=copies; i++)   
         System.out.print("@       @\t");
      System.out.println();
            
      for(int i=1; i<=copies; i++)
         System.out.print(" @     @ \t");
      System.out.println();
         
      for(int i=1; i<=copies; i++)
         System.out.print("  -----  \t");
      System.out.println();
   }
   
   public static void main(String args[]){
      int copies = 2;
      top(copies);
      bottom(copies);
   }
}