package Lecture46;

public class SearchInNearlySortedArray {
    public static void main(String[] args) {
        int[] arr = {3,5,10,9,11};
        int k = 10;
        System.out.println(searchElem(arr,k));
    }
    public static int searchElem(int[] arr, int k){
        int n = arr.length;
        int st = 0;
        int end = n-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(k==arr[mid]){
                return mid;
            }
            if(mid+1<n && k==arr[mid+1]){
                return mid+1;
            }
            if(mid-1>=0 && k==arr[mid-1]){
                return mid-1;
            }
            if(k<arr[mid]){
                end = mid-2;
            }
            else{
                st=mid+2;
            }
        }
        return -1;
    }
}
