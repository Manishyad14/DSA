package Arrays;
import java.util.*;


public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int []arr = new int[n] ;


        for(int  i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt() ;

        }
        System.out.println("The Element to be searched::");
        int x = sc.nextInt();

        for(int i = 0 ; i < n ;i++){
            if(arr[i]==x){
                System.out.println(true);
                break;
            }
            else{
                System.out.println(false);

            }

        }




    }
}
