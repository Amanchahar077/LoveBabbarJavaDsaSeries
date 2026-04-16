package Lecture15;

import java.util.Scanner;

public class checkAngstrong {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        try{
            System.out.print("Enter Number: ");
            int n = input.nextInt();
            int temp = n;
            int sum=0;
            while(temp!=0){
                int a = temp%10;
                sum = sum + (int)Math.pow(a,3);
                temp=temp/10;
            }
            if(n==sum){
                System.out.println("Number is armstrong");
            }
            else{
                System.out.println("Number is not armstrong");
            }
        }
        catch( Exception e){
            System.out.println("Error Occured: "+e.getMessage());
        }

    }
}
