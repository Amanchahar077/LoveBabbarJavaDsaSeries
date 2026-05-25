package Lecture33;

import java.util.*;

public class SumOfEachCol {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(colSum(arr));
    }
    public static List<Integer> colSum(int[][] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int ind = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[j][i];
            }
            list.add(sum);
            sum=0;
        }
        return list;
    }
}
