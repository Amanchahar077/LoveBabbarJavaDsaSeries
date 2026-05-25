package TcsNqt;

import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter: ");
        String s = input.nextLine().toLowerCase();
        int vowel = 0;
        int consonent = 0;
        for(int i=0;i<s.length();i++){
            char temp = s.charAt(i);
            if(temp=='a'||temp=='u'||temp=='o'||temp=='i'||temp=='e'){
                vowel++;
            }
            else{
                consonent++;
            }

        }
        System.out.println("Vowel: "+vowel);
        System.out.println("Consonent: "+consonent);

    }
}
