package TcsNqt;

public class checkSubString {
    public static void main(String[] args) {
        String s1 = "leetcodedsa";
        String s2 = "dsa";
        System.out.println(checkSubString(s1,s2));
    }
    public static boolean checkSubString(String s1,String s2){
        return s1.contains(s2);
    }
}
