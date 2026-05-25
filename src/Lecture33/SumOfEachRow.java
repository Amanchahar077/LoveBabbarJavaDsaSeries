package Lecture33;

import java.util.ArrayList;
import java.util.List;

public class SumOfEachRow {
    public static void main(String[] args) {
        int[][] arr = {{1},{2,2},{3,3,3}};
        System.out.println(rowSum(arr));
    }
    public static List<Integer> rowSum(int[][] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
            list.add(sum);
            sum=0;
        }
        return list;
    }

}
