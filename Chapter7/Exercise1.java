public class Exercise1{
   public static int firstIndexOf(int[] arr, int number){
      for(int i=0; i<arr.length; i++){
         if(arr[i] == number){
            return i;
         }
      }
      return -1;
   }
   
   public static void main(String args[]){
      int [] arr = {47, 58, 201, 98, 106, 58, 65};
      System.out.println(firstIndexOf(arr, 2));
   }
}