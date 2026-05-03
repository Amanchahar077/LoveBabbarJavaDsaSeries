package Lecture28;

import java.util.HashSet;

public class PrintUnion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};
        HashSet<Integer> set = new HashSet<>();
        for(int a : arr){
            set.add(a);
        }
        for(int a: arr2){
            set.add(a);
        }
        System.out.println(set);
    }
}
