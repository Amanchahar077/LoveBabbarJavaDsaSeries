package Lecture40;

public class FinfSqrtUsingBinary {
    public static void main(String[] args) {
        int n=56;
        int end = n;
        int st=0;
        int sqrt = 1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if((mid*mid)>n){
                end=mid-1;
            }
            else{
                sqrt=mid;
                st=mid+1;
            }
        }
        System.out.println(sqrt);
    }
}
