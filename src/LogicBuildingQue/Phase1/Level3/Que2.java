package LogicBuildingQue.Phase1.Level3;

import java.util.Scanner;

public class Que2 {
    public static void main(String[] args){
        //Take a 3-digit number and determine if the middle digit is the largest, smallest, or
        //neither.

        // int last = num % 10;
        // int mid = (num / 10) % 10;
        // int first = num / 100;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 digit number: ");
        int numb = input.nextInt();
        if(length(numb)==3){
            int last=0,mid=0,first=0;
            int num=numb;
            while(num!=0){
                int len = length(num);
                int temp = num%10;
                if(len==1){
                    first=temp;
                }
                else if(len==2){
                    mid=temp;
                }
                else{
                    last=temp;
                }
                num=num/10;
            }
            System.out.println(first);
            System.out.println(mid);
            System.out.println(last);
            if(mid>first&&mid>last){
                System.out.println("Largest");
            }
            else if(mid<first&&mid<last){
                System.out.println("Smallest");
            }
            else{
                System.out.println("Neither");
            }
        }
        else{
            System.out.println("Invalid Number Entered");
        }


    }
    public static int length(int num){
        int len = 0;
        while(num>0){
            len++;
            num/=10;
        }
        return len;
    }
}
