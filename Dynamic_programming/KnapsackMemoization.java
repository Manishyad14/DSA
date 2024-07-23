package Dynamic_programming;
import java.util.* ;


public class KnapsackMemoization {

    private static int profit(int index, int[] weight, int[] value, int capacity, int[][] dp) {
               if(index==weight.length) return 0 ;
               if(dp[index][capacity]!=-1) return dp[index][capacity] ;
               int skip = profit(index+1 , weight , value,capacity,dp) ;
               if(weight[index]>capacity) return dp[index][capacity] = skip ;
               int pick = value[index] + profit(index+1,weight,value,capacity-value[index],dp) ;

               return dp[index][capacity]  = Math.max(pick,skip) ;






    }


    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in) ;
        int []value = {5,3,7,16} ;
        int []weight = {1,2,8,10} ;
        int capacity = 8 ;
        int n = weight.length ;
        //Here Two variables are changing
        //index from 0 to n-1
        //and the capacity and we are decreasing the capacity from C to  0 ;
        int [][]dp = new int[n][capacity+1] ;
        for(int i = 0 ; i < dp.length ;i++){
            for(int j = 0 ;  j < dp[0].length;j++){
                 dp[i][j] = -1 ;
            }
        }

        System.out.print(profit(0 , weight,value , capacity,dp)) ;



    }


}
