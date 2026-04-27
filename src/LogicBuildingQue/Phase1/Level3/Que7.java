package LogicBuildingQue.Phase1.Level3;

import java.util.Scanner;

public class Que7 {
    public static void main(String[] args){
        //Take coordinates (x, y) and determine which quadrant the point lies in.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = input.nextInt();
        System.out.print("Enter y: ");
        int y = input.nextInt();
        if(x>=0&&y>=0){
            System.out.println("First Quardrant");
        }
        else if(x<0&&y>=0){
            System.out.println("Second Quardrant");
        }
        else if(x>=0&&y<0){
            System.out.println("Forth Quardrant");
        }
        else{
            System.out.println("Third Quardrant");
        }
    }
}
