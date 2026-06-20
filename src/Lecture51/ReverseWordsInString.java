package Lecture51;

import java.util.HashMap;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "testset";
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            arr[ch-'a']++;
        }
        int max = -1;
        char maxChar = ' ';
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                maxChar =(char)(i+'a');
            }
        }
        System.out.println(maxChar);
    }
}
