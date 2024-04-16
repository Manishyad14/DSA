package Arrays;
import java.util.*;
public class productOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        int [] arr = new int[n] ;
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt() ;
        }


        int product = 1 ;
        for(int i = 0 ; i < n ; i++){
            product = product*arr[i];
        }
        System.out.print(product);





    }
}
