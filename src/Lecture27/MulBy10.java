package Lecture27;

public class MulBy10 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 12};
        int[] num = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            num[i] = arr[i]*10;
        }
        for(int a : num){
            System.out.print(a+" ");
        }
    }
}
