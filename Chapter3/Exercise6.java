public class Exercise6{
   public static int smallerAbsVal(int a, int b){
      return Math.min(Math.abs(a), Math.abs(b));
   }
   
   public static void main(String args[]){
      int a, b;
      a=-1;
      b=-8;
      System.out.println("From two numbers: " + a + " and " + b + ",  ");
      System.out.println(smallerAbsVal(a,b) + "  is absolutely smaller");
   }
}