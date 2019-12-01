public class Exercise8{
   public static void quadratic(int a, int b, int c){
      double x1; 
      double x2;
      double sqrtScore = b*b - 4*a*c;
      
      if(a!=0 && b!=0){
         x1 = (-1 * b + Math.sqrt(sqrtScore))/2*a;
         x2 = (-1 * b - Math.sqrt(sqrtScore))/2*a;
         System.out.println("x1 = " + x1 +"\nx2 = " + x2);
      }
      else if(b==0 && sqrtScore >= 0){
         x1 = Math.sqrt(-1*4*a*c)/2*a;
         System.out.println("x = " + x1);
      }
      else if(sqrtScore < 0){
         System.out.println("Cant solve the equation");
      }
      else{
         System.out.println("x = " + c);
      }
   }
   public static void main(String args[]){
      quadratic(1,-7,12);
   }
}