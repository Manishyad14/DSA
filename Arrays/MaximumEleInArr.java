package Arrays;
import java.sql.SQLOutput;
import java.util.*;


public class MaximumEleInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n] ;
        for(int i = 0 ; i < n ; i++){
            arr[i]=sc.nextInt();
        }

//         Method 1 >>  initialising the starting element of the array as the maximum
//        int max = arr[0] ;
//        for(int i = 1 ; i < n  ; i++){
//            if(arr[i]>max){
//                max = arr[i] ;
//            }
//        }
//        System.out.println(max);

        //Method 2 >>
        int max = Integer.MIN_VALUE ;

        for(int i = 0 ; i < n ; i++){
            max  = Math.max(max,arr[i]);
        }
        System.out.println(max);




    }
}
