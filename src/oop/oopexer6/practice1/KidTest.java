package oop.oopexer6.practice1;

/**
 * 定义类KidsTest，在类的main方法中实例化Kids的对象someKid，用该对象访问
 * 其父类的成员变量及方法。
 */
public class KidTest {
    public static void main(String[] args) {
        Kids kids = new Kids(18);

        kids.printAge();

        kids.setSex(1);
        kids.setSalary(0);

        kids.employeed();
        kids.manOrWoman();
    }
}
