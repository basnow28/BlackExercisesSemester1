public class Exercise7{
   public static void main(String args[]){
      int number = 5;
      int width = 0;
      int height = 0;
      
      if(number%2 == 1){
         width = (number+1)/2;
         height = number;
      }else{
         width = number/2;
         height = number-1;
      }
      
      for(int i=1; i<=height; i++){
         for(int j=1; j<=width; j++){
            if(j==width || j>Math.abs(width-i)){
               System.out.print(number);
            }else{
               System.out.print(" ");
            }
         }
         System.out.println();
      }
   }
}