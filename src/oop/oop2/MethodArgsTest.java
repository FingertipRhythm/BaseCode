package oop.oop2;

/**
 * 可变个数形参的方法
 *
 * 1.jdk 5.0新增的内容
 * 2.具体使用:
 *      2.1 可变个数形参的格式:数据类型 ... 变量名
 *      2.2 当调用可变个数形参的方法时,传入的参数个数可以是:0个,1个,2个...
 *      2.3 可变个数形参的方法与本类中方法名相同,形参不同的方法之间构成重载
 *      2.4 可变个数形参的方法与本类中方法名相同,形参类型也相同的数组之间不构成重载.
 *          换句话说,二者不能共存.
 *      2.5 可变个数形参在方法的形参中,必须声明在末尾
 *      2.6 可变个数形参在方法的形参中,最多只能声明一个可变形参.
 */
public class MethodArgsTest {
    public static void main(String[] args) {
        MethodArgsTest test = new MethodArgsTest();
        test.show(12);
        test.show("hello");
        test.show("H","e","l","l","o");
        test.show();
    }
    public void show(int i){
        System.out.println(i);
    }

    public void show(String s){
        System.out.println("show(String s)");
    }
    public void show(String...s){
        System.out.println("show(String...s)");
        for (String value : s) {
            System.out.print(value);
        }
    }

//    public void show(String[] s){}

    //The variable argument type String of the method show must be the last parameter
//    public void show(String...s,int i){}
}
