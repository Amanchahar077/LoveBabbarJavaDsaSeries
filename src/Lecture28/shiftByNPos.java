package Lecture28;

public class shiftByNPos {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int b = 3;
        int n = arr.length-1;
        revArr(arr,0,n);
        revArr(arr,0,b);
        revArr(arr,b+1,n);
        for(int a:arr){
            System.out.print(a+" ");
        }

    }
    public static void revArr(int[] arr, int st, int end){
        while(st<=end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }
}
