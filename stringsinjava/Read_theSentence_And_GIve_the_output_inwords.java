package Veryimp_STRINGSSSS;
import java.util.* ;

public class Read_theSentence_And_GIve_the_output_inwords {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in) ;
        String sentence = sc.nextLine();

        // Split the sentence into words using a regular expression
        // "\\s+" matches one or more whitespace characters
        String[] words = sentence.split("\\s+|,|\\t|\\n");

        // Print each word on a new line
        for (String word : words) {
            System.out.println(word + " ");
        }
    }
}
