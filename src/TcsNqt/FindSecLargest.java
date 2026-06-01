package TcsNqt;

public class FindSecLargest {
    public static void main(String[] args) {
        int[] arr = {1, 9, 7, 4, 8};
        System.out.println(secLar(arr));
    }
    public static int secLar(int[] arr){
        int fst = 0;
        int sec = 0;
        for(int a:arr){
            if(a>fst){
                sec = fst;
                fst=a;
            }
            else if(a<=fst&&a>sec){
                sec=a;
            }
        }
        return sec;
    }
}
