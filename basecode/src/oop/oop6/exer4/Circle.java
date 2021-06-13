package oop.oop6.exer4;

import java.util.Objects;

public class Circle extends GeometricObject {
    private double radius;

    public Circle(String color, double weight, double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //求圆的面积
    public double findArea() {
        return Math.PI * radius * radius;
    }

    //比较两个圆的半径是否相等,如相等,返回true
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
