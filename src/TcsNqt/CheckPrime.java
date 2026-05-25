package TcsNqt;

public class CheckPrime {
    public static void main(String[] args){
        int a = 1;
        System.out.println(checkprime(a));
    }
    public static boolean checkprime(int num){
        if(num<2)return false;
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0)return false;
        }
        return true;
    }
}

