public class Exercise11{
   public static void printNumbers(int lastNumber, int numOfColumns){
      System.out.print("|");
      
      for(int i=1; i<=numOfColumns; i++){
         for(int j=1; j<=lastNumber; j++){
            System.out.print(j);
         }
         
         System.out.print("|");
      }
      System.out.println();
   }
   
   public static void printTheBottom(int length, int numOfColumns){
      
      for(int j=1; j<=numOfColumns; j++){
         for(int i=1; i<=length; i++){
            System.out.print("~");
         }
         System.out.print(" ");
      }
      System.out.println();
   }
   
   public static void main(String args[]){
      printNumbers(6,4);
      printTheBottom(6,4);
      printNumbers(4,4);
      printTheBottom(4,4);
   }
}