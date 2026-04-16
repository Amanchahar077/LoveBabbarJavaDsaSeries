package Lecture15;

public class gcdOfNumber {
    public static void main(String[] args){
        int a = 12,b = 18;
        System.out.println(getGCD(a,b));
    }
    public static int getGCD(int a,int b){
        //GCD = gcd(a,a%b)
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}
