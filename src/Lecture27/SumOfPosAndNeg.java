package Lecture27;

public class SumOfPosAndNeg {
    public static void main(String[] args) {
        int[] arr = {2, -3, 4, -1, 0, 5};
        int pos = 0;
        int neg = 0;
        for(int a : arr){
            if(a>=0){
                pos+=a;
            }
            else{
                neg+=a;
            }
        }
        System.out.println("Pos: "+pos);
        System.out.println("Neg: "+neg);
    }
}
