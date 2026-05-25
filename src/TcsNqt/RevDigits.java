package TcsNqt;
import java.util.Scanner;

public class RevDigits {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        System.out.println("Reverse: "+reverse(num));
    }
    public static int reverse(int num){
        int rev = 0;
        while(num!=0){
            int digit = num%10;
            rev = (rev*10)+digit;
            num/=10;
        }
        return rev;
    }
}
