package Lecture29;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,5,4,5,3,4};
        System.out.println(findUnique(arr));
    }
    public static int findUnique(int[] arr){
        int xorSum = 0;
        for(int a:arr){
            xorSum^=a;
        }
        return xorSum;
    }
}
