package Lecture15;
import java.util.Scanner;

public class countDigitsOfNum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Enter Number: ");
            int num = input.nextInt();
            int count = 0;
            if(num==0){
                count=1;
            }
            else{
                while(num!=0){
                    count++;
                    num/=10;
                }
            }
            System.out.println("Number of digits are: "+count);
        }
        catch(Exception e){
            System.out.println("WARNING:- Number is out of range!!");
        }


    }
}
