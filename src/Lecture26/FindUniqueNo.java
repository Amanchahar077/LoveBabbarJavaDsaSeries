package Lecture26;

public class FindUniqueNo {
    public static void main(String[] args) {
        //Find unique no all other appear twice.
        int[] arr = {2, 3, 5, 4, 12, 5, 3, 4, 2};
        int result = 0;

        for(int a:arr){
            result = result^a;
        }
        System.out.println(result);
    }
}
