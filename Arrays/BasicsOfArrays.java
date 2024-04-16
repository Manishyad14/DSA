package Arrays;
import java.util.* ;


public class BasicsOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking input of the array from the user
        int n = sc.nextInt() ;
        //array declarration
        int []arr = new int[n];
        for(int i = 0 ; i  < n ;  i++){
            arr[i] = sc.nextInt();
        }


        //output of the array
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }




    }
}
