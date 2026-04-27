package LogicBuildingQue.Phase1.Level3;

public class Que10 {
    public void main(String[] args){
        //Check whether a number is a perfect square (without using the square root function).
        int num = 26;
        for(int i=1;i*i<=num;i++){
            if(i*i==num){
                System.out.println("Perfect square");
                break;
            }
        }
    }
}
