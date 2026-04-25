package LogicBuildingQue.Phase1.Level1;

import java.util.Scanner;

public class Que7 {
    public static void main(String[] args){
        //Take three numbers and print the largest.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int num1 = input.nextInt(),num2 = input.nextInt(),num3 = input.nextInt();
        int maxNum = Math.max(Math.max(num1,num2),num3);
        System.out.println(maxNum);
    }
}
