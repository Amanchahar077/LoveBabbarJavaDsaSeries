package Lecture26;

public class CountSetBits {
    public static void main(String[] args) {
        //Write a program to count number of set bits
        System.out.println(countSetBits(2));
    }
    public static int countSetBits(int num){
        int count = 0;
        while(num!=0){
            if((num&1)==1){
                count++;
            }
            num=num>>1;
        }
        return count;
    }
}
