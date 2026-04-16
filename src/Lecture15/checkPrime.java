package Lecture15;

public class checkPrime {
    public static void main(String[] args){
        int num = 8;
        boolean isPrime = true;
        for(int i=2;i<num;i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        System.out.println(isPrime);
    }
}
