package LogicBuildingQue.Phase1.Level3;

import java.util.Scanner;

public class Que3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter four digit number: ");
        int num = input.nextInt();
        if(num>=1000&&num<=9999){
            int last = num%10;
            int first = num/1000;
            if(first==last){
                System.out.println("Equal");
            }
            else{
                System.out.println("Not Equal");
            }
        }
        else{
            System.out.println("Invalid number!!");
        }
    }
}
