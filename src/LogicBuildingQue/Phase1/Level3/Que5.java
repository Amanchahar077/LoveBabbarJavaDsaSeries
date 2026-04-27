package LogicBuildingQue.Phase1.Level3;

import java.util.Scanner;

public class Que5 {
    public static void main(String[] args){
        //Check if a number is a multiple of 7 or ends with 7
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = input.nextInt();
        if(num%7==0){
            System.out.println("Multiple of 7");
        }
        else{
            System.out.println("Not multiple of 7");
        }
        if(num%10==7){
            System.out.println("Last digit is 7");
        }
        else{
            System.out.println("Last digit is not 7");
        }
    }
}
