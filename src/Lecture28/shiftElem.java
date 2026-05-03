package Lecture28;

public class shiftElem {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length-1;
        int temp = arr[n];
        for(int i=n;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
