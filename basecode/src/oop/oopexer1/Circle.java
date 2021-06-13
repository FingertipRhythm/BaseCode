package oop.oopexer1;
//圆
public class Circle {
    //属性
    double radius;

    //求圆的面积
    //方式一:
    public double findArea(){
        //3.14 Math.PI
        return Math.PI*radius*radius;
    }

    //方式二:
    public void findArea2(){
        System.out.println("面积为:"+Math.PI*radius*radius);
    }


}
