public class Exercise3{
   public static int factorial(int n){
      int score = 1;
      
      if(n==0){
         return 1;
      }else{
         for(int i=n; i>0; i--)
         {
            score *= i;
         }   
      }
      return score;
   }
   public static void main(String args[]){
      for(int i=1; i<=7; i++){
         System.out.println(factorial(i));
      }
   }
}