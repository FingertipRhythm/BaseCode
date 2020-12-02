package oop.oopexer1;

/**
 * 1.编写程序,定义三个重载方法并调用.方法名为mOL.
 *  三个方法分别接收一个int参数,两个int参数,一个字符串参数.
 *  分别执行平方运算并输出结果,相乘并输出结构,输出字符串信息.
 *  在主类的main()方法中分别用参数区别调用三个方法.
 *
 * 2.定义三个重载方法max(),第一个方法求两个int值中的最大值.
 *  第二个方法求两个double值中的最大值,
 *  第三个方法求三个double值中的最大值,分别调用三个方法.
 */
public class OverLordExer {
    public static void main(String[] args) {

    }

    //1.如下的三个方法构成重载:
    public void mOL(int i){
        System.out.println(i*i);
    }

    public void mOL(int x,int y){
        System.out.println(x*y);
    }

    public void mOL(String str){
        System.out.println(str);
    }

    //2.如下的三个方法构成重载:
    public int max(int x,int y){
        return x>y?x:y;
    }

    public double max(double x,double y){
        return x>y?x:y;
    }

    public double max(double x,double y,double z){
        double max = (x>y)?x:y;
        return max>z?max:z;
    }

}
