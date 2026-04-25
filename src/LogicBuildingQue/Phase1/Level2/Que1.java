package LogicBuildingQue.Phase1.Level2;

import java.util.Scanner;

public class Que1 {
    public static void main(String[] args){
        //Take three sides and check if they form a valid triangle.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three sides: ");
        int a = input.nextInt(),b = input.nextInt(),c = input.nextInt();
        if(a+b>c&&b+c>a&&c+a>b){
            System.out.println("Valid Triangle");
        }
        else{
            System.out.println("Invalid");
        }


    }
}
