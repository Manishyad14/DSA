package Striver_arrays;
import java.util.* ;

public class Missing_NUmber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n  = sc.nextInt() ;
        int []arr = new int[n] ;
        for(int i = 0 ; i< n ; i++){
            arr[i] = sc.nextInt() ;
            if((arr[i]^i) !=0) System.out.println(i);
        }

//        for(int i = 0 ; i < n ; i++) {
//            if (arr[i] != i) {
//                System.out.println("not present" + i);
//            }
//
//
//        }
    }
}
