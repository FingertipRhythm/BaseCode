package oop.oopexer5;

/**
 * 1 addCustomer方法必须按照参数(姓,名)构造一个新的Customer对象,然后把它放到customer数组中.
 * 还必须numberOfCustomer属性的值加一
 * 2 getNumberOfCustomer方法返回numberOfCustomer属性值
 * 3 getCustomer方法返回与给出的index参数相关的客户.
 */
public class Bank {
    private Customer[] customers;//存放多个客户的数组
    private int numberOfCustomer;//记录客户的个数

    public Bank() {
        customers = new Customer[10];
    }


    /**
     * 添加客户
     * @param f
     * @param l
     */
    public void addCustomer(String f,String l){
        Customer customer = new Customer(f,l);

//        customers[numberOfCustomer]=customer;
//        numberOfCustomer++;

        customers[numberOfCustomer++]=customer;
    }

    /**
     * 获取指定位置上的客户
      * @param index
     * @return
     */
    public Customer getCustomers(int index) {
//        return customers[index]; //可能报异常
        if (index<numberOfCustomer && index>=0){
            return customers[index];
        }
        return null;

    }

    /**
     * 获取客户的个数
     * @return
     */
    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }
}
