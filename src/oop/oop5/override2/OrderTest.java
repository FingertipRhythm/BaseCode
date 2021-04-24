package oop.oop5.override2;

import oop.oop5.override1.Order;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.orderPublic=1;
        order.methodPublic();
        //不同包下的普通类(非子类)要使用Order类,不可以调用声明为private,缺省,protected权限的属性和方法
    }

    public void show(Order order){
        order.orderPublic=1;
        order.methodPublic();
        //不同包下的普通类(非子类)要使用Order类,不可以调用声明为private,缺省,protected权限的属性和方法
    }

}
