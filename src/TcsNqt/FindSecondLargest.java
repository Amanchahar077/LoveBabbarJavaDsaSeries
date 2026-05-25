package TcsNqt;

public class FindSecondLargest {
    public static void main(String[] args) {
        int[] arr = {1,9,7,4,8};
        int largest = Integer.MIN_VALUE;
        int secLar = Integer.MIN_VALUE;
        for(int a:arr){
            if(a>largest){
                secLar = largest;
                largest = a;
            }
            else if(a>secLar&&a!=largest){
                secLar=a;
            }
        }
        System.out.println(secLar);
    }
}
