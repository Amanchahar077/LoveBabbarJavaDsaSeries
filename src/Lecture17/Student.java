package Lecture17;

public class Student {
    public int id;
    public String name;
    public int age;
    public int nos;

    public Student(int id, String name, int age, int nos){
        System.out.println("Parameterized constructor called!!");
        this.id = id;
        this.name = name;
        this.age = age;
        this.nos = nos;
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
