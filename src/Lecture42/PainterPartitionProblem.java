package Lecture42;

public class PainterPartitionProblem {
    public static void main(String[] args) {
        int[] board = {5, 10, 30, 20, 15};
        int k = 3;
        System.out.println(minTime(board,k));
    }
    public static int minTime(int[] board,int k){
        int sum = 0;
        int ans = -1;
        for(int a:board){
            sum+=a;
        }
        int st = 0;
        int end = sum;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(isValid(board,k,mid)){
                ans = mid;
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return ans;
    }
    public static boolean isValid(int[] board,int k,int maxLen){
        int paintedLen = 0;
        int painterCount = 1;
        for(int i=0;i<board.length;i++){
            if(paintedLen+board[i]<=maxLen){
                paintedLen+=board[i];
            }
            else{
                paintedLen = 0;
                painterCount++;
                if(painterCount>k || board[i]>maxLen){
                    return false;
                }
                paintedLen+=board[i];
            }
        }
        return true;
    }
}
