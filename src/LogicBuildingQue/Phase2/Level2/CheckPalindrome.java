package LogicBuildingQue.Phase2.Level2;

public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrome(121));
    }
    public static boolean checkPalindrome(int num){
        int temp = 0;
        int check = num;
        while(check>0){
            temp=(temp*10)+check%10;
            check/=10;
        }
        return num==temp;
    }
}
