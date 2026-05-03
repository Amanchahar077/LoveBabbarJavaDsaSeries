package Lecture26;

public class FindMissingNumInArr {
    public static void main(String[] args) {
        //Find missing number in array (using XOR)
        int[] arr = {1,2,4,5,6,7,8};
        System.out.println(findMissing(arr));
    }
    public static int findMissing(int[] arr){
        int xor1=0;
        int xor2=0;
        int n = arr.length+1;
        for(int a:arr){
            xor1^=a;
        }
        for(int i=1;i<=n;i++){
            xor2^=i;
        }
        System.out.println(n);
        return xor1^xor2;
    }
}
