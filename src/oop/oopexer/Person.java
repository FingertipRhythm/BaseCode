package oop.oopexer;

public class Person {
    String name;
    int age;
    /**
     * sex为0:表明是女性
     * sex为1:表明是男性
     */
    int sex;

    public void study(){
        System.out.println("studying");
    }

    public void showAge(){
        System.out.println("age:"+age);
    }

    public int addAge(int i){
        return age+=i;
    }
}
