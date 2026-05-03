package Lecture29;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {5,6,0,2,4,1,8,7};
        System.out.println(missingNum(arr));
        System.out.println(getMissingUsingXor(arr));
    }
    public static int missingNum(int[] arr){
        int n = arr.length;
        int[] newArr = new int[n+1];
        for(int i=0;i<n;i++){
            int temp = arr[i];
            newArr[temp] = arr[i];
        }
        for(int i=0;i<newArr.length;i++){
            if(newArr[i]!=i){
                return i;
            }
        }
        return -1;
    }

    public static int getMissingUsingXor(int[] arr){
        int xorSum = 0;
        for(int a:arr){
            xorSum ^= a;
        }
        for(int i=0;i<=arr.length;i++){
            xorSum ^= i;
        }
        return xorSum;
    }
}
