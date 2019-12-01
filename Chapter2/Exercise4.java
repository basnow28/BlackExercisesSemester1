public class Exercise4{
   public static void main(String args[]){
      int height = 4;
      int width = height*height - 1;
      
      for(int i=1; i<=height; i++){
         for(int j=1; j<=width; j++){
            if(j==height || (j>height-i && j<height+i)){
               System.out.print("+");
            }else{
               System.out.print(" ");
            }
         }
         System.out.println();
      }
   }
}