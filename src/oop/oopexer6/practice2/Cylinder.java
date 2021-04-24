package oop.oopexer6.practice2;

public class Cylinder extends Circle {
    private double length;  //圆柱高

    public Cylinder() {
        this.length = 1.0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //返回圆柱的体积
    public double findVolume() {
        return super.findArea() * getLength();
    }

    @Override
    public double findArea() {
        return Math.PI * getRadius() * getRadius() * 2 + 2 * Math.PI * getRadius() * getLength();
    }
}
