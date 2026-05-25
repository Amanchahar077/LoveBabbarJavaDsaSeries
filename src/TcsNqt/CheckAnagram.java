package TcsNqt;

import java.util.HashMap;

public class CheckAnagram {
    public static void main(String[] args) {
        String a = "aabb";
        String b = "cccc";

        System.out.println(checkAnagram(a,b));

    }
    public static boolean checkAnagram(String a,String b){
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<b.length();i++){
            char ch = b.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)-1);
        }
        System.out.println(map);
        if(a.length()!=b.length())return false;
        for(char key : map.keySet()) {

            if(map.get(key) != 0) {
                return false;
            }
        }
        System.out.println(map);
        return true;
    }

}
