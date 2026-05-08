package LogicBuildingQue.Phase2.Level2;

public class printAllPrime {
    public static void main(String[] args) {
        for(int i=0;i<=100;i++){
            if(checkPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean checkPrime(int num){
        if(num<2)return false;
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
