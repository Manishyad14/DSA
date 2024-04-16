package Arrays;
import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int  []arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        //we will first find the maximum element present in the array
        int max = Integer.MIN_VALUE ;
        for(int i = 0 ; i < n ; i ++){
             max = Math.max(max , arr[i]);
            //System.out.println(max);

        }

        //at this point we have maximum elemenbt in the array
        //now we are going for ther second element-->>
        int Smax = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++) {
            if (arr[i] !=max) {
                Smax = Math.max(Smax, arr[i]);
            }
        }
        System.out.println(Smax);




    }
}
