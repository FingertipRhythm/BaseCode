package oop.oopexer3;

public class BoyGirlTest {
    public static void main(String[] args) {
        Boy romeo = new Boy("Romeo", 21);
        romeo.shout();

        Girl juliet = new Girl("Juliet", 20);
        juliet.marry(romeo);

        Girl girl = new Girl("祝英台", 19);
        if (girl.compare(juliet)>0){
            System.out.println(girl.getName()+"大");
        }else if (girl.compare(juliet)<0){
            System.out.println(juliet.getName()+"大");
        }else{
            System.out.println("一样大");
        }
    }
}
