package Lecture27;

import java.util.HashSet;

public class PrintArrIntersection {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        HashSet<Integer> arrSet = new HashSet<>();
        HashSet<Integer> arrSet2 = new HashSet<>();
        for(int a:arr){
            arrSet.add(a);
        }
        for(int a:arr2){
            if(arrSet.contains(a)){
                arrSet2.add(a);
            }
        }
        System.out.println(arrSet2);
    }
}
