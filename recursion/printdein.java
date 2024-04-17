package recursion;


import java.sql.SQLOutput;
import java.util.Scanner;

public class printdein {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();


   PDI(n);


    }

    public static void PDI(int n){

        if(n==1) {
            System.out.print(1); // this is our base case where we have to stop our recursion...
            return ;
        }

        System.out.print(n + " ");
        PDI(n-1);
       // PDI(n-1);
        System.out.print(n+ " ");



    }


}
