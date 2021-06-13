package oop.oop6.exer3;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Objects;

/*
 * 编写Order类，有int型的orderId，String型的orderName，
 * 相应的getter()和setter()方法，两个参数的构造器，
 * 重写父类的equals()方法：public boolean equals(Object obj)，
 * 并判断测试类中创建的两个对象是否相等。
 */
public class OrderTest {
    public static void main(String[] args) {
        Order o1 = new Order(1006, "AA");
        Order o2 = new Order(1006, new String("BB"));
        System.out.println(o1.equals(o2));

        Order o3 = new Order(1006, "BB");
        System.out.println(o2.equals(o3));

        String s1 = "BB";
        String s2 = "BB";
        System.out.println(s1 == s2);//true

    }
}

class Order {
    private int orderId;
    private String orderName;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Order order = (Order) o;
//        return orderId == order.orderId &&
//                Objects.equals(orderName, order.orderName);
//    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o instanceof Order) {
            Order order = (Order) o;
            //正确的
            return this.orderId == order.orderId && this.orderName.equals(order.orderName);
            //错误的
//            return this.orderId == order.orderId && this.orderName==order.orderName;
        }
        return false;
    }


}