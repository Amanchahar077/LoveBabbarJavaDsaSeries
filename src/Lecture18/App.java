package Lecture18;

public class App {
    public static void main(String[] args){
        Student A = new Student(1,"Aman",22,6);
        String name = A.getName();
        int age = A.getAge();
        System.out.println(A.getName());
        System.out.println(A.getAge());
        A.setName("kamlesh");
        A.setAge(200);
        System.out.println(A.getName());
        System.out.println(A.getAge());

    }
}
