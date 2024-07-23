package Dynamic_programming;
import java.util.* ;

public class Knapsack {

    public static int profit(int index , int []weight,int []val,int capacity){

        if(index==weight.length) return 0 ;


        int skip = profit(index+1,weight,val,capacity-weight[index]);
        if(weight[index]>capacity) return skip ;

        int pick = val[index] + profit(index+1,weight,val,skip);

        return Math.max(pick,skip) ;







    }







    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
       int []val = {5,3,7,16};
       int []weight = {1,2,8,10};
       int capacity = 8 ;
       System.out.print(profit(0,weight,val,capacity));
    }
}
