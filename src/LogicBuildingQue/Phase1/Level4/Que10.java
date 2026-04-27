package LogicBuildingQue.Phase1.Level4;

import java.util.Scanner;

public class Que10 {
    public static void main(String[] args){
        //Take a password string and check basic rules (length ≥ 8 and contains at least one
        //digit).
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = input.nextLine();
        if(s.length() < 8){
            System.out.println("Too short");
        }
        else if(!checkDigit(s)){
            System.out.println("No digit present");
        }
        else{
            System.out.println("Valid Password");
        }
    }
    public static boolean checkDigit(String s){
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch))return true;
        }
        return false;
    }
}
