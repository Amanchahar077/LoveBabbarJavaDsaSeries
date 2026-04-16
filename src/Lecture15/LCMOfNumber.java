package Lecture15;

public class LCMOfNumber {
    public static void main(String[] args){
        int a = 12,b=18;
        //LCM = a*b/GCD;
        int gcd = gcd(a,b);
        int lcm = a*b/gcd;
        System.out.println(lcm);
    }
    static int gcd(int a,int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

}
