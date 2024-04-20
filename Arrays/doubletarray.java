package Arrays;
import java.util.*;

public class doubletarray {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr  = new int[n] ;
        //taking array as a input from the user
        for(int i = 0 ; i < n ; i++){
            arr[i]=sc.nextInt();
        }
        //taking input from the user for target sum
        int tsum =sc.nextInt();
      //  int rem = 0 ;
        for(int i =0;i<n;i++){
           // rem = arr[i]-tsum; // this is the remaining sum from the target sum

          for (int j = i+1; j < n; j++) {

              if(arr[i]+arr[j]==tsum){
                  System.out.println(arr[i]+" "+arr[j]);
              }

          }

          }



        }









    }

