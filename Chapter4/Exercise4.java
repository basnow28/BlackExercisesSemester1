public class Exercise4{
   
   public static String collorsInRainbow(int number){
      switch(number){
         case 1:
            return "Violet";
         case 2:
            return "Indigo";
         case 3:
            return "Blue";
         case 4:
            return "Green";
         case 5:
            return "Yellow";
         case 6: 
            return "Orange";
         default:
            return "Red";
      }
   }
   public static void main(String args[]){
      System.out.println(collorsInRainbow(7));
   }
}