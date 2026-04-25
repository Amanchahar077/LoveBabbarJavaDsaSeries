package LogicBuildingQue.Phase1.Level1;

import java.util.Scanner;

public class Que5 {
    public static void main(String[] args){
        //Check if a given year is a leap year
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = input.nextInt();
        if(year%400==0){
            System.out.println("True");
        }
        else if(year%100==0){
            System.out.println("False");
        }
        else if(year%4==0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }

}
