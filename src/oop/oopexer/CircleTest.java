package oop.oopexer;

/**
 * 利用面向对象的编程方法,设计类Circle计算圆的面积
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        c1.radius = 2.1;

        //对应方式1:
        System.out.println(c1.findArea());

        //对应方式2:
        c1.findArea2();
    }
}
