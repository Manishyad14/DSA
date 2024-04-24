package Arrays;
import java.util.*;


public class Sort0sand1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int  n  = sc.nextInt() ;
        int  []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        //Now we will calculate the number of zeroes and ones in the array
// This method is called as "TWO PASS SOLUTION_____>>>>>>
//        int noOfZeroes = 0 , noOfOnes = 0 ;
//
//        for(int i = 0 ; i<n;i++){
//            if(arr[i]==0) noOfZeroes++;
//            else   noOfOnes++   ;
//
//
//
//
//        }
//
//
//        for (int i = 0;i<noOfZeroes;i++){
//            arr[i] = 0 ;
//        }
//
//        for(int i = noOfZeroes ; i<n;i++){
//            arr[i] = 1;
//        }
//
//        System.out.println("The array after sorting is ::");
//
//        for (int i = 0 ; i < n ; i++){
//            System.out.print(arr[i] + " ");
//
//        }
//






    }
}
