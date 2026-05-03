package Lecture27;

import java.util.ArrayDeque;

public class PrintAltEndsArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 6, 7};
        int st = 0;
        int end = arr.length-1;
        while(st<=end){
            if(st==end){
                System.out.print(arr[st]+" ");
            }
            else{
                System.out.print(arr[st]+" ");
                System.out.print(arr[end]+" ");
            }
            st++;
            end--;
        }
    }
}
