package Lecture27;

public class FindMaxElem {
    public static void main(String[] args) {
        int[] arr = {222, 3, 50, 94, 12};
        int max = arr[0];
        for(int a:arr){
            max = Math.max(max,a);
        }
        System.out.println(max);
    }
}
