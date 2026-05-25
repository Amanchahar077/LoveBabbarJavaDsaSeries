package TcsNqt;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "programming";
        String ans = "";
        StringBuilder sb = new StringBuilder();

        for(char ch:s.toCharArray()){
           if(ans.indexOf(ch)==-1){
               ans+=ch;
           }
        }
        System.out.println(ans);
    }
}
