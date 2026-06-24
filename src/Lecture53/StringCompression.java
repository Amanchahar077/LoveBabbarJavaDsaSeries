package Lecture53;

public class StringCompression {
    public static void main(String[] args) {
        char[] c ={'a','a','b','b','b','c','c','c','c'};
        int readIndex = 0;
        int writeIndex = 0;
        while(readIndex<c.length){
            char currChar = c[readIndex];
            System.out.println(currChar+","+c[readIndex]);
            int count = 0;
            while(readIndex<c.length && currChar==c[readIndex]){
                count++;
                readIndex++;
            }
            c[writeIndex]=currChar;
            writeIndex++;

            if(count>1){
                String countStr = String.valueOf(count);
                for(char digit:countStr.toCharArray()){
                    c[writeIndex]=digit;
                    writeIndex++;
                }
            }
        }
        System.out.println(writeIndex);
    }
}
