package LogicBuildingQue.Phase2.Level2;

public class PrintFibonachii {
    public static void main(String[] args) {
        printFib(8);
    }
    public static void printFib(int n){
        int count = 0;
        int first = 0,second = 1;
        int sum = 0;
        while(count<n){
            System.out.print(first+" ");
            sum+=first;
            int next = first+second;
            first = second;
            second = next;
            count++;
        }
        System.out.println();
        System.out.println("Sum: "+sum);
    }
}
