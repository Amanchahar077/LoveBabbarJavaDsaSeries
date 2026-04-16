package Lecture15;

public class reverseANumber {
    public static void main(String[] args){
        int num = 2415241;
        int real = num;
        int rev = 0;
        while(num!=0){
            rev*=10;
            rev+=num%10;
            num/=10;

        }
        if(rev==real){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
}
