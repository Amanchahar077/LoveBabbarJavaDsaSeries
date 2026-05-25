package Lecture34;

public class RotateMatrix90Deg {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] res = RotMat(arr);
        int rows = arr.length;
        int cols = arr[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] RotMat(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;
        int[][] trns = new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=i+1;j<cols;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }
        }


        for(int i=0;i<rows;i++){
            int st = 0;
            int end = cols-1;
            while(st<end){
                int temp = arr[i][st];
                arr[i][st] = arr[i][end];
                arr[i][end] = temp;
                st++;
                end--;
            }
        }

        return arr;
    }
}
