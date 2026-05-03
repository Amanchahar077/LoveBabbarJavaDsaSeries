package Lecture29;

public class SortArr0sAnd1s {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,0,1};
        int st = 0;
        int end = arr.length-1;
        while(st<=end){
            if(arr[st]==0){
                st++;
            }
            if(arr[end]==1){
                end--;
            }
            if(arr[st]==1&&arr[end]==0){
                int temp = arr[st];
                arr[st] = arr[end];
                arr[end] = temp;
                st++;
                end--;
            }

        }
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
