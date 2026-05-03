package Lecture28;

public class RevArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int st =0;
        int end = n-1;
        while(st<=end){
            int temp = arr[st];
            arr[st]  = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
