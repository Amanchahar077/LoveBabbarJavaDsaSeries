package LogicBuildingQue.Phase1.Level2;

import java.util.Scanner;

public class Que2 {
    public static void main(String[] args){
        //Take three sides and check if they form a valid triangle.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three sides: ");
        boolean checkTri = false;
        int a = input.nextInt(),b = input.nextInt(),c = input.nextInt();
        if(a+b>c&&b+c>a&&c+a>b){
            checkTri = true;
        }

        if(checkTri){
            if(a==b&&b==c){
                System.out.println("Equilateral Triangle");
            }
            else if(a==b||b==c||c==a){
                System.out.println("isosceles triangle");
            }
            else{
                System.out.println("Scalene triangle");
            }
        }
        else{
            System.out.println("Not a triangle");
        }



    }
}
