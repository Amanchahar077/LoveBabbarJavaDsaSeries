package Lecture9;

public class condetionals {
    public static void main(String[] args) {
        int consistency = 12;
        if(consistency>=10){
            System.out.println("Student is Consistent");
        } else if (consistency>5&&consistency<10){
            System.out.println("Student is Partially Consistent");
        } else{
            System.out.println("Student is not consistent");
        }


        int age = 18;
        String status = (age>=18)? "Adult" : "Minor";
        System.out.println(status);
    }
}
