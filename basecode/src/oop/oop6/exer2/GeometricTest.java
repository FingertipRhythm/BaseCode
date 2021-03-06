package oop.oop6.exer2;

import com.sun.javafx.tk.TKPulseListener;

/**
 * 定义一个测试类GeometricTest，
 * 编写equalsArea方法测试两个对象的面积是否相等（注意方法的参数类型，利用动态绑定技术），
 * 编写displayGeometricObject方法显示对象的面积（注意方法的参数类型，利用动态绑定技术）。
 */
public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();

        Circle c1 = new Circle("white", 1.0, 3.3);
        test.displayGeometricObject(c1);
        Circle c2 = new Circle("white", 1.0, 3.3);
        test.displayGeometricObject(c2);

        boolean isEquals = test.equalsArea(c1, c2);
        System.out.println("c1和c2的面积是否相等:"+isEquals);

        MyRectangle rect = new MyRectangle("red", 2.1, 3.4, 2.0);
        test.displayGeometricObject(rect);
    }

    public void displayGeometricObject(GeometricObject o){//GeometricObject o = new Circle(...)
        System.out.println("面积为:"+o.findArea());
    }

    public boolean equalsArea(GeometricObject o1,GeometricObject o2){
        return o1.findArea() == o2.findArea();
    }

}
