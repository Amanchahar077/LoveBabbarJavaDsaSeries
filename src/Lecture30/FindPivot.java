package Lecture30;

public class FindPivot {
    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        System.out.println(bestApproach(arr));
    }
    public static int getSum(int[] arr,int st,int end){
        int sum = 0;
        for(int i=st;i<end;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int bestApproach(int[] arr){
        int n = arr.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        int sum2 = 0;
        for(int i=0;i<n;i++){
            sum2+=arr[i];
            leftSum[i] = sum2;
        }

        int sum1 = 0;
        for(int i=n-1;i>=0;i--){
            sum1+=arr[i];
            rightSum[i] = sum1;
        }

//        for(int a:leftSum){
//            System.out.print(a+" ");
//        }
//        System.out.println();
//        for(int a:rightSum){
//            System.out.print(a+" ");
//        }

        for(int i=0;i<n;i++){
            if(leftSum[i]==rightSum[i]){
                return arr[i];
            }
        }
        return -1;

    }
}
