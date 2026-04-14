package DsaQue;

public class validParenthesis {
    public static void main(String[] args) {

    }
    public static boolean validParen(String s){
        while(true){
            if(s.contains("()")){
                s=s.replace("()","");
            }

            else if(s.contains("{}")){
                s=s.replace("{}","");
            }

            else if(s.contains("[]")){
                s=s.replace("[]","");
            }
            else{
                return s.isEmpty();
            }
        }

    }
}
