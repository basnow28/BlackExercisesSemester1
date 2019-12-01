public class Exercise2{
   public static void main(String args[]){
   
      for(int row=1; row<=6; row++){
         
         if(row==1 || row==6){
            for(int i=1; i<=40; i++)
            {
               System.out.print("*");
            }
         }else{
            for(int i=1; i<=40; i++)
            {
               if(i==1 || i==40)
                  System.out.print("*");
               else
                  System.out.print(" ");
            }
         }
         System.out.println();
      }
   }
}

