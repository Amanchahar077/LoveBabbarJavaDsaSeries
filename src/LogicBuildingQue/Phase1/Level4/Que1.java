package LogicBuildingQue.Phase1.Level4;

import java.util.Scanner;

public class Que1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter char: ");
        char ch = input.next().charAt(0);
        checkChar(ch);
    }
    public static void checkChar(char ch){
        if(Character.isDigit(ch)){
            System.out.println("Digit");
        }
        else if(Character.isLetter(ch)){
            System.out.println("Letter");
        }
        else{
            System.out.println("Neither");
        }
    }
}
