package Veryimp_STRINGSSSS;
import java.util.* ;

public class Substring_of_a_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String str = "Manish Yadav" ;
          int n = str.length() ;

          for(int i = 0 ; i < n ;i++){
              for(int j = i+1;j<=n;j++){
                  System.out.println(str.substring(i,j));
              }
          }

    }
}
