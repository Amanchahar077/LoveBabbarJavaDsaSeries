package Lecture43;

import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int[] stalls = {1,2,8,4,9};
        int k = 3;
        Arrays.sort(stalls);
        int n = stalls.length;
        int st = 0;
        int end = stalls[n-1] - stalls[0];
        int ans = -1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(isValid(stalls,k,mid)){
                ans=mid;
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        System.out.println(ans);
    }
    public static boolean isValid(int[] arr,int k,int minDist){
        //first cow
        int cow = 1;
        //first cow placed at 0 index
        int lastPosition = 0;
        for(int i=1;i<arr.length;i++){
            //current cow ko current position pe tabhi place karna h jab current cow and privious cow
            //ke beach ka distance >= minDist(jo ki mid ke baravbar h) ho
            if(arr[i]-arr[lastPosition]>=minDist){
                cow++;
                lastPosition = i;
                //cow ka count given cow ke equal hote he retun true kar dege 
                if(cow==k){
                    return true;
                }
            }
        }
        return false;
    }
}
