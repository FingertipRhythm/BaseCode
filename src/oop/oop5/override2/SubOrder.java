package oop.oop5.override2;

import oop.oop5.override1.Order;

public class SubOrder extends Order {

    public void method(){
        orderProtected=1;
        orderPublic=2;
        //在不同的子类中,不能调用Order类中声明为private和缺省权限的属性,方法
    }
}
