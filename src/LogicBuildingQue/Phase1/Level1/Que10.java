package LogicBuildingQue.Phase1.Level1;

import java.util.Scanner;

public class Que10 {
    public static void main(String[] args){
        //Take a character and check whether it’s uppercase, lowercase, a digit, or a special
        //character.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter character: ");
        int num = input.next().charAt(0);
        if(num>=48&&num<=57){
            System.out.println("Digit");
        }
        else if(num>=65&&num<=90){
            System.out.println("Uppercase");
        }
        else if(num>=97&&num<=122){
            System.out.println("Lowercase");
        }
        else if(num>=32&&num<=47){
            System.out.println("Special Character");
        }
    }
}
