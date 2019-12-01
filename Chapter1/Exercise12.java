public class Exercise12{
   public static void sunShower(){
      System.out.print("A sunshiny shower \n" +
                       "Won't last an hour.\n");
   }
   
   public static void rainClear(){
      System.out.print("Rain before seven; \n" +
                       "Clear by eleven. \n");
   }
   
   public static void main(String args[]){
      sunShower();
      sunShower();
      rainClear();
      sunShower();
      sunShower();
      rainClear();
      sunShower();
      sunShower();
   }
}