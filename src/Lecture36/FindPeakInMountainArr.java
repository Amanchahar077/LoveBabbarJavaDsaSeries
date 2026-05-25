package Lecture36;

public class FindPeakInMountainArr {
    public static void main(String[] args) {
        int[] arr ={0,2,5,3,1};
        System.out.println(findPeak(arr));
    }
    public static int findPeak(int[] arr){
        //{0,2,5,3,1}
        int n = arr.length;
        int st = 0;
        int end = n-1;
        int peak = 0;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid]<arr[mid+1]){
                st=mid+1;
            }
            else{
                peak=mid;
                end=mid-1;
            }
        }
        return peak;
    }
}
