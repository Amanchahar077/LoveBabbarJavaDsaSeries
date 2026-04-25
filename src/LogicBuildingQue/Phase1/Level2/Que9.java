package LogicBuildingQue.Phase1.Level2;

import java.util.Scanner;

public class Que9 {
    public static void main(String[] args){
        // Take a day number (1–7) and print the corresponding day name.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        System.out.println("Entered number is "+num);
        switch(num){
            case 1: System.out.println("Sunday");
            break;
            case 2: System.out.println("Monday");
            break;
            case 3: System.out.println("Tuesday");
                break;
            case 4: System.out.println("Wednesday");
                break;
            case 5: System.out.println("Thursday");
                break;
            case 6: System.out.println("Friday");
                break;
            case 7: System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Number");
        }
    }
}
