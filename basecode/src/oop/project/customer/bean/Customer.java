package oop.project.customer.bean;

/**
 * @Description Customer为实体对象,用来封装客户信息
 * @author Pan
 * @version
 * @date 2021年4月17日
 */
public class Customer {
    private String name; //客户姓名
    private char gander; //性别
    private int age;    //年龄
    private String phone;//电话号码
    private String email;//电子邮箱

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGander() {
        return gander;
    }

    public void setGander(char gander) {
        this.gander = gander;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Customer() {
    }

    public Customer(String name, char gander, int age, String phone, String email) {
        this.name = name;
        this.gander = gander;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }
}
