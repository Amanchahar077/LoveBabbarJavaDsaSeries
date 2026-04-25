package LogicBuildingQue.Phase1.Level1;

import java.util.Scanner;

public class Que1 {
    public static void main(String[] args){
        //Take a number and print whether it’s positive, negative, or zero.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = input.nextInt();
        if(num>0){
            System.out.println("Positive");
        }
        else if(num<0){
            System.out.println("negative");
        }
        else{
            System.out.println("Zero");
        }
    }
}
