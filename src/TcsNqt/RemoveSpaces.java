package TcsNqt;

public class RemoveSpaces {
    public static void main(String[] args) {
        String s = "  Hello     world from Java     ";
        //Sol1 => s=s.replaceAll("\\s+","");
        //Sol2
        s=s.replace(" ","");
        System.out.println(s);
    }
}
