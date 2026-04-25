package LogicBuildingQue.Phase1.Level2;

import java.util.Scanner;

public class Que4 {
    public static void main(String[] args){
        //check if one of two numbers in multiple of others
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = input.nextInt(), num2 = input.nextInt();
        if(num1%num2==0 || num2%num1==0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
