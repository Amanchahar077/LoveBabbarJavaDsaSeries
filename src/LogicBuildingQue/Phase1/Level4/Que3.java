package LogicBuildingQue.Phase1.Level4;

import java.util.Scanner;

public class Que3 {
    public static void main(String[] args){
        //Take three numbers and print the median value (neither maximum nor minimum).
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = input.nextInt();
        System.out.print("Enter num2: ");
        int num2 = input.nextInt();
        System.out.print("Enter num3: ");
        int num3 = input.nextInt();
        if(num1>num2&&num1<num3||num1<num2&&num1>num3){
            System.out.println("Num1");
        }
        else if(num2>num1&&num2<num3||num2>num3&&num2<num1){
            System.out.println("Num2");
        }
        else{
            System.out.println("Num3");
        }
    }
}
