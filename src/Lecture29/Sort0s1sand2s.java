package Lecture29;

public class Sort0s1sand2s {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2};
        sort(arr);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
    public static void sort(int[] arr){
        int st = 0;
        int end = arr.length-1;
        int mid = 0;
        while(mid<=end){
            if(arr[mid]==0){
                int temp = arr[st];
                arr[st] = arr[mid];
                arr[mid] = temp;
                st++;
                mid++;
            }
            else if(arr[mid]==2){
                int temp = arr[end];
                arr[end] = arr[mid];
                arr[mid] = temp;
                end--;
            }
            else{
                mid++;
            }
        }
    }
}
