package LogicBuildingQue.Phase1.Level3;

import java.util.HashMap;

public class Que1 {
    public static void main(String[] args){
        //Take a 3-digit number and check if all digits are distinct
        checkDistinct(58732531);
    }
    public static boolean checkDistinct(int num){
        int temp = num;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(temp>0){
            int digit = temp%10;
            map.put(digit,map.getOrDefault(digit,0)+1);
            temp=temp/10;
        }
        System.out.println(map);
        for(HashMap.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>=2){
                return false;
            }
        }
        return true;
    }
}
