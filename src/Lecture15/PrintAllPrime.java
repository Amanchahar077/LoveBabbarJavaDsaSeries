package Lecture15;

import java.util.Scanner;

public class PrintAllPrime {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        for(int i=2;i<=n;i++){
            if(checkPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean checkPrime(int n){
        if(n<=1){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
