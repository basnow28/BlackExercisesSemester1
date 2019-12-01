public class Exercise3{

   public static boolean isSpring(int month, int day){
      if(month >= 3 && month <= 6){
         if(month == 3 && day >= 16){
            return true;
         }
         else if(month == 6 && day <= 15){
            return true;
         }
         else if(month == 4 || month == 5){
            return true;
         }
      }
      return false;
   }
   
   public static boolean isSummer(int month, int day){
      if(month >= 6 && month <= 9){
         if(month == 6 && day >= 16){
            return true;
         }
         else if(month == 9 && day <= 15){
            return true;
         }
         else if(month == 7 || month == 8){
            return true;
         }
      }
      return false;
   }
   
   public static boolean isAutumn(int month, int day){
      if(month >= 9 && month <= 12){
         if(month == 9 && day >= 16){
            return true;
         }
         else if(month == 12 && day <= 15){
            return true;
         }
         else if(month == 10 || month == 11){
            return true;
         }
      }
      return false;
   }
   
   public static boolean isWinter(int month, int day){
      if(month == 12 || month <= 3){
         if(month == 12 && day >= 16){
            return true;
         }
         else if(month == 3 && day <= 15){
            return true;
         }
         else if(month == 1 || month == 2){
            return true;
         }
      }
      return false;
   }

   public static String season(int month, int day){
      if(isSummer(month, day)){
         return "summer";
      }
      if(isSpring(month, day)){
         return "spring";
      }
      if(isAutumn(month, day)){
         return "fall";
      }
      return "winter";
   }
   
   public static void main(String args[]){
      System.out.println(season(6,17));
   }
}