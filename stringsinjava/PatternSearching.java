package Veryimp_STRINGSSSS;
import java.util.* ;

public class PatternSearching {
    public static boolean isFOund(String str1 , String str2){
            return str1.contains(str2) ;

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
          String str1 = " hello manish welocome the company ";
          String str2 = "manish" ;
        System.out.println(isFOund(str1,str2));
    }
}
