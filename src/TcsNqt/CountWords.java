package TcsNqt;

public class CountWords {
    public static void main(String[] args) {
        String s = "Hello     world from Java     ";
        System.out.println(countWords(s));
    }
    public static int countWords(String s){
        s=s.trim();
        int length = 0;
        if(s.isEmpty()){
            return 0;
        }
        String[] str = s.split("\\s+");

        return str.length;
    }
}
