package Lecture15;

public class printDigitsOfNumber {
    public static void main(String[] args){
        int num = 782648;

        while(num!=0){
            int a = num%10;
            System.out.print(a+" ");
            num=num/10;
        }
    }
}
