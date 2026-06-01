package TcsNqt;

public class TransposOfMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                       {4,5,6}};
        int m = arr.length;
        int n = arr[1].length;
        int[][] ans = new int[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[j][i]=arr[i][j];
            }
        }

        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[1].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
