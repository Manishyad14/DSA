package Veryimp_STRINGSSSS;
import java.util.* ;

public class Longest_Common_Subsequence {



    public static int max(int a , int b){
        return (a > b)? a : b;

    }

    //Naive recursive approach-->>
    public static int LCS(char []ch1 , char []ch2 , int n , int m){
        if(m==0||n==0) return 0 ;



        if(m-1 == n-1){
            return 1 + LCS(ch1,ch2,n-1,m-1) ;
        }else{
                return max(LCS(ch1,ch2,n-1,m),LCS(ch1,ch2,n,m-1)) ;
        }
    }


    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in) ;
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";


        char []X = s1.toCharArray();
        char []Y = s2.toCharArray();
        int n = X.length ;
        int m = Y.length ;

        System.out.println(LCS(X,Y,n-1,m-1));
    }
}
