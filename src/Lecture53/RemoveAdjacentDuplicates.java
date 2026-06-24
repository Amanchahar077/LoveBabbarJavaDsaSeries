package Lecture53;

public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        String s = "abbaca";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(sb.isEmpty()){
                sb.append(ch);
            }
            else{
                int n = sb.length();
                char temp = sb.charAt(n-1);
                if(temp==ch){
                    sb.deleteCharAt(n-1);
                }
                else{
                    sb.append(ch);
                }
            }
        }
        System.out.println(sb);
    }
}
