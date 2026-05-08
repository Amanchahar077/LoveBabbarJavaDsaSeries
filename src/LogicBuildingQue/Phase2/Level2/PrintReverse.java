package LogicBuildingQue.Phase2.Level2;

public class PrintReverse {
    public static void main(String[] args) {
        //print reverse of a number
        long num = 1234567634;
        System.out.println(reverse(num));
    }
    public static long reverse(long num){
        long result = 0;

        while(num>0){
            long temp = num%10;
            result = (result*10)+temp;
            num/=10;
        }
        return result;
    }
}
