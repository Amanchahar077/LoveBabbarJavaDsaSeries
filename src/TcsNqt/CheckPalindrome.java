package TcsNqt;
import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        System.out.println(checPalindrome(num));
    }
    public static boolean checPalindrome(int num){
     int rev = 0;
     int temp = num;
        while(num!=0){
            int digit = num%10;
            rev = (rev*10)+digit;
            num/=10;
        }

        return rev==temp;

    }
}
