public class Exercise9{
   public static int sumOfDigits(int number){
      if(number < 0){
         number *= -1;
      }
      
      int sum = 0;
      
      while(number > 0){
         sum += number%10;
         number /= 10;
      }
      return sum;
   }
   
   public static void main(String args[]){
      System.out.println(sumOfDigits(-99));   
   }
}