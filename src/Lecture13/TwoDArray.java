package Lecture13;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2},
                {2,3,4},
                {1,4,2,5,1}
        };
        int rowIndex = arr.length;
        for(int row=0;row<rowIndex;row++){
            int colIndex = arr[row].length;
            for(int col = 0;col<colIndex;col++){
                System.out.print(arr[row][col]+" ");

            }
            System.out.println();
        }
    }
}
