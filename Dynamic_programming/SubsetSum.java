package Dynamic_programming;
import java.util.* ;



public class SubsetSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int []arr = {8,5,2,4} ;
        int target = 9 ;
        System.out.print(subset(0,0,arr,target));
    }

    private static boolean subset(int i, int sum, int[] arr, int target) {
         if(i==arr.length){
             if(sum==target) return true ;


           else return false ;

         }

        boolean skip = subset(i+1,sum,arr,target) ;

         if(arr[i]+sum > target) return skip ; // only valid for positive numbers



         boolean pick = subset(i+1,sum+arr[i] , arr,target);



         return  pick || skip ;

    }
}
