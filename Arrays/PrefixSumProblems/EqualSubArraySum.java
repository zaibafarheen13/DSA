// Program to check if an array can be partitioned into syb-arrays with equal sum
package Arrays.PrefixSumProblems;

public class EqualSubArraySum {

    static int[] arr={1,3,5,6,2,1};
    public static void main(String args[]){
        System.out.println("Equal partition possible: "+equalSumPartition(arr));
      }

    static int findArraySum(int[] arr){
        int totalSum=0;
        for(int i=0;i<arr.length;i++){
            totalSum+=arr[i];
        }
        return totalSum;
    }

    static boolean equalSumPartition(int[] arr){
        int totalSum=findArraySum(arr);

        int prefSum=0;
        for(int i=0;i<arr.length;i++){
            prefSum+=arr[i];

            int suffixSum=totalSum-prefSum;
            if(suffixSum==prefSum){
                return true;
            }
        }
        return false;
    }
}
