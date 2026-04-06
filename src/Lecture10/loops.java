package Lecture10;

public class loops {
    public static void main(String[] args) {

        //FOR LOOP
        for (int i = 1; i <= 5; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        //NESTED FOR LOOP
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
