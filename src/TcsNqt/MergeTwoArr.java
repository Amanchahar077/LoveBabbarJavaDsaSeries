package TcsNqt;

public class MergeTwoArr {
    public static void main(String[] args) {
        int[] a1 = {1,2,3};
        int[] a2 = {4,5};
        int[] arr = new int[a1.length+a2.length];
        int i=0;
        while(i<a1.length){
            arr[i]=a1[i];
            i++;
        }
        for(int j=0;j<a2.length;j++){
            arr[i++]=a2[j];
        }
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
