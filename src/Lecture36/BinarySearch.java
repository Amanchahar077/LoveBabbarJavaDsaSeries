package Lecture36;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90};
        int result = targetElement(arr,80);
        System.out.println(result);
    }
    public static int targetElement(int[] arr,int target){
        int n = arr.length;
        int st = 0;
        int end = n-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                st=mid+1;
            }

        }
        return -1;
    }
}
