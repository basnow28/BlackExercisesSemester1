public class Exercise15{
   
   public static void printTriangle(int height){
      int width = height*2 + 1;
      int gap = 0;
      int howManyNum = 0;
      
      for(int row=1; row<=height; row++){
         howManyNum = row*2 - 1;
         gap = (width - howManyNum)/2;
         
         for(int index=1; index<=width; index++){
            if(index>gap && index < (width-gap)){
               for(int i=1; i<=howManyNum; i++){
                  System.out.print(i);
                  index+=1;
               }
               index-=1;
            }else{
               if(row==1 && index == width-gap){
                  System.out.print("1");
               }else{
                  System.out.print("-");
               }
            }
         }
         System.out.println();
      }
   }
   
   public static void main(String args[]){
      printTriangle(5);
   }
}