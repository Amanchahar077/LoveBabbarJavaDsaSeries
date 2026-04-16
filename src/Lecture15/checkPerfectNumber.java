package Lecture15;

public class checkPerfectNumber {
    public static void main(String[] args){
        int n = 200;
        int sum = 1;
        for(int i = 2; i*i<=n; i++){
            if(n%i==0){
                int fn = i;
                int sn = n/i;
                if(fn==sn){
                    sum+=fn;
                }
                else{
                    sum = sum+fn+sn;
                }

            }
        }
        if(n==sum && n!=1){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
