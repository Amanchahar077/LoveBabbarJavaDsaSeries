package LogicBuildingQue.Phase2.Level2;

public class CheckArmstrong {
    public static void main(String[] args) {
        System.out.println(checkArmstrong(15));
    }
    public static boolean checkArmstrong(int num){
        int length = getLength(num);
        int check = num;
        int temp = 0;
        while(check>0){
            int digit = check%10;
            int pow = (int)Math.pow(digit,length);
            temp = temp+pow;
            check/=10;
        }
        return num == temp;

    }
    public static int getLength(int num){
        int len = 0;
        while(num>0){
            len++;
            num/=10;
        }
        return len;
    }
}
