package TcsNqt;
import java.util.Scanner;

public class CheckArmstrong {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = input.nextInt();
        int res = checkArm(num);
        System.out.println(res);
        if(res==num){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    public static int checkArm(int num){
        int res = 0;
        int temp  = num;
        while(temp!=0){
            int digit = temp%10;
            int pow = (int)Math.pow(digit,getDigits(num));
            res+=pow;
            temp/=10;
        }
        return res;
    }
    public static int getDigits(int num){
        int count = 0;
        while(num!=0){
            count++;
            num/=10;
        }
        return count;
    }

}
