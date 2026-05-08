package LogicBuildingQue.Phase2.Level1;

import java.math.BigInteger;

public class Que9 {
    public static void main(String[] args) {
        //Print the factorial of a given number
        System.out.println("Result: "+factorial(19));
    }
    public static BigInteger factorial(int num){
        BigInteger result = BigInteger.ONE;
        while(num>0){
            result=result.multiply(BigInteger.valueOf(num));
            num--;
        }
        return result;
    }
}
