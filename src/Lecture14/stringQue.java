package Lecture14;

public class stringQue {
    public static void main(String[] args) {
        String s = "abeba";
        System.out.println(s.length());
        printChar(s);
        System.out.println("Length: "+countLength(s));
        System.out.println("countVowels: "+countVowels(s));
        System.out.println("stringReverse: "+stringReverse(s));
        System.out.println("checkPalindrome: "+checkPalindrome(s));

    }
    public static void printChar(String s){
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            System.out.print(ch+" ");
        }
        System.out.println();
    }
    public static int countLength(String s){
        char[] ch = s.toCharArray();
        return ch.length;
    }
    public static int countVowels(String s){
        s=s.toLowerCase();
        int count = 0;
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a'||ch[i]=='u'||ch[i]=='o'||ch[i]=='i'||ch[i]=='e'){
                count++;
            }
        }
        return count;
    }
    public static String stringReverse(String s){
        String rev = "";
        for(int i = s.length()-1;i>=0;i--){
            rev = rev+s.charAt(i);
        }
        return rev;
    }
    public static boolean checkPalindrome(String s){
        String rev = stringReverse(s);
        return s.equals(rev);
    }
}
