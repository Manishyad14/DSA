package Veryimp_STRINGSSSS;
import java.util.* ;

public class Remove_special_characters_from_string {

    public static String Remove_String(String s){
          StringBuilder result = new StringBuilder() ;

          for(char c : s.toCharArray()){
              if(Character.isLetter(c)){
                  result.append(c) ;
              }
          }


          return result.toString();

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String str = sc.nextLine() ;

        System.out.println(Remove_String(str));

    }
}
