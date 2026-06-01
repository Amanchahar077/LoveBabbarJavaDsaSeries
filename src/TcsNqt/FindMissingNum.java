package TcsNqt;

public class FindMissingNum {
    public static void main(String[] args) {
        int[] arr = {2,3,5,4};
        int sum = 0;
        for(int a:arr){
            sum+=a;
        }
        int total = 0;
        for(int i=0;i<=arr.length+1;i++){
            total+=i;
        }
        System.out.println(total-sum);

    }
}
