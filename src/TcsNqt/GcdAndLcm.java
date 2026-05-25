package TcsNqt;
import java.util.Scanner;
public class GcdAndLcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Num1 & num2: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int gcd = gcd(num1,num2);
        int lcm = num1*num2/gcd;
        System.out.println("GCD: "+gcd);
        System.out.println("LCM: "+lcm);
    }
    public static int gcd(int num1,int num2){
        while(num2!=0){
            int temp = num2;
            num2 = num1%num2;
            num1 = temp;
        }

        return num1;
    }
}

