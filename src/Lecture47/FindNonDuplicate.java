package Lecture47;

public class FindNonDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,8};
        System.out.println(findElem(arr));
    }
    public static int findElem(int[] arr){
        int n = arr.length;
        int st = 0;
        int end = n-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(st==end){
                return arr[mid];
            }
            if(mid==0){
                return arr[mid];
            }
            if(mid==n-1){
                return arr[mid];
            }
            if(mid+1<n&&mid-1>=0){
                if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){
                    return arr[mid];
                }
                else if(arr[mid]==arr[mid+1]){
                    int stInd = mid;
                    if((stInd % 2) == 0){
                        st=mid+2;
                    }
                    else{
                        end=mid-1;
                    }
                }
                else if(arr[mid]==arr[mid-1]){
                    int endInd = mid;
                    if(endInd % 2 == 0){
                        end=mid-2;
                    }
                    else{
                        st=mid+1;
                    }
                }
            }

        }

        return -1;
    }
}
