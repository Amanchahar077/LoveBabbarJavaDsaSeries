package Lecture27;

public class findFirstUnsorted {
    public static void main(String[] args) {
        int[] arr = {1,1,3,4,6,1,8,92};
        int num = -1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                num=i;
                break;
            }
        }
        System.out.println(num);
    }
}
