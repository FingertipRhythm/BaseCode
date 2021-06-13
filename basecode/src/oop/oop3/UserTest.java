package oop.oop3;

/**
 * 总结:属性赋值的先后顺序
 *
 * ① 默认初始化值
 * ② 显式初始化
 * ③ 构造器中初始化
 *
 * ④ 通过"对象.方法"或"对象.属性"的方式,赋值
 *
 * 以上操作的先后顺序: ①->②->③->④
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new  User();

        System.out.println(u1.age);


        User u2 = new User(2);
        System.out.println(u2.age);
    }
}

class User {
    String name;
    int age=1;

    public User() {
    }

    public User(int age) {
        this.age = age;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}