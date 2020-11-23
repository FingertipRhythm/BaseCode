package oop.oopexer1;

/**
 * 在PersonTest类中实例化Person类的对象b,调用setAge()和getAge()方法,体会Java的封装性.
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
//        person.age=2;//编译不通过

        person.setAge(12);
        System.out.println("年龄为:"+person.getAge());
    }
}
