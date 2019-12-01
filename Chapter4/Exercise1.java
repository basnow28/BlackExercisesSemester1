public class Exercise1{
   public static double sumSequence(int n){
      double score = 0;
      
      for(double i=1; i<=n; i++){
         score += (1/(i*(i+2)));
      }
      return score;
   }
   
   public static void main(String args[]){
      System.out.println(sumSequence(5));
   }
}