package Lecture17;

public class App {
    public static void main(String[] args){
        Student A = new Student(1,"Aman",22,6);
        A.study();
        Student B = new Student(A);
        B.bunk();
        String name = A.name;
        System.out.println(name);
    }
}
