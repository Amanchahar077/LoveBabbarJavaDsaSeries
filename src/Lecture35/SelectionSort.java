package Lecture35;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,1,4,3,7,5,9,6,8};
        SelectionSort(arr);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
    public static void SelectionSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int min = i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
