package Lecture8;

import java.util.Scanner;

public class takingInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = input.nextInt();
        System.out.println(a);
        input.close();
    }
}
