package Lecture27;

public class AvgOfElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        int sum = 0;
        for(int a:arr){
            sum = sum+a;
        }
        double avg = (double) sum /n;
        System.out.println(avg);
    }
}
