package Lecture33;

public class TransposeOFmatrix {
    public static void main(String[] args) {
        //int[][] arr = {{1, 2 ,3}, {4, 5 ,6}};
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int rowLen = arr.length;
        int colLen = arr[0].length;

        for(int row = 0;row<rowLen;row++){
            for(int col = 0;col<colLen;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
        System.out.println();
        int[][] trans = transpose(arr);
        for(int row = 0;row<rowLen;row++){
            for(int col = 0;col<colLen;col++){
                System.out.print(trans[col][row]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] transpose(int[][] arr){
        int rowLen = arr.length;
        int colLen = arr[0].length;
        int[][] trans = new int[colLen][rowLen];
        for(int row = 0;row<rowLen;row++){
            for(int col = 0;col<colLen;col++){
                trans[col][row] = arr[row][col];
            }
        }
        return trans;
    }
}
