package oop.oopexer4;

/**
 * a.声明三个私有的对象属性:firstName,lastName和account;
 * b.声明一个公有构造器,这个构造器带有两个代表对象属性的参数(f和l);
 * c.声明连个公有存储器来访问该对象属性,方法getFirstName和getLastName返回相应的属性.
 * d.声明setAccount方法来对account属性赋值.
 * e.声明getAccount方法以获取account属性.
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer() {
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }


}
