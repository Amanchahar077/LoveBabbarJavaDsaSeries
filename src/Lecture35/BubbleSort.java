package Lecture35;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,2,6,4,7};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    arr[j]=arr[j]^arr[j+1];
                    arr[j+1]=arr[j]^arr[j+1];
                    arr[j]=arr[j]^arr[j+1];
                }
            }
        }
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
