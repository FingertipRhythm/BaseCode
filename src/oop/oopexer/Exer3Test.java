package oop.oopexer;

/**
 * 1. 编写程序,声明一个method方法,在方法中打印一个10*8的*型矩形,在main方法中调用该方法.
 * 2. 修改上一个程序,在method方法中,除打印一个10*8的*型矩形外,在计算该矩形的面积,并将其作为
 *    方法返回值.在main方法中调用该方法,接收返回的面积值并打印.
 * 3. 修改上一个程序,在method方法提供m和n两个参数,方法中打印一个m*n的*型矩形,并计算该矩形的
 *    面积,将其作为方法返回值.在main方法中调用该方法,接收返回的面积值并打印.
 */
public class Exer3Test {
    public static void main(String[] args) {
        Exer3Test e1 = new Exer3Test();
        //1:
        e1.method1();
        //2:
        System.out.println("面积为:"+e1.method2());
        //3:
        System.out.println("面积为:"+e1.method3(10,8));
    }
    //1:
    public void method1(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //2:
    public int method2(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return 10*8;
    }

    //3:
    public int method3(int m,int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return m*n;
    }
}


