package Veryimp_STRINGSSSS;
import java.util.* ;

public class Remove_Brackets_from_expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String str = "(5+6)" ;

        StringBuilder result = new StringBuilder() ;

        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i)!='('&& str.charAt(i)!=')'){
                result.append(str.charAt(i)) ;
            }
        }

        System.out.println(result.toString());
    }
}
