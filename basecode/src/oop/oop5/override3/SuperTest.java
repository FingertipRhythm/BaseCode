package oop.oop5.override3;

/**
 * super关键字:
 * 1.super理解为:父类的
 * 2.super可以用来调用:属性,方法,构造器
 *
 * 3.super的使用:调用属性和方法
 *
 *      ① 我们可以在子类的方法或构造器中.通常使用"super.属性"或"super.方法的方式显示的调用
 *      父类中声明的属性或方法.但是,通常情况下,我们习惯省略"super."
 *      ② 特殊情况:当子类和父类中定义了同名的属性时,我们要想在子类中调用父类中声明的属性,则必须显示的
 *      使用"supser.属性"的方式,表明调用的是父类中声明的属性.
 *      ③ 特殊情况:当子类重写了父类汇总的方法以后,我们要想在子类中调用父类中被重写的方法时,则必须显示的
 *  *   使用"supser.方法"的方式,表明调用的是父类中被重写的方法.
 *
 *      super调用构造器
 *      ① 我们可以在子类的构造器中显示的使用"super(形参列表)"的方式,调用父类中声明的指定的构造器
 *      ② "super(形参列表)"的使用,必须声明在子类构造器的首行!
 *      ③ 我们在类的构造器中,针对与"this(形参列表)"或"super(形参列表)"只能二选一,不能同事出现
 *      ④ 在构造器的首行,没有显示的声明"this(形参列表)"或"super(形参列表)",则默认调用的是父类中空参的构造器:super()
 *      ⑤ 在类的多个构造器中,至少有一个类的构造器中使用了"super(形参列表)",调用了父类中的构造器
 */
public class SuperTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.show();

        System.out.println();

        student.study();

        Student student1 = new Student("Tom", 23, "IT");
        student1.show();

        System.out.println("*************");
        Student student2 = new Student();
    }
}
