package oop.oopexer5;

public class Student extends Person{
//    private String name;
//    private int age;
    private String modify;

    public Student() {
    }

    public Student(String modify) {
        this.modify = modify;
    }

    public Student(String name, int age, String modify) {
        super(name, age);
        this.modify = modify;
    }

    //    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    public String getModify() {
        return modify;
    }

    public void setModify(String modify) {
        this.modify = modify;
    }

//    public void eat(){
//        System.out.println("吃饭");
//    }
//
//    public void sleep(){
//        System.out.println("睡觉");
//    }

    public void study(){
        System.out.println("学习");
    }
}
