package LogicBuildingQue.Phase1.Level1;

import java.util.Scanner;

public class Que2 {
    public static void main(String[] args){
        //Check if a number is even or odd.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = input.nextInt();
        if(num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
