package Lecture18;

public class Student {
    private int id;
    private String name;
    private int age;
    private int nos;

    public Student(int id, String name, int age, int nos){
        System.out.println("Parameterized constructor called!!");
        this.id = id;
        this.name = name;
        this.age = age;
        this.nos = nos;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        System.out.println("setName is called!!");
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        System.out.println("setAge is called!!");
        if(age<100 && age>0){
            this.age=age;
        }
        else{
            System.out.println("Age should be in the range of 0-100");
        }
    }

    public Student(){
        System.out.println("Default constructor called!!");
    }

    public Student(Student srcObj){
        System.out.println("Copy constructor called!!");
        this.id = srcObj.id;
        this.name = srcObj.name;
        this.age = srcObj.age;
        this.nos = srcObj.nos;
    }

    public void study(){
        System.out.println(name+" Studying...");
    }

    public void bunk(){
        System.out.println(name+" Bunking...");
    }

    public void sleep(){
        System.out.println(name+" Sleeping...");
    }
}
