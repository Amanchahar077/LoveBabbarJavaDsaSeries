package TcsNqt;

public class RemoveSpecificCharacter {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        String s = "banana";
        char c = 'a';
        s=s.replace(String.valueOf(c),"");
        System.out.println(s);
//        for(int i=0;i<s.length();i++){
//            char ch = s.charAt(i);
//            if(ch!=' '){
//                sb.append(ch);
//            }
//        }
//        System.out.println(sb.toString());
    }
}
