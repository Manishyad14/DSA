package Veryimp_STRINGSSSS;
import java.util.* ;

public class Minimum_number_ofPs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String str = "Mansihpppyy" ;
         int count  = 0 ;
         int removal_count = 0 ;

        for(int i = 0 ; i < str.length();i++){
             if(str.charAt(i)=='p'){
                 count ++ ;


                 if(count>2){
                     removal_count++ ;
                 }
             }
             else{
                 count = 0 ;
             }


        }

        System.out.println(removal_count);
    }
}
