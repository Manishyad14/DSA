package strings;
import java.util.* ;
public class StringBuilderFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        //Taking input in hte normal string
        String str = sc.nextLine() ;

        //Taking input in the string builder
        StringBuilder sb = new StringBuilder(sc.nextLine()) ;
        //bascically we are taking input in the form string in th estyring buyilder

        //When we want to change the character in the string at the particular index
        //we can use setChartAt(Index,character) ;
        sb.setCharAt(2,'f');

    }
}
