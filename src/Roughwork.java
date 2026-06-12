import java.util.HashMap;

public class Roughwork {
    public static void main(String[] args){
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = {1,2,3,4};
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        boolean result = true;
        for(int a:map.keySet()){
            if(map.get(a)>1){
                result=false;
                break;
            }
        }
        System.out.println(result);
    }
}
