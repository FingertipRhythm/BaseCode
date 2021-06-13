package oop.oopexer2;

public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle t1 = new TriAngle();
        t1.setBase(2.0);
        t1.setHeight(2.3);
//        t1.base=2.5;//The file TriAngle.base is not visible
//        t1.height=2.6;  //The file TriAngle.base is not visible
        System.out.println("base:"+t1.getBase()+",height:"+t1.getHeight());

        TriAngle t2 = new TriAngle(5.6,5.3);
        System.out.println("base:"+t2.getBase()+",height:"+t2.getHeight());
    }
}
