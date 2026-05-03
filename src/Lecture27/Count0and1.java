package Lecture27;

public class Count0and1 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,0,0,0,0,1,1,0,0,0,1,1,0,0,0};
        int zeros = 0;
        int ones = 0;
        for(int a:arr){
            if(a==0){
                zeros++;
            }
            else{
                ones++;
            }
        }
        System.out.println("Zeros: "+zeros);
        System.out.println("Ones: "+ones);
    }
}
