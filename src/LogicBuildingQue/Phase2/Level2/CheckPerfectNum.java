package LogicBuildingQue.Phase2.Level2;

public class CheckPerfectNum {
    public static void main(String[] args) {
        System.out.println(checkPerfectNum(6));
    }
    public static boolean checkPerfectNum(int num){
        int sum = 0;
        if(num>0) {
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            return sum==num;
        }
        else{
            System.out.println("Enter valid number!!");
        }
        return false;
    }
}
