package Lecture33;
import java.util.*;

public class WavePrint {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(wavePrint(arr));
    }

    public static List<Integer> wavePrint(int[][] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int col = 0; col < arr.length; col++) {
            if (col % 2 == 0) {
                //top to bottom
                for (int row = 0; row < arr[col].length; row++) {
                    list.add(arr[row][col]);
                }
            } else {
                //bottom to top
                for (int row = arr[col].length-1; row >= 0; row--) {
                    list.add(arr[row][col]);
                }
            }

        }
        return list;
    }
}
