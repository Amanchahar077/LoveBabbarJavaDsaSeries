package TcsNqt;

public class PrintFactorial {
    public static void main(String[] args){
        int a = 5;
        long result = 1;
        for(int i=a;i>=1;i--){
            result*=i;
        }
        System.out.println(result);
    }
}
