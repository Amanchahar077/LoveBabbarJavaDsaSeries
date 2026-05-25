package TcsNqt;

public class sumOfDigits {
    public static void main(String[] args) {
        int num = 1234;
        System.out.println(sum(num));
    }
    public static int sum(int num){
        int sum = 0;
        while(num!=0){
            sum += num%10;
            num/=10;
        }
        return sum;
    }
}
