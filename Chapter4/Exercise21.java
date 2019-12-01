public class Exercise21{
   public static int armstrongNumber(int number){
      int score = 0;
      String strNum = Integer.toString(number);
      int power = strNum.length();
      int digit = number%10;
      
      for(int i=0; i<power; i++){
         score += Math.pow(digit, power);
         number/=10;  
         digit = number%10;
      }
      return score;
   }
   
   public static void armstrongNumbers(int maximum){
      for(int i=100; i<=maximum; i++){
         if(armstrongNumber(i) == i)
         {
            System.out.println(i);
         }
      }
   }
   
   public static void main(String args[]){
      armstrongNumbers(1000);
   
   }
}