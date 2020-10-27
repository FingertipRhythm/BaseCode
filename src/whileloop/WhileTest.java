package whileloop;


/**
 *  * while循环结构的使用
 * 一.循环结构的4个要素
 * 1).初始化条件
 * 2).循环条件 -->是boolean类型
 * 3).循环体
 * 4).迭代条件
 * 
 * 二.while循环的结构
 * 1;
 * while(2){
 * 	3;
 * 	4;
 * }
 * 
 * 执行过程:1-2-3-4-2-3-4-...-2
 * 
 * 说明:
 * 1.写while循环千万小心不要丢了迭代条件.一旦丢了,就可能导致死循环.
 * 2.写程序,要避免出现死循环.
 * 3.for循环和while循环是可以相互转换的!
 * 	区别:for循环和while循环的初始化条件部分的作用范围不同.
 * 
 * 算法:有限性;
 *   
 * @author pan
 *
 */
public class WhileTest {

	public static void main(String[] args) {
		
		int i=1;
		while (i<=5) {
			System.out.println("Hello world!");
			i++;
		}
		
		//测试
		int num=1;
		//acbcbcb
		System.out.print("a");
		while (num<=3) {
			System.out.print("c");
			System.out.print("b");
			num++;
		}
		System.out.println();
		
		//例题:遍历100以内的偶数,输出所有偶数的和,以及偶数的个数
		int j=1;
		int count=0;
		int sum =0;  //记录所有偶数的和
		while (j<=100) {
			if(j%2==0) {
				System.out.println(j);
				sum+=j;
				count++;
				
			}
			j++;
		}
		System.out.println("\n总和为:"+sum);
		System.out.println("偶数的个数为:"+count);
	}

}
