package recursion;
import java.util.*;

public class Displayarrayusingrecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();

        }
       reversearray(arr);

    }

    public static int reversearray(int []arr , int index){

         return arr[index];
         reversearray(arr,index+1);



    }




}
