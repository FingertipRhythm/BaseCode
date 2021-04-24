package oop.oopexer6.practice2;

import java.util.zip.DeflaterOutputStream;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();

        cylinder.setRadius(3);
        cylinder.setLength(2);

        //没有重写findArea()时:
//        double area = cylinder.findArea();
//        System.out.println("圆柱底面圆的面积为:"+area);
        //重写findArea()以后:
        double area1 = cylinder.findArea();
        System.out.println("圆柱的表面积:"+area1);

        double volume = cylinder.findVolume();
        System.out.println("圆柱的体积为:"+volume);

        System.out.println("**********");
        Cylinder cylinder1 = new Cylinder();
        double volume1 = cylinder1.findVolume();
        System.out.println("圆柱的体积为:"+volume1);

    }
}
