package Lecture30;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int[] res = twoSum(arr,9);
        for(int a:res){
            System.out.print(a+" ");
        }
    }
    public static int[] twoSum(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        int[] res = {};
        return res;
    }
}
