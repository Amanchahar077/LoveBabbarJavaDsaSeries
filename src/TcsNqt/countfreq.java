package TcsNqt;

public class countfreq {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 2};
        System.out.println(countfrq(arr,2));
    }
    public static int countfrq(int[] arr,int k){
        int count = 0;
        for(int a:arr){
            if(a==k){
                count++;
            }
        }
        return count;
    }
}
