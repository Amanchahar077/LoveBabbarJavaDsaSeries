package TcsNqt;

import java.util.Scanner;

public class RevStr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String rev = reverse(s);
        System.out.println(rev);
    }
    public static String reverse(String s){
        String sb = "";
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            sb+=ch;
        }
        return sb;
    }
}
