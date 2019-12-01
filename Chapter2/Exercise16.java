public class Exercise16{
   
   public static void plusHash(int height){
      int width = height*2 - 1;
      
      for(int i=1; i<=height; i++){
         for(int j=1; j<=width; j++){
            if(j==height || (j>height-i && j<height+i)){
               System.out.print("++");
            }else{
               if(j<=height-i)
                  System.out.print("<<");
               else
                  System.out.print(">>");
            }
         }
         System.out.println();
      }
   }
   public static void main(String args[]){
      plusHash(6);
   }
}