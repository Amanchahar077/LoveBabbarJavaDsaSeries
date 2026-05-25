package Lecture39;

public class FindPivotOfRotatedArr {
    public static void main(String[] args) {
        //  int[] arr = {4,5,6,7,0,1,2};
        int[] arr = {-66,-67};
        System.out.println(findPivot(arr));
    }
    public static int findPivot(int[] arr){
        int n = arr.length;
        int st = 0,end = n-1,pvt = -1;
        if(arr[st]<arr[end]){
            return -1;
        }
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid]>arr[end]){
                pvt=mid;
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return pvt;
    }
}
