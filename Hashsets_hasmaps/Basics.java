package Hashsets_hasmaps;
import java.util.*;



public class Basics {


    public static void main(String[] args) {
      //initialkzation of hasset
        HashSet<Integer>set = new HashSet<>();
        //inserting elelments into the hassets
        set.add(10);
        set.add(101);
        set.add(-20);
        set.add(19);
        //the elelments stored in the hash sets are not necessarily in the same order
        System.out.println(set);
        //time complexity to inset the element in the hasset is O(1);
        //Searching the element in the hashsets take O(1);
        System.out.println(set.contains(10));//output is in true or false;



        //Gives the size of the Hashsets-->>
        System.out.println(set.size());



        //__________________________________________
        //Iterator in hashsets
        HashSet<String>set2 = new HashSet<>() ;
        set2.add("Manish") ;
        set2.add("yadav") ;

        //Converting Hash set to arrays
        Object[] array = set2.toArray();
        System.out.println(Arrays.toString(array));
        



    }
}
