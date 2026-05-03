package Lecture28;

import java.util.HashMap;
import java.util.Map;

public class ElemFreq {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int a : arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        System.out.println(map);
        int maxFreq = Integer.MIN_VALUE;
        int maxKey = -1;
        int minFreq = Integer.MAX_VALUE;
        int minKey = -1;


        for(int key : map.keySet()){
            int currKey = key;
            int currFreq = map.get(currKey);

            if(currFreq>maxFreq){

                maxFreq = currFreq;
                maxKey = currKey;
            }
            if(currFreq<minFreq){

                minFreq = currFreq;
                minKey = currKey;
            }
        }
        System.out.println(maxFreq);
        System.out.println(maxKey);
        System.out.println(minFreq);
        System.out.println(minKey);
    }
}
