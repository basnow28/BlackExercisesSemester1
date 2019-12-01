public class Exercise3{
   public static int evensInRange(int []arr, int min, int max){
      int howMany = 0;
      
      for(int i=0; i<arr.length; i++){
         if(arr[i] > min && arr[i] < max){
            if(arr[i]%2 == 0){
               howMany++;
            }
         }
      }
      
      return howMany;
   }
   
   public static void main(String args[]){
      int arr[] = {90, 85, 4, 35, 76, 9, 23, 4};
      System.out.println(evensInRange(arr, 3, 35));
   }
}