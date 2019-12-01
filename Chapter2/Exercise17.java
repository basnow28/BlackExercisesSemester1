public class Exercise17{
   public static int HEIGHT = 4;
   
   public static void plusHash(){
      int width = HEIGHT*2 - 1;
      
      for(int i=1; i<=HEIGHT; i++){
         for(int j=1; j<=width; j++){
            if(j==HEIGHT || (j>HEIGHT-i && j<HEIGHT+i)){
               System.out.print("++");
            }else{
               if(j<=HEIGHT-i)
                  System.out.print("<<");
               else
                  System.out.print(">>");
            }
         }
         System.out.println();
      }
   }
   public static void main(String args[]){
      plusHash();
   }
}