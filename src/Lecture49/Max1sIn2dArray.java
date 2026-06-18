package Lecture49;

public class Max1sIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {0, 0, 1, 1},
                {0, 1, 1, 1},
                {0, 0, 0, 1},
                {1, 1, 1, 1}
        };
        System.out.println(max1s(arr));
    }

    public static int max1s(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        int maxOnes = -1;
        int row = -1;
        for(int i=0;i<m;i++){
            int[] arr1 = new int[m];
            arr1 = arr[i];
            int temp = noOfOnes(arr1);
            if(temp>maxOnes){
                maxOnes=temp;
                row=i;
            }
        }
        return row;
    }

    public static int noOfOnes(int[] arr){
        int n = arr.length;
        int st = 0;
        int end = n-1;
        int ans = -1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid]==0){
                st=mid+1;
            }
            else{
                ans = mid;
                end=mid-1;
            }
        }
        if(ans==-1){
            return 0;
        }
        return n-ans;
    }
}
