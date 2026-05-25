package TcsNqt;

public class PrintFib {
    public static void main(String[] args) {
        int n = 8;
        int a = 0,b = 1;
        while(n!=0){
            System.out.print(a+" ");
            int next = a+b;
            a=b;
            b=next;
            n--;
        }
    }
}
