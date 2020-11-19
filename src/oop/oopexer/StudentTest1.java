package oop.oopexer;

/**
 * 对象数组题目:
 * 定义类Student,包含三个属性:学号number(int),年级state(int),成绩score(int).
 * 创建20个学生对象,学号为1-20,年级和成绩都由随机数确定.
 * 问题一:打印出3年级(state值为3)的学生信息.
 * 问题二:使用冒泡排序an学生成绩排序,并遍历所有学生信息
 *
 * 提示:
 * 1) 生成随机数:Math.random(),返回值类型double;
 * 2) 四舍五入取整:Math.round(double d),返回值类型long.
 *
 * 此代码是对StudentTest.java的改进:将操作数组的功能封装到方法中.
 */
public class StudentTest1 {
    public static void main(String[] args) {
        StudentTest1 stu = new StudentTest1();
        //声明一个Student类型的数组
        Student1[] stus = new Student1[20];
        for (int i = 0; i < stus.length; i++) {
            //给数组元素赋值
            stus[i] = new Student1();
            //给Student对象的属性赋值
            stus[i].number=(i+1);
            //年级[1,6]
            stus[i].state = (int)(Math.random()*(6-1+1)+1);
            //成绩[0,100]
            stus[i].score = (int)(Math.random()*(100-1+1)+1);
        }
        //遍历学生数组
        stu.print(stus);
        System.out.println("***********************");

        //问题一:打印出3年级(state值为3)的学生信息.
        stu.searchState(stus,3);
        System.out.println("***********************");

        //问题二:使用冒泡排序an学生成绩排序,并遍历所有学生信息
        stu.sort(stus);
        stu.print(stus);

    }

    /**
     * 遍历Student1[]数组的操做
     * @param stu 要遍历的数组
     */
    public void print(Student1[] stu){
        for (Student1 student1 : stu) {
            System.out.println(student1.toString());
        }
    }

    /**
     * 查找Student1数组中指定年级的学生信息
     * @param stu 要查找的数组
     * @param state 要查找的年级
     */
    public void searchState(Student1[] stu,int state){
        for (int i = 0; i < stu.length; i++) {
            if (stu[i].state==state){
                System.out.println(stu[i].toString());
            }
        }
    }

    /**
     * 给Student1数组排序
     * @param stu 要排序的数组
     */
    public void sort(Student1[] stu){
        Student1 temp;
        for (int i = 0; i < stu.length-1; i++) {
            for (int j = 0; j < stu.length-1-i; j++) {
                if (stu[j].score>stu[j+1].score){
                    //如果需要换序,交换的是数组的元素:Student对象!
                    temp = stu[j];
                    stu[j] = stu[j+1];
                    stu[j+1] = temp;
                }
            }
        }
    }
}

class Student1{
    int number;  //学号
    int state;  //年级
    int score;  //成绩

    //显示学生信息的方法
    @Override
    public String toString() {
        return "Student1{" +
                "number=" + number +
                ", state=" + state +
                ", score=" + score +
                '}';
    }
}
