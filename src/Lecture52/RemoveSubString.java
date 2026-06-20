package Lecture52;

public class RemoveSubString {
    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        String part = "abc";
        while(s.contains(part)){
            int index = s.indexOf(part);
            s=s.substring(0,index)+s.substring(index+part.length());
        }
        System.out.println(s);
    }
}
