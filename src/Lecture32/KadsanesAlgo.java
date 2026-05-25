package Lecture32;

public class KadsanesAlgo {
    public static void main(String[] args) {
        int[] num = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(num));
    }
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int i=0;
        int n = nums.length;
        while(i<n){
            sum=sum+nums[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
            i++;
        }
        return max;
    }
}
