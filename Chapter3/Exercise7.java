public class Exercise7{
   public static int smallestAbsVal(int a, int b, int c){
      int min; 
      min = Math.min(Math.abs(a), Math.abs(b));
      min = Math.min(min, Math.abs(c));
      return min;
   }
   public static void main(String args[]){
      System.out.print(smallestAbsVal(-8,2,12));
   }
}