package Lecture50;

public class SearchInInfiniteArr {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200};
        System.out.println(findIndex(arr,90));
    }
    public static int findIndex(int[] arr,int target){
        if(arr[0]==target){
            return 0;
        }
        int i=1;
        int st=1;
        while(arr[i]<=target){
            st=i;
            i=i*2;
        }
        int end = i;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return -1;
    }
}
