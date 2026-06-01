package TcsNqt;

public class TransPoseOfMatrixSol2 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};

        int m = arr.length;
        int n = arr[1].length;

        for(int i=0;i<m;i++){
            for(int j=i;j<n;j++){
                if(i!=j){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[1].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
