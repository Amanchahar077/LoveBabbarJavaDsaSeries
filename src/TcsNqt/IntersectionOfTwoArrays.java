package TcsNqt;
import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {2,3,4};

        int[] ans = inter(arr1,arr2);
        for(int a:ans){
            System.out.print(a+" ");
        }

    }
    public static int[] inter(int[] arr1,int[] arr2){
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    list.add(arr1[i]);
                }
            }
        }
        int[] ans = new int[list.size()];
        for(int i=0;i<list.size();i++){
            if(!list.contains(i))
            ans[i]=list.get(i);
        }
        return ans;
    }
}
