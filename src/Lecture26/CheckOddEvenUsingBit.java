package Lecture26;

import java.util.Scanner;

public class CheckOddEvenUsingBit {
    public static void main(String[] args){
        Scanner input  = new Scanner (System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        if((n&1)==1){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }
}
