public class Exercise18{
   public static void printFrame(int width){
      System.out.print("#");
      
      for(int j=1; j<=width; j++){
         for(int i=1; i<=6; i++){
            System.out.print("-");
         }
         System.out.print("#");
      }   
      
      System.out.println();
   }
   
   public static void printInside(int width){
      
      for(int x=1; x<=3; x++){
         System.out.print("!");
         for(int j=1; j<=width; j++){
            for(int i=1; i<=6; i++){
               System.out.print(" ");
            }
            System.out.print("!");
         }
         System.out.println();   
      }
   }
   
   public static void printFigure(int height,int width){
      for(int i=1; i<=height; i++)
      {
         printFrame(width);
         printInside(width);
      }
      printFrame(width);
   }
   public static void main(String args[]){
      int height = 2;
      int width = 5;
      printFigure(height, width);
   }
}