package Lecture44;
import java.util.Arrays;
public class EcoSpojProblem {
    public static void main(String[] args) {
        int[] trees = {20,15,10,17};
        int m = 7;
        Arrays.sort(trees);
        int n = trees.length;
        int st = 0;
        int end = trees[n-1];
        int ans = -1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(isValid(trees,m,mid)){
                ans=mid;
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        System.out.println(ans);
    }
    public static boolean isValid(int[] arr,int m,int mid){
        int totalWood = 0;
        for(int a:arr){
            if(a>mid){
                totalWood += a-mid;
            }
        }
        if(totalWood>=m){
            return true;
        }
        return false;
    }
}
