package recursion;
import java.util.*;


public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(factorial(n));


    }


    public static int factorial(int n){

        //base function
        if(n==0){
            return 1 ;
        }


        //our recursion function
        return n * factorial(n-1);


    }
}
