package Striver_arrays;
import java.util.* ;

public class maximum_consecutives_ones {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int []arr  = new int[n] ;
        for(int i = 0 ; i< n ;i++){
            arr[i] = sc.nextInt() ;
        }

        int count = 0  , max = 0 ;
        for(int i = 0 ; i< n ; i++){
            if(arr[i]==1)count ++ ;
            max= Math.max(count,max) ;
            if(arr[i]==0)count = 0 ;
        }

        System.out.println(max);
    }
}
