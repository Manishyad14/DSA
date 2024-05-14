package stringsinjava;
import java.util.* ;

public class Count_Vowels {
    public static void main(String[] args) {
     Scanner sc  = new Scanner(System.in) ;

     String str = sc.nextLine();

     String lower = str.toLowerCase() ;
        int Vowel = 0 ;
        int consonants = 0 ;

     for(int  i = 0 ; i < lower.length() ; i++){
         if(lower.charAt(i) == 'a' || lower.charAt(i) == 'e' || lower.charAt(i) == 'i' ||
                 lower.charAt(i) == 'o' || lower.charAt(i) == 'u'
         ){
              Vowel ++ ;
         }
         else{
             consonants ++ ;

         }

     }
        System.out.println("The total number of Vowels are : " + Vowel);
        System.out.println("The total number of consonants are : " + consonants);




    }
}
