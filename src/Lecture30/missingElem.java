package Lecture30;

import java.util.ArrayList;
import java.util.List;

public class missingElem {
    public static void main(String[] args) {
        int[] arr = {8,2,1,10,9,4,6,4,5,6};
        System.out.println(missingNum(arr));
    }
    public static List<Integer> missingNum(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        int[] num = new int[n+1];
        for(int i=0;i<n;i++){
            int elm = arr[i];
            num[elm] = num[elm]+1;
        }
        for(int i=1;i<=n;i++){
            if(num[i]==0){
                list.add(i);
            }
        }
        return list;
    }
}
