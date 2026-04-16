package Lecture15;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Enter number: ");
            int num = input.nextInt();
            int sum = 0;
            while(num!=0){
                sum = sum+num%10;
                num/=10;
            }
            System.out.println("Sum of digits is: "+sum);
        }
        catch(Exception e){
            System.out.println("WARNING:- Number out of range");
        }
    }
}
