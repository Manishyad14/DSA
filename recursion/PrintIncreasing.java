package recursion;
import java.util.*;


public class PrintIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printin(n);

    }

    public static void printin(int n){
        if(n==1){
            System.out.println(1);
            return ;
        }

        printin(n-1);
        System.out.println(n);


    }

}
