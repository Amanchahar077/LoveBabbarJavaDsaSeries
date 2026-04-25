import java.util.HashMap;

public class Roughwork {
    public static void main(String[] args){
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = {1,1,3,2,3,4,2,6,1,8,4,6,2,8,1,1,2,35,6,7,7};
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(HashMap.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.println("Single entry:"+entry.getKey());
            }
        }
        System.out.println(map);
    }
}
